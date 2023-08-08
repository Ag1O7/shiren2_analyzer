package com.lsx3.shiren2.analyzer.enums;

public enum DungeonCode {
    //    DEBUG(0x00, "デバッグ", 0x00, 0x00),
    DEBUG(0x00, "デバッグ", 5, true),
    SHUTEN_TRAIL_EASY(0x01, "シュテン山道初級", 12, true),
    SHUTEN_TRAIL_MID(0x02, "シュテン山道中級", 15, true),
    SHUTEN_TRAIL_HARD(0x03, "シュテン山道上級", 18, true),
    ONIGASHIMA(0x04, "鬼ヶ島", 25, true),
    ROAD_TO_END(0x05, "最果てへの道", 99, true),
    HALFWAY_WELL(0x06, "中腹の井戸", 99, true),
    HIDDEN_HOLE(0x07, "神社の隠し穴", 99, true),
    SEALED_ROOM(0x08, "あかずの間", 99, true),
    DOJO(0x09, "けいこ場", 5, true),
    WAREHOUSE(0x0A, "倉庫", 5, true),
    SMALL_VALLEY(0x0B, "小さな谷", 5, true),
    SHUTEN_TRAIL_HARD_GOLDEN_INTERVAL(0x0C, "黄金の間(シュテン山道上級)", 5, true),
    ONIGASHIMA_GOLDEN_INTERVAL(0x0D, "黄金の間(鬼ヶ島)", 5, true),
    ROAD_TO_END_GOLDEN_INTERVAL1(0x0E, "黄金の間(最果てへの道低層)", 5, true),
    ROAD_TO_END_GOLDEN_INTERVAL2(0x0F, "黄金の間(最果てへの道中層)", 5, true),
    ROAD_TO_END_GOLDEN_INTERVAL3(0x10, "黄金の間(最果てへの道深層)", 5, true),
    HALFWAY_WELL_GOLDEN_INTERVAL(0x11, "黄金の間(中腹の井戸)", 5, true),
    SEALED_ROOM_GOLDEN_INTERVAL1(0x12, "黄金の間(あかずの間低層)", 5, true),
    SEALED_ROOM_GOLDEN_INTERVAL2(0x13, "黄金の間(あかずの間深層)", 5, true),
    NATANE(0x14, "ナタネ村", 5, true),
    STORE(0x21, "店", 10, false),
    GYOSHO(0x22, "行商人", 10, false),
    OTHER(0x23, "その他", 13, false),
    ;

    private final int dungeonCode;
    private final String dungeonName;
    private final int floorNumber;
    private final boolean isDungeon;

    DungeonCode(int dungeonCode, String dungeonName, int floorNumber, boolean isDungeon) {
        this.dungeonCode = dungeonCode;
        this.dungeonName = dungeonName;
        this.floorNumber = floorNumber;
        this.isDungeon = isDungeon;
    }

    public int getDungeonCode() {
        return dungeonCode;
    }

    public String getDungeonName() {
        return dungeonName;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public boolean isDungeon() {
        return isDungeon;
    }

    public static DungeonCode getDungeonCode(final int code) {
        DungeonCode[] dungeonCodes = DungeonCode.values();
        for (DungeonCode dungeonCode : dungeonCodes) {
            if (dungeonCode.getDungeonCode() == code) {
                return dungeonCode;
            }
        }
        return null;
    }
}
