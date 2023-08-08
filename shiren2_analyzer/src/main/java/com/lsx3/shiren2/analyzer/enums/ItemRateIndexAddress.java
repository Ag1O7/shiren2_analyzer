package com.lsx3.shiren2.analyzer.enums;

public enum ItemRateIndexAddress implements IRateIndexAddress {
    //    DEBUG(0x00, "デバッグ", 0x00, 0x00),
//    SHUTEN_TRAIL_EASY(DungeonCode.getDungeonCode(0x01), 0x198F10),
//    SHUTEN_TRAIL_MID(DungeonCode.getDungeonCode(0x02), 0x1998EC),
//    SHUTEN_TRAIL_HARD(DungeonCode.getDungeonCode(0x03), 0x19A648),
//    ONIGASHIMA(DungeonCode.getDungeonCode(0x04), 0x19C300),
//    ROAD_TO_END(DungeonCode.getDungeonCode(0x05), 0x1A5FC4),
//    HALFWAY_WELL(DungeonCode.getDungeonCode(0x06), 0x1A9144),
//    HIDDEN_HOLE(DungeonCode.getDungeonCode(0x07), 0x1AC108),
//    SEALED_ROOM(DungeonCode.getDungeonCode(0x08), 0x1B0FF0),
//    DOJO(DungeonCode.getDungeonCode(0x09), 0x1B11E4),
//    WAREHOUSE(DungeonCode.getDungeonCode(0x0A), 0x1B1264),
//    SMALL_VALLEY(DungeonCode.getDungeonCode(0x0B), 0x1B143C),
//    SHUTEN_TRAIL_HARD_GOLDEN_INTERVAL(DungeonCode.getDungeonCode(0x0C), 0x1B166C),
//    ONIGASHIMA_GOLDEN_INTERVAL(DungeonCode.getDungeonCode(0x0D), 0x1B1948),
//    ROAD_TO_END_GOLDEN_INTERVAL1(DungeonCode.getDungeonCode(0x0E), 0x1B1BB8),
//    ROAD_TO_END_GOLDEN_INTERVAL2(DungeonCode.getDungeonCode(0x0F), 0x1B1E28),
//    ROAD_TO_END_GOLDEN_INTERVAL3(DungeonCode.getDungeonCode(0x10), 0x1B2090),
//    HALFWAY_WELL_GOLDEN_INTERVAL(DungeonCode.getDungeonCode(0x11), 0x1B21DC),
//    SEALED_ROOM_GOLDEN_INTERVAL1(DungeonCode.getDungeonCode(0x12), 0x1B236C),
//    SEALED_ROOM_GOLDEN_INTERVAL2(DungeonCode.getDungeonCode(0x13), 0x1B2510),
    STORE(DungeonCode.getDungeonCode(0x21), 0x1B7C90),
    GYOSHO(DungeonCode.getDungeonCode(0x22), 0x1B8408),
    OTHER(DungeonCode.getDungeonCode(0x23), 0x1B8B60),
    ;

    private final DungeonCode dungeonCode;
    private final int itemTypeRateIndexFromPhysicalAddress;

    ItemRateIndexAddress(DungeonCode dungeonCode, int itemTypeRateIndexFromPhysicalAddress) {
        this.dungeonCode = dungeonCode;
        this.itemTypeRateIndexFromPhysicalAddress = itemTypeRateIndexFromPhysicalAddress;
    }

    public DungeonCode getDungeonCode() {
        return dungeonCode;
    }

    public int getRateIndexFromAddress() {
        return itemTypeRateIndexFromPhysicalAddress;
    }

}
