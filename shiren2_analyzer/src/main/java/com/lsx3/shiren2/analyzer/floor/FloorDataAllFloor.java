package com.lsx3.shiren2.analyzer.floor;

import com.lsx3.shiren2.analyzer.dto.DungeonIndex;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class FloorDataAllFloor {
    protected DungeonIndex dungeonIndex;
    private List<FloorData> floorDataList;

    public FloorDataAllFloor(DungeonIndex dungeonIndex, byte[] rom) {
        this.dungeonIndex = dungeonIndex;
        this.floorDataList = analyzeFloorData(rom);

    }

    private List<FloorData> analyzeFloorData(byte[] rom) {
        List<FloorData> floorData = new ArrayList<>();
        int readAddress = dungeonIndex.getFloorDataIndex().getPhysicalAddress();
        for (int i = 0; i < dungeonIndex.getDungeonCode().getFloorNumber(); i++) {
            floorData.add(analyzeFloorDataOneFloor(rom, readAddress));
            readAddress += 38;
        }

        return floorData;
    }

    private FloorData analyzeFloorDataOneFloor(byte[] rom, int readAddress) {
        int geography = rom[readAddress];
        int columnLineNumber = rom[++readAddress];
        int rowLineNumber = rom[++readAddress];
        int roomNumber = rom[++readAddress];
        int lineWidth = rom[++readAddress];
        int monsterNumber = rom[++readAddress];
        int shopRate = rom[++readAddress];
        int shopItemTableType = rom[++readAddress];
        int monsterHouseRate = rom[++readAddress];
        int monsterHouseTableType = rom[++readAddress];
        int mazeRate = rom[++readAddress];
        int buriedGoldRate = rom[++readAddress];
        int allWaterRate = rom[++readAddress];
        int frozenRate = rom[++readAddress];

        byte[] addressArray = {(byte) 0x00, (byte) 0x00, rom[++readAddress], rom[++readAddress]};
        int gitanRate = ByteBuffer.wrap(addressArray).getInt();

        int itemNumber = rom[++readAddress];
        int trapNumber = rom[++readAddress];
        int shopItemNumber = rom[++readAddress];
        int fellowRateRiku = rom[++readAddress];
        int fellowRateKirara = rom[++readAddress];
        int fellowRateAsuka = rom[++readAddress];
        int fellowRateHimakichi = rom[++readAddress];
        int fellowRateMaamo = rom[++readAddress];
        int fellowLevelTable = rom[++readAddress];
        int hengeItemTable = rom[++readAddress];
        int surprisePodItemTable = rom[++readAddress];
        int traderRate = rom[++readAddress];
        int traderItemTable = rom[++readAddress];
        int waterwayRate = rom[++readAddress];
        int lakeRate = rom[++readAddress];
        int shopKeeperLevel = rom[++readAddress];
        int shopTable = rom[++readAddress];
        int pondRate = rom[++readAddress];
        int islandRate = rom[++readAddress];
        int pillarRate = rom[++readAddress];
        int unbreakableWallRate = rom[++readAddress];
        int allFrozenRate = rom[++readAddress];
        FloorData floorData = new FloorData(geography, columnLineNumber, rowLineNumber, roomNumber, lineWidth, monsterNumber, shopRate, shopItemTableType, monsterHouseRate, monsterHouseTableType, mazeRate, buriedGoldRate, allWaterRate, frozenRate, gitanRate, itemNumber, trapNumber, shopItemNumber, fellowRateRiku, fellowRateKirara, fellowRateAsuka, fellowRateHimakichi, fellowRateMaamo, fellowLevelTable, hengeItemTable, surprisePodItemTable, traderRate, traderItemTable, waterwayRate, lakeRate, shopKeeperLevel, shopTable, pondRate, islandRate, pillarRate, unbreakableWallRate, allFrozenRate);

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
        int floorNumber = 1;
        String header = "|階|地|縦|横|部|幅|モ|店|店ア&br;表|MH|MH&br;種類|迷|埋|水|氷|ギ|ア|罠|店ア|>|>|>|>|仲間|LV|変|ビ|行商|行ア&br;表|水路|湖|店主|店表|池|島|柱|壁|氷&br;部屋|h\n";
        sb.append(header);
        for (FloorData floorData : floorDataList) {
            sb.append("|~" + floorNumber++);
            sb.append(floorData.getRow());
        }
        sb.append("\n");

        return sb;
    }
}
