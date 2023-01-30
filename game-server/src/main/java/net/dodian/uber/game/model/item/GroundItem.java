package net.dodian.uber.game.model.item;

import net.dodian.uber.game.Server;
import net.dodian.uber.game.model.Position;
import net.dodian.uber.game.model.player.packets.outgoing.CreateGroundItem;

public class GroundItem {
    public int x, y, z, id, amount, dropper, playerId = -1, npcId = -1;
    public long dropped = 0;
    public boolean visible = false, npc = false;
    public boolean taken = false, canDespawn = true;
    public int timeDespawn = 5000, timeDisplay = 5000; //60k = 60 seconds!

    public GroundItem(int x, int y, int z, int id, int amount, int dropper, int npcId) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.id = id;
        this.amount = amount;
        this.dropper = dropper;
        this.npc = npcId >= 0 ? true : false;
        if (npc)
            this.npcId = npcId;
        this.canDespawn = true;
        dropped = System.currentTimeMillis();
        if (dropper > 0 && Server.playerHandler.validClient(dropper)) {
            Server.playerHandler.getClient(dropper).send(new CreateGroundItem(new GameItem(id, amount), new Position(x, y, z)));
            playerId = Server.playerHandler.getClient(dropper).dbId;
        }
    }

    public GroundItem(int x, int y, int id, int amount, int display) {
        this.x = x;
        this.y = y;
        this.id = id;
        this.amount = amount;
        this.canDespawn = false;
        this.timeDisplay = display;
        dropped = System.currentTimeMillis();
    }

    public void setTaken(boolean b) {
        this.taken = b;
    }

    public boolean isTaken() {
        return taken;
    }

}
