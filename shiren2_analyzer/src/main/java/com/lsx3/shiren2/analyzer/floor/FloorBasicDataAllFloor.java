package com.lsx3.shiren2.analyzer.floor;

import com.lsx3.shiren2.analyzer.dto.DungeonIndex;

import java.util.ArrayList;
import java.util.List;

public class FloorBasicDataAllFloor {
    protected DungeonIndex dungeonIndex;
    private List<FloorBasicData> floorBasicDataList;

    public FloorBasicDataAllFloor(DungeonIndex dungeonIndex, byte[] rom) {
        this.dungeonIndex = dungeonIndex;
        this.floorBasicDataList = analyzeFloorData(rom);

    }

    private List<FloorBasicData> analyzeFloorData(byte[] rom) {
        List<FloorBasicData> floorBasicData = new ArrayList<>();
        int readAddress = dungeonIndex.getBasicFloorDataIndex().getPhysicalAddress();
        for (int i = 0; i < dungeonIndex.getFloorLimit(); i++) {
            floorBasicData.add(analyzeFloorDataOneFloor(rom, readAddress));
            readAddress += 12;
        }

        return floorBasicData;
    }

    private FloorBasicData analyzeFloorDataOneFloor(byte[] rom, int readAddress) {
        int floorNumber = Byte.toUnsignedInt(rom[readAddress]);
        int dungeonName = Byte.toUnsignedInt(rom[++readAddress]);
        int nextFloor = Byte.toUnsignedInt(rom[++readAddress]);
        int dungeonFlag = Byte.toUnsignedInt(rom[++readAddress]);
        int byte05 = Byte.toUnsignedInt(rom[++readAddress]);
        int byte06 = Byte.toUnsignedInt(rom[++readAddress]);
        int byte07 = Byte.toUnsignedInt(rom[++readAddress]);
        int byte08 = Byte.toUnsignedInt(rom[++readAddress]);
        int dungeonType = Byte.toUnsignedInt(rom[++readAddress]);
        int byte10 = Byte.toUnsignedInt(rom[++readAddress]);
        int shuffleDungeonCode = Byte.toUnsignedInt(rom[++readAddress]);
        int bgmCode = Byte.toUnsignedInt(rom[++readAddress]);

        FloorBasicData floorData = new FloorBasicData(floorNumber, dungeonName, nextFloor, dungeonFlag, byte05, byte06
                , byte07, byte08, dungeonType, byte10, shuffleDungeonCode, bgmCode);

        return floorData;
    }

    public StringBuilder makeTable() {
        StringBuilder sb = new StringBuilder();

        sb.append(makeH2Title());
        sb.append(makeBody());

        return sb;
    }

    protected String makeH2Title() {
        return "** " + dungeonIndex.getDungeonCode().getDungeonName() + "\n";
    }

    protected StringBuilder makeBody() {
        StringBuilder sb = new StringBuilder();
        String header = "|表階|階名|次階|フ型|怪物|06|イベント|地形型|10|階型|音楽|h\n";
        sb.append(header);
        for (FloorBasicData floorBasicData : floorBasicDataList) {
            sb.append(floorBasicData.getRow());
        }
        sb.append("\n");

        return sb;
    }
}
