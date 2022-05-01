package net.dodian.uber.game.model;

import net.dodian.uber.game.Server;
import net.dodian.uber.game.model.entity.player.PlayerHandler;
import net.dodian.uber.game.model.item.GameItem;
import net.dodian.utilities.DbTables;

import java.io.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.CopyOnWriteArrayList;

import static net.dodian.DotEnvKt.*;
import static net.dodian.utilities.DatabaseKt.getDbStatement;

public class Login extends Thread {

    public Login() {
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void logTrade(int p1, int p2, CopyOnWriteArrayList<GameItem> items,
                                      CopyOnWriteArrayList<GameItem> otherItems, boolean trade) {
        try {
            int type = 0;
            if (!trade)
                type = 1;
            String query = "";
            query = "INSERT INTO " + DbTables.GAME_LOGS_PLAYER_TRADES + " SET p1=" + p1 + ", p2=" + p2 + ", type=" + type + ", date=" + (System.currentTimeMillis() / 1000);
            getDbStatement().executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet inserted = getDbStatement().getGeneratedKeys();
            inserted.next();
            int id = inserted.getInt(1);
            System.out.println("Auto-id: " + id);
            for (GameItem item : items) {
                getDbStatement().executeUpdate("INSERT INTO " + DbTables.GAME_LOGS_PLAYER + " SET id = " + id + ", pid=" + p1 + ", item="
                        + item.getId() + ", amount=" + item.getAmount());
            }
            for (GameItem item : otherItems) {
                getDbStatement().executeUpdate("INSERT INTO " + DbTables.GAME_LOGS_PLAYER + " SET id = " + id + ", pid=" + p2 + ", item="
                        + item.getId() + ", amount=" + item.getAmount());
            }
            //ystem.out.println("Trade " + id + " logged!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public synchronized void sendSession(int dbId, int clientPid, int elapsed, String connectedFrom, long start, long end) {
        try {
            getDbStatement().executeUpdate("INSERT INTO " + DbTables.GAME_PLAYER_SESSIONS + " SET dbid='" + dbId + "', client='" + clientPid + "', duration='" + elapsed
                    + "', hostname='" + connectedFrom + "',start='" + start + "',end='" + end + "',world='" + getGameWorldId() + "'");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public void sendChat(int dbId, int type, int absX, int absY, String chat) {
        try {
            // chat = chat.replace("'", "");
            // getDbStatement().executeUpdate("INSERT DELAYED into
            // uber3_chat(world,dbid,type,absX,absY,chat,timestamp) values(1," + dbId
            // + "," + type + ", " + absX + "," + absY + ",'" + chat + "', '" +
            // System.currentTimeMillis() + "')");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public synchronized void sendPlayers() {
        try {
            int players = PlayerHandler.getPlayerCount();
            getDbStatement().executeUpdate("UPDATE " + DbTables.GAME_WORLDS + " SET players = " + players + " WHERE id = " + Server.world);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }


    public static void deleteFromFile(String file, String name) {
        try {
            BufferedReader r = new BufferedReader(new FileReader(file));
            ArrayList<String> contents = new ArrayList<String>();
            while (true) {
                String line = r.readLine();
                if (line == null) {
                    break;
                } else {
                    line = line.trim();
                }
                if (!line.equalsIgnoreCase(name)) {
                    contents.add(line);
                }
            }
            r.close();
            BufferedWriter w = new BufferedWriter(new FileWriter(file));
            for (String line : contents) {
                w.write(line, 0, line.length());
                w.newLine();
            }
            w.flush();
            w.close();
        } catch (Exception e) {
        }
    }

    //start of starter logging

    public static ArrayList<String> starterRecieved1 = new ArrayList<String>();
    public static ArrayList<String> starterRecieved2 = new ArrayList<String>();
    public static Collection<String> bannedUid = new ArrayList<String>();

    public static void unUidBanUser(String name) {
        bannedUid.remove(name);
        deleteFromFile("./data/starters/UUIDBans.txt", name);
    }

    public static void addUidToBanList(String UUID) {
        bannedUid.add(UUID);
    }

    public static boolean isUidBanned(String UUID) {
        return bannedUid.contains(UUID);
    }

    public static void removeUidFromBanList(String UUID) {
        bannedUid.remove(UUID);
        deleteFromFile("./data/starters/UUIDBans.txt", UUID);
    }

    public static void banUid() {
        try {
            BufferedReader in = new BufferedReader(new FileReader("./data/starters/UUIDBans.txt"));
            String data;
            try {
                while ((data = in.readLine()) != null) {
                    addUidToBanList(data);
                    System.out.println(data);
                }
            } finally {
                in.close();
            }
        } catch (FileNotFoundException fnf) {
            // This file is never found during debug / dev testing so this quiets that exception - Nightleaf
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addUidToFile(String UUID) {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("./data/starters/UUIDBans.txt", true));
            try {
                out.newLine();
                out.write(UUID);
            } finally {
                out.close();
            }
        } catch (FileNotFoundException fnf) {
            // This file is never found during debug / dev testing so this quiets that exception - Nightleaf
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void appendStarters() {
        try {
            BufferedReader in = new BufferedReader(new FileReader("./data/starters/FirstStarterRecieved.txt"));
            String data = null;
            try {
                while ((data = in.readLine()) != null) {
                    starterRecieved1.add(data);
                }
            } finally {
                in.close();
            }
        } catch (FileNotFoundException fnf) {
            // This file is never found during debug / dev testing so this quiets that exception - Nightleaf
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void appendStarters2() {
        try {
            BufferedReader in = new BufferedReader(new FileReader("./data/starters/SecondStarterRecieved.txt"));
            String data = null;
            try {
                while ((data = in.readLine()) != null) {
                    starterRecieved2.add(data);
                }
            } finally {
                in.close();
            }
        } catch (FileNotFoundException fnf) {
            // This file is never found during debug / dev testing so this quiets that exception - Nightleaf
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addIpToStarter1(String IP) {
        starterRecieved1.add(IP);
        addIpToStarterList1(IP);
    }

    public static void addIpToStarter2(String IP) {
        starterRecieved2.add(IP);
        addIpToStarterList2(IP);
    }

    public static void addIpToStarterList1(String Name) {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("./data/starters/FirstStarterRecieved.txt", true));
            try {
                out.newLine();
                out.write(Name);
            } finally {
                out.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addIpToStarterList2(String Name) {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("./data/starters/SecondStarterRecieved.txt", true));
            try {
                out.newLine();
                out.write(Name);
            } finally {
                out.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean hasRecieved1stStarter(String IP) {
        if (starterRecieved1.contains(IP)) {
            return true;
        }
        return false;
    }

    public static boolean hasRecieved2ndStarter(String IP) {
        if (starterRecieved2.contains(IP)) {
            return true;
        }
        return false;
    }
}