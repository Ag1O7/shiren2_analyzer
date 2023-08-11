package com.lsx3.shiren2.analyzer.output;

import com.lsx3.shiren2.analyzer.dto.DungeonIndex;
import com.lsx3.shiren2.analyzer.floor.FloorBasicDataAllFloor;
import com.lsx3.shiren2.analyzer.floor.FloorDataAllFloor;
import com.lsx3.shiren2.analyzer.monster.MonsterDataAll;
import com.lsx3.shiren2.analyzer.rate.IRate;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Output {
    private static final String OUTPUT_DIRECTORY = "output/";

    public static void outputFloorIndices(String filename, List<DungeonIndex> dungeonIndices) {
        try {
            FileWriter file = new FileWriter(OUTPUT_DIRECTORY + filename);
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
            FileWriter file = new FileWriter(OUTPUT_DIRECTORY + filename);
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
            FileWriter file = new FileWriter(OUTPUT_DIRECTORY + filename);
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
            FileWriter file = new FileWriter(OUTPUT_DIRECTORY + filename);
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
            FileWriter file = new FileWriter(OUTPUT_DIRECTORY + filename);
            PrintWriter pw = new PrintWriter(new BufferedWriter(file));

            StringBuilder sb = monsterDataAll.makeTable();
            pw.print(sb);

            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
