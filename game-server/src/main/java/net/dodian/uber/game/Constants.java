package net.dodian.uber.game;

public class Constants {

    public static final int maxPlayers = 2048;

    public static int[] logs = {1521, 1519, 1517, 1515, 1513};
    public static int[] shortbows = {54, 60, 64, 68, 72};
    public static int[] shortreq = {20, 35, 50, 65, 80};
    public static int[] shortexp = {102, 198, 300, 408, 504};
    public static int[] shortbow = {843, 849, 853, 857, 861};
    public static int[] longbows = {56, 58, 62, 66, 70};
    public static int[] longreq = {25, 40, 55, 70, 85};
    public static int[] longexp = {150, 252, 348, 450, 552};
    public static int[] longbow = {845, 847, 851, 855, 859};
    public static int[] heads = {39, 40, 41, 42, 43, 44};
    public static int[] arrows = {882, 884, 886, 888, 890, 892};
    public static int[] required = {1, 15, 30, 45, 60, 75};
    public static int[] xp = {20, 38, 75, 113, 150, 188};
    public static int[] darttip = {819, 820, 821, 822, 823, 824};
    public static int[] darts = {806, 807, 808, 809, 810, 811};
    public static int[] darttip_required = {1, 22, 37, 52, 67, 81};
    public static int[] darttip_xp = {18, 38, 75, 112, 150, 188};

    public static int[] leathers = {1745, 2505, 2507, 2509};
    public static int[] leatherExp = {97, 158, 246, 372};
    public static int[] gloves = {1065, 2487, 2489, 2491};
    public static int[] gloveLevels = {50, 62, 73, 82};
    public static int[] legs = {1099, 2493, 2495, 2497};
    public static int[] legLevels = {54, 66, 76, 85};
    public static int[] chests = {1135, 2499, 2501, 2503};
    public static int[] chestLevels = {58, 70, 79, 88};

