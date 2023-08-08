package com.lsx3.shiren2.analyzer.enums;

import com.lsx3.shiren2.analyzer.address.PhysicalAddress;

public enum DungeonIndexAddress {

    DEBUG(DungeonCode.getDungeonCode(0x00), new PhysicalAddress(0x115B5C)),
    SHUTEN_TRAIL_EASY(DungeonCode.getDungeonCode(0x01), new PhysicalAddress(0x115B74)),
    SHUTEN_TRAIL_MID(DungeonCode.getDungeonCode(0x02), new PhysicalAddress(0x115B8C)),
    SHUTEN_TRAIL_HARD(DungeonCode.getDungeonCode(0x03), new PhysicalAddress(0x115BA4)),
    ONIGASHIMA(DungeonCode.getDungeonCode(0x04), new PhysicalAddress(0x115BBC)),
    ROAD_TO_END(DungeonCode.getDungeonCode(0x05), new PhysicalAddress(0x115BD4)),
    HALFWAY_WELL(DungeonCode.getDungeonCode(0x06), new PhysicalAddress(0x115BEC)),
    HIDDEN_HOLE(DungeonCode.getDungeonCode(0x07), new PhysicalAddress(0x115C04)),
    SEALED_ROOM(DungeonCode.getDungeonCode(0x08), new PhysicalAddress(0x115C1C)),
    DOJO(DungeonCode.getDungeonCode(0x09), new PhysicalAddress(0x115C34)),
    WAREHOUSE(DungeonCode.getDungeonCode(0x0A), new PhysicalAddress(0x115C4C)),
    SMALL_VALLEY(DungeonCode.getDungeonCode(0x0B), new PhysicalAddress(0x115C64)),
    SHUTEN_TRAIL_HARD_GOLDEN_INTERVAL(DungeonCode.getDungeonCode(0x0C), new PhysicalAddress(0x115C7C)),
    ONIGASHIMA_GOLDEN_INTERVAL(DungeonCode.getDungeonCode(0x0D), new PhysicalAddress(0x115C94)),
    ROAD_TO_END_GOLDEN_INTERVAL1(DungeonCode.getDungeonCode(0x0E), new PhysicalAddress(0x115CAC)),
    ROAD_TO_END_GOLDEN_INTERVAL2(DungeonCode.getDungeonCode(0x0F), new PhysicalAddress(0x115CC4)),
    ROAD_TO_END_GOLDEN_INTERVAL3(DungeonCode.getDungeonCode(0x10), new PhysicalAddress(0x115CDC)),
    HALFWAY_WELL_GOLDEN_INTERVAL(DungeonCode.getDungeonCode(0x11), new PhysicalAddress(0x115CF4)),
    SEALED_ROOM_GOLDEN_INTERVAL1(DungeonCode.getDungeonCode(0x12), new PhysicalAddress(0x115D0C)),
    SEALED_ROOM_GOLDEN_INTERVAL2(DungeonCode.getDungeonCode(0x13), new PhysicalAddress(0x115D24)),
    DEBUG2(DungeonCode.getDungeonCode(0x14), new PhysicalAddress(0x115D3C)),
    ;

    private final DungeonCode dungeonCode;
    private final PhysicalAddress dungeonIndexFromAddress;

    DungeonIndexAddress(DungeonCode dungeonCode, PhysicalAddress dungeonIndexFromAddress) {
        this.dungeonCode = dungeonCode;
        this.dungeonIndexFromAddress = dungeonIndexFromAddress;
    }

    public PhysicalAddress getDungeonIndexFromAddress() {
        return dungeonIndexFromAddress;
    }
}
