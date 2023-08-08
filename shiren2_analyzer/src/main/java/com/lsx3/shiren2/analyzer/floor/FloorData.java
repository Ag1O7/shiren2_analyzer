package com.lsx3.shiren2.analyzer.floor;

public class FloorData {
    private int geography;
    private int columnLineNumber;
    private int rowLineNumber;
    private int roomNumber;
    private int lineWidth;
    private int monsterNumber;
    private int shopRate;
    private int shopItemTableType;
    private int monsterHouseRate;
    private int monsterHouseTableType;
    private int mazeRate;
    private int buriedGoldRate;
    private int allWaterRate;
    private int frozenRate;
    private int gitanRate;
    private int itemNumber;
    private int trapNumber;
    private int shopItemNumber;
    private int fellowRateRiku;
    private int fellowRateKirara;
    private int fellowRateAsuka;
    private int fellowRateHimakichi;
    private int fellowRateMaamo;
    private int fellowLevelTable;
    private int hengeItemTable;
    private int surprisePodItemTable;
    private int traderRate;
    private int traderItemTable;
    private int waterwayRate;
    private int lakeRate;
    private int shopKeeperLevel;
    private int shopTable;
    private int pondRate;
    private int islandRate;
    private int pillarRate;
    private int unbreakableWallRate;
    private int allFrozenRate;

    public FloorData(int geography, int columnLineNumber, int rowLineNumber, int roomNumber, int lineWidth, int monsterNumber, int shopRate, int shopItemTableType, int monsterHouseRate, int monsterHouseTableType, int mazeRate, int buriedGoldRate, int allWaterRate, int frozenRate, int gitanRate, int itemNumber, int trapNumber, int shopItemNumber, int fellowRateRiku, int fellowRateKirara, int fellowRateAsuka, int fellowRateHimakichi, int fellowRateMaamo, int fellowLevelTable, int hengeItemTable, int surprisePodItemTable, int traderRate, int traderItemTable, int waterwayRate, int lakeRate, int shopKeeperLevel, int shopTable, int pondRate, int islandRate, int pillarRate, int unbreakableWallRate, int allFrozenRate) {
        this.geography = geography;
        this.columnLineNumber = columnLineNumber;
        this.rowLineNumber = rowLineNumber;
        this.roomNumber = roomNumber;
        this.lineWidth = lineWidth;
        this.monsterNumber = monsterNumber;
        this.shopRate = shopRate;
        this.shopItemTableType = shopItemTableType;
        this.monsterHouseRate = monsterHouseRate;
        this.monsterHouseTableType = monsterHouseTableType;
        this.mazeRate = mazeRate;
        this.buriedGoldRate = buriedGoldRate;
        this.allWaterRate = allWaterRate;
        this.frozenRate = frozenRate;
        this.gitanRate = gitanRate;
        this.itemNumber = itemNumber;
        this.trapNumber = trapNumber;
        this.shopItemNumber = shopItemNumber;
        this.fellowRateRiku = fellowRateRiku;
        this.fellowRateKirara = fellowRateKirara;
        this.fellowRateAsuka = fellowRateAsuka;
        this.fellowRateHimakichi = fellowRateHimakichi;
        this.fellowRateMaamo = fellowRateMaamo;
        this.fellowLevelTable = fellowLevelTable;
        this.hengeItemTable = hengeItemTable;
        this.surprisePodItemTable = surprisePodItemTable;
        this.traderRate = traderRate;
        this.traderItemTable = traderItemTable;
        this.waterwayRate = waterwayRate;
        this.lakeRate = lakeRate;
        this.shopKeeperLevel = shopKeeperLevel;
        this.shopTable = shopTable;
        this.pondRate = pondRate;
        this.islandRate = islandRate;
        this.pillarRate = pillarRate;
        this.unbreakableWallRate = unbreakableWallRate;
        this.allFrozenRate = allFrozenRate;
    }

    public String getRow() {
        return "|" + geography
                + "|" + columnLineNumber
                + "|" + rowLineNumber
                + "|" + roomNumber
                + "|" + lineWidth
                + "|" + monsterNumber
                + "|" + shopRate
                + "|" + shopItemTableType
                + "|" + monsterHouseRate
                + "|" + monsterHouseTableType
                + "|" + mazeRate
                + "|" + buriedGoldRate
                + "|" + allWaterRate
                + "|" + frozenRate
                + "|" + gitanRate
                + "|" + itemNumber
                + "|" + trapNumber
                + "|" + shopItemNumber
                + "|" + fellowRateRiku
                + "|" + fellowRateKirara
                + "|" + fellowRateAsuka
                + "|" + fellowRateHimakichi
                + "|" + fellowRateMaamo
                + "|" + fellowLevelTable
                + "|" + hengeItemTable
                + "|" + surprisePodItemTable
                + "|" + traderRate
                + "|" + traderItemTable
                + "|" + waterwayRate
                + "|" + lakeRate
                + "|" + shopKeeperLevel
                + "|" + shopTable
                + "|" + pondRate
                + "|" + islandRate
                + "|" + pillarRate
                + "|" + unbreakableWallRate
                + "|" + allFrozenRate
                + "|\r\n";
    }

}
