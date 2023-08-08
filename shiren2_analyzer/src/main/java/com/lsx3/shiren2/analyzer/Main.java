package com.lsx3.shiren2.analyzer;

import com.lsx3.shiren2.analyzer.address.InnerRomAddress;
import com.lsx3.shiren2.analyzer.address.PhysicalAddress;
import com.lsx3.shiren2.analyzer.dto.DungeonIndex;
import com.lsx3.shiren2.analyzer.dto.Rom;
import com.lsx3.shiren2.analyzer.floor.FloorBasicDataAllFloor;
import com.lsx3.shiren2.analyzer.floor.FloorDataAllFloor;
import com.lsx3.shiren2.analyzer.monster.MonsterDataAll;
import com.lsx3.shiren2.analyzer.rate.IRate;
import com.lsx3.shiren2.analyzer.rate.item.ItemDungeonRate;
import com.lsx3.shiren2.analyzer.rate.item.trap.TrapDungeonRate;
import com.lsx3.shiren2.analyzer.rate.monster.MonsterDungeonRate;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // read rom file
        Rom rom = new Rom();

        // analyze rom file
        List<DungeonIndex> dungeonIndices = rom.analyzeDungeonIndex();
        List<ItemDungeonRate> itemDungeonRateList = new ArrayList<>();
        List<TrapDungeonRate> trapDungeonRateList = new ArrayList<>();
        List<MonsterDungeonRate> monsterRateList = new ArrayList<>();
        List<FloorDataAllFloor> floorDataList = new ArrayList<>();
        List<FloorBasicDataAllFloor> floorBasicDataList = new ArrayList<>();
        MonsterDataAll monsterDataAll = rom.analyzeMonsterData();

        for (DungeonIndex dungeonIndex : dungeonIndices) {
            itemDungeonRateList.add(rom.analyzeItemRate(dungeonIndex));
            trapDungeonRateList.add(rom.analyzeTrapRate(dungeonIndex));
            monsterRateList.add(rom.analyzeMonsterRate(dungeonIndex));
            floorDataList.add(rom.analyzeFloorData(dungeonIndex));
            floorBasicDataList.add(rom.analyzeFloorBasicData(dungeonIndex));
            System.out.println(String.format("FD:0%x", dungeonIndex.getFloorDataIndex().getPhysicalAddress()));

        }

        // shop, and others
        List<ItemDungeonRate> itemDungeonRateListFromEnums = rom.analyzeItemRate();

        // output table
        outputFloorIndices("Indices.txt", dungeonIndices);
        outputTable("ItemRate.txt", itemDungeonRateList);
        outputTable("TrapRate.txt", trapDungeonRateList);
        outputTable("MonsterRate.txt", monsterRateList);
        outputTable("ItemRateShop.txt", itemDungeonRateListFromEnums);
        outputFloorDataTable("FloorData.txt", floorDataList);
        outputFloorBasicDataTable("FloorBasicData.txt", floorBasicDataList);
        outputMonsterDataTable("MonsterData.txt", monsterDataAll);

        // test
        InnerRomAddress innerRomAddress = new InnerRomAddress(0x02EE12EE2);
        System.out.println(String.format("PhysicalAddress:%x", innerRomAddress.getPhysicalAddress()));
        PhysicalAddress physicalAddress = new PhysicalAddress(0x1BAD08);
        System.out.println(String.format("InnerAddress:0%x", physicalAddress.getInnerAddress().getAddress()));

    }

    private static void outputFloorIndices(String filename, List<DungeonIndex> dungeonIndices) {
        try {
            FileWriter file = new FileWriter("output/" + filename);
            PrintWriter pw = new PrintWriter(new BufferedWriter(file));

            StringBuilder basicFloorDataIndex = new StringBuilder();
            basicFloorDataIndex.append("basicFloorDataIndex\n");
            StringBuilder floorDataIndex = new StringBuilder();
            floorDataIndex.append("floorDataIndex\n");
            StringBuilder monsterIndex = new StringBuilder();
            monsterIndex.append("monsterIndex\n");
            StringBuilder itemIndex = new StringBuilder();
            itemIndex.append("itemIndex\n");
            StringBuilder trapIndex = new StringBuilder();
            trapIndex.append("trapIndex\n");

            for (DungeonIndex dungeonIndex : dungeonIndices) {
                basicFloorDataIndex.append(" " + dungeonIndex.getBasicFloorDataIndex().getPhysicalAddressHexString() + " " + dungeonIndex.getDungeonCode().getDungeonName() + "\n");
                floorDataIndex.append(" " + dungeonIndex.getFloorDataIndex().getPhysicalAddressHexString() + " " + dungeonIndex.getDungeonCode().getDungeonName() + "\n");
                monsterIndex.append(" " + dungeonIndex.getMonsterIndex().getPhysicalAddressHexString() + " " + dungeonIndex.getDungeonCode().getDungeonName() + "\n");
                itemIndex.append(" " + dungeonIndex.getItemIndex().getPhysicalAddressHexString() + " " + dungeonIndex.getDungeonCode().getDungeonName() + "\n");
                trapIndex.append(" " + dungeonIndex.getTrapIndex().getPhysicalAddressHexString() + " " + dungeonIndex.getDungeonCode().getDungeonName() + "\n");
            }

            pw.print(basicFloorDataIndex);
            pw.print(floorDataIndex);
            pw.print(monsterIndex);
            pw.print(itemIndex);
            pw.print(trapIndex);

            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void outputTable(String filename, List<? extends IRate> rates) {
        try {
            FileWriter file = new FileWriter("output/" + filename);
            PrintWriter pw = new PrintWriter(new BufferedWriter(file));

            for (IRate iRate : rates) {
                StringBuilder sb = iRate.makeRateTable();
                System.out.print(sb);
                pw.print(sb);
            }

            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void outputFloorDataTable(String filename, List<FloorDataAllFloor> floorDataAllFloors) {
        try {
            FileWriter file = new FileWriter("output/" + filename);
            PrintWriter pw = new PrintWriter(new BufferedWriter(file));

            for (FloorDataAllFloor floorDataAllFloor : floorDataAllFloors) {
                StringBuilder sb = floorDataAllFloor.makeTable();
                System.out.print(sb);
                pw.print(sb);
            }

            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void outputFloorBasicDataTable(String filename, List<FloorBasicDataAllFloor> floorBasicDataAllFloors) {
        try {
            FileWriter file = new FileWriter("output/" + filename);
            PrintWriter pw = new PrintWriter(new BufferedWriter(file));

            for (FloorBasicDataAllFloor floorDataAllFloor : floorBasicDataAllFloors) {
                StringBuilder sb = floorDataAllFloor.makeTable();
                System.out.print(sb);
                pw.print(sb);
            }

            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void outputMonsterDataTable(String filename, MonsterDataAll monsterDataAll) {
        try {
            FileWriter file = new FileWriter("output/" + filename);
            PrintWriter pw = new PrintWriter(new BufferedWriter(file));

            StringBuilder sb = monsterDataAll.makeTable();
            pw.print(sb);

            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}