    public static int smithing_frame[][][] = {
            {{1205, 1, 1, 1, 1125, 1094}, {1351, 1, 1, 1, 1126, 1091}, {1422, 1, 2, 1, 1129, 1093},
                    {1139, 1, 3, 1, 1127, 1102}, {1277, 1, 3, 1, 1128, 1085}, {819, 10, 4, 1, 1124, 1107},
                    {4819, 15, 4, 1, 13357, 13358}, {39, 15, 5, 1, 1130, 1108}, {1321, 1, 5, 2, 1116, 1087},
                    {1291, 1, 6, 2, 1089, 1086}, {1155, 1, 7, 2, 1113, 1103}, {864, 5, 7, 1, 1131, 1106},
                    {1173, 1, 8, 2, 1114, 1104}, {1337, 1, 9, 3, 1118, 1083}, {1375, 1, 10, 3, 1095, 1092},
                    {1103, 1, 11, 3, 1109, 1098}, {1189, 1, 12, 3, 1115, 1105}, {3095, 1, 13, 2, 8428, 8429},
                    {1307, 1, 14, 3, 1090, 1088}, {1087, 1, 16, 3, 1111, 1100}, {1075, 1, 16, 3, 1110, 1099},
                    {1117, 1, 18, 5, 1112, 1101}, /* Specials */{1794, 1, 4, 1, 1132, 1096}},
            {{1203, 1, 15, 1, 1125, 1094}, {1349, 1, 16, 1, 1126, 1091}, {1420, 1, 17, 1, 1129, 1093},
                    {1137, 1, 18, 1, 1127, 1102}, {1279, 1, 19, 1, 1128, 1085}, {820, 10, 19, 1, 1124, 1107},
                    {4820, 15, 19, 1, 13357, 13358}, {40, 15, 20, 1, 1130, 1108}, {1323, 1, 20, 2, 1116, 1087},
                    {1293, 1, 21, 2, 1089, 1086}, {1153, 1, 22, 2, 1113, 1103}, {863, 5, 22, 1, 1131, 1106},
                    {1175, 1, 23, 2, 1114, 1104}, {1335, 1, 24, 3, 1118, 1083}, {1363, 1, 25, 3, 1095, 1092},
                    {1101, 1, 26, 3, 1109, 1098}, {1191, 1, 27, 3, 1115, 1105}, {3096, 1, 28, 2, 8428, 8429},
                    {1309, 1, 29, 3, 1090, 1088}, {1081, 1, 31, 3, 1111, 1100}, {1067, 1, 31, 3, 1110, 1099},
                    {1115, 1, 33, 5, 1112, 1101}, /* Specials */{4540, 1, 26, 1, 11459, 11461}},
            {{1207, 1, 30, 1, 1125, 1094}, {1353, 1, 31, 1, 1126, 1091}, {1424, 1, 32, 1, 1129, 1093},
                    {1141, 1, 33, 1, 1127, 1102}, {1281, 1, 34, 1, 1128, 1085}, {821, 10, 34, 1, 1124, 1107},
                    {1539, 15, 34, 1, 13357, 13358}, {41, 15, 35, 1, 1130, 1108}, {1325, 1, 35, 2, 1116, 1087},
                    {1295, 1, 36, 2, 1089, 1086}, {1157, 1, 37, 2, 1113, 1103}, {865, 5, 37, 1, 1131, 1106},
                    {1177, 1, 38, 2, 1114, 1104}, {1339, 1, 39, 3, 1118, 1083}, {1365, 1, 40, 3, 1095, 1092},
                    {1105, 1, 41, 3, 1109, 1098}, {1193, 1, 42, 3, 1115, 1105}, {3097, 1, 43, 2, 8428, 8429},
                    {1311, 1, 44, 3, 1090, 1088}, {1083, 1, 46, 3, 1111, 1100}, {1069, 1, 46, 3, 1110, 1099},
                    {1119, 1, 48, 5, 1112, 1101}, /* Specials */{4544, 1, 49, 1, 11459, 11461},
                    {2370, 1, 36, 1, 1135, 1134}},
            {{1209, 1, 50, 1, 1125, 1094}, {1355, 1, 51, 1, 1126, 1091}, {1428, 1, 52, 1, 1129, 1093},
                    {1143, 1, 53, 1, 1127, 1102}, {1285, 1, 53, 1, 1128, 1085}, {822, 10, 54, 1, 1124, 1107},
                    {4822, 15, 54, 1, 13357, 13358}, {42, 15, 55, 1, 1130, 1108}, {1329, 1, 55, 2, 1116, 1087},
                    {1299, 1, 56, 2, 1089, 1086}, {1159, 1, 57, 2, 1113, 1103}, {866, 5, 57, 1, 1131, 1106},
                    {1181, 1, 58, 2, 1114, 1104}, {1343, 1, 59, 3, 1118, 1083}, {1369, 1, 60, 3, 1095, 1092},
                    {1109, 1, 61, 3, 1109, 1098}, {1197, 1, 62, 3, 1115, 1105}, {3099, 1, 63, 2, 8428, 8429},
                    {1315, 1, 64, 3, 1090, 1088}, {1085, 1, 66, 3, 1111, 1100}, {1071, 1, 66, 3, 1110, 1099},
                    {1121, 1, 68, 5, 1112, 1101}},
            {{1211, 1, 70, 1, 1125, 1094}, {1357, 1, 71, 1, 1126, 1091}, {1430, 1, 72, 1, 1129, 1093},
                    {1145, 1, 73, 1, 1127, 1102}, {1287, 1, 74, 1, 1128, 1085}, {823, 10, 74, 1, 1124, 1107},
                    {4823, 15, 74, 1, 13357, 13358}, {43, 15, 75, 1, 1130, 1108}, {1331, 1, 75, 2, 1116, 1087},
                    {1301, 1, 76, 2, 1089, 1086}, {1161, 1, 77, 2, 1113, 1103}, {867, 5, 77, 1, 1131, 1106},
                    {1183, 1, 78, 2, 1114, 1104}, {1345, 1, 79, 3, 1118, 1083}, {1371, 1, 80, 3, 1095, 1092},
                    {1111, 1, 81, 3, 1109, 1098}, {1199, 1, 82, 3, 1115, 1105}, {3100, 1, 83, 2, 8428, 8429},
                    {1317, 1, 84, 3, 1090, 1088}, {1091, 1, 86, 3, 1111, 1100}, {1073, 1, 86, 3, 1110, 1099},
                    {1123, 1, 88, 5, 1112, 1101}},
            {{1213, 1, 85, 1, 1125, 1094}, {1359, 1, 86, 1, 1126, 1091}, {1432, 1, 87, 1, 1129, 1093},
                    {1147, 1, 88, 1, 1127, 1102}, {1289, 1, 89, 1, 1128, 1085}, {824, 10, 89, 1, 1124, 1107},
                    {4824, 15, 89, 1, 13357, 13358}, {44, 15, 90, 1, 1130, 1108}, {1333, 1, 90, 2, 1116, 1087},
                    {1303, 1, 91, 2, 1089, 1086}, {1163, 1, 92, 2, 1113, 1103}, {868, 5, 92, 1, 1131, 1106},
                    {1185, 1, 93, 2, 1114, 1104}, {1347, 1, 94, 3, 1118, 1083}, {1373, 1, 95, 3, 1095, 1092},
                    {1113, 1, 96, 3, 1109, 1098}, {1201, 1, 97, 3, 1115, 1105}, {3101, 1, 98, 2, 8428, 8429},
                    {1319, 1, 99, 3, 1090, 1088}, {1093, 1, 99, 3, 1111, 1100}, {1079, 1, 99, 3, 1110, 1099},
                    {1127, 1, 99, 5, 1112, 1101}}};
    public static int SmithingItems[][] = new int[5][5];

