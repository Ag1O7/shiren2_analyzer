package com.lsx3.shiren2.analyzer.floor;

public class FloorBasicData {
    private int floorNumber;
    private int dungeonName;
    private int nextFloor;
    private int dungeonFlag;
    private int floorLookupNumber;
    private int byte06;
    private int byte07;
    private int byte08;
    private int dungeonType;
    private int byte10;
    private int shuffleDungeonCode;
    private int bgmCode;

    public FloorBasicData(int floorNumber, int dungeonName, int nextFloor, int dungeonFlag, int floorLookupNumber, int byte06, int byte07, int byte08, int dungeonType, int byte10, int shuffleDungeonCode, int bgmCode) {
        this.floorNumber = floorNumber;
        this.dungeonName = dungeonName;
        this.nextFloor = nextFloor;
        this.dungeonFlag = dungeonFlag;
        this.floorLookupNumber = floorLookupNumber;
        this.byte06 = byte06;
        this.byte07 = byte07;
        this.byte08 = byte08;
        this.dungeonType = dungeonType;
        this.byte10 = byte10;
        this.shuffleDungeonCode = shuffleDungeonCode;
        this.bgmCode = bgmCode;
    }

    public String getRow() {
        return "|" + floorNumber
                + "|0x" + String.format("%02X", dungeonName)
                + "|" + nextFloor
                + "|0x" + String.format("%02X", dungeonFlag)
                + "|" + floorLookupNumber
                + "|0x" + String.format("%02X", byte06)
                + "|0x" + String.format("%02X", byte07)
                + "" + String.format("%02X", byte08)
                + "|0x" + String.format("%02X", dungeonType)
                + "|0x" + String.format("%02X", byte10)
                + "|0x" + String.format("%02X", shuffleDungeonCode)
                + "|0x" + String.format("%02X", bgmCode)
                + "|\r\n";
    }
}