    public static final int PACKET_SIZES[] = {0, 0, 0, 1, -1, 0, 0, 0, 0, 0, // 0
            0, 0, 0, 0, 8, 0, 6, 2, 2, 0, // 10-19
            0, 2, 0, 6, 0, 12, 0, 0, 0, 0, // 20-29
            0, 0, 0, 0, 0, 8, 4, 0, 0, 2, // 30
            2, 6, 0, 6, 0, -1, 0, 0, 0, 0, // 40
            0, 0, 0, 12, 0, 0, 0, 8, 0, 0, // 50
            0, 8, 0, 0, 0, 0, 0, 0, 0, 0, // 60
            6, 0, 2, 2, 8, 6, 0, -1, 0, 6, // 70
            0, 0, 0, 0, 0, 1, 4, 6, 0, 0, // 80
            0, 0, 0, 0, 0, 3, 0, 0, -1, 0, // 90
            0, 13, 0, -1, 0, 0, 0, 0, 0, 0, // 100
            0, 0, 0, 0, 0, 0, 0, 6, 0, 0, // 110
            1, 0, 6, 0, 0, 0, -1, 0, 2, 6, // 120
            0, 4, 6, 8, 0, 6, 0, 0, 0, 2, // 130
            0, 0, 0, 0, 0, 6, 0, 0, 0, 0, // 140
            0, 0, 1, 2, 0, 2, 6, 0, 0, 0, // 150
            0, 0, 0, 0, -1, -1, 0, 0, 0, 0, // 160
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, // 170
            0, 8, 0, 3, 0, 2, 0, 0, 8, 1, // 180
            0, 0, 12, 0, 0, 0, 0, 0, 0, 0, // 190
            2, 0, 0, 0, 0, 0, 0, 0, 4, 0, // 200
            4, 0, 0, 0, 7, 8, 0, 0, 10, 0, // 210
            0, 0, 0, 0, 0, 0, -1, 0, 6, 0, // 220
            1, 0, 0, 0, 6, 0, 6, 8, 1, 0, // 230
            0, 4, 0, 0, 0, 0, -1, 0, -1, 4, // 240
            0, 0, 6, 6, 0, 0, 0 // 250
    };
}