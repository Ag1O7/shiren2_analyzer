package com.lsx3.shiren2.analyzer;

import com.lsx3.shiren2.analyzer.address.InnerRomAddress;
import com.lsx3.shiren2.analyzer.address.PhysicalAddress;
import com.lsx3.shiren2.analyzer.dto.DungeonIndex;
import com.lsx3.shiren2.analyzer.dto.Rom;
import com.lsx3.shiren2.analyzer.floor.FloorBasicDataAllFloor;
import com.lsx3.shiren2.analyzer.floor.FloorDataAllFloor;
import com.lsx3.shiren2.analyzer.monster.MonsterDataAll;
import com.lsx3.shiren2.analyzer.output.Output;
import com.lsx3.shiren2.analyzer.rate.item.ItemDungeonRate;
import com.lsx3.shiren2.analyzer.rate.item.trap.TrapDungeonRate;
import com.lsx3.shiren2.analyzer.rate.monster.MonsterDungeonRate;

import java.util.ArrayList;
import java.util.List;

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
        }

        // shop, and others
        List<ItemDungeonRate> itemDungeonRateListFromEnums = rom.analyzeItemRate();

        // output table
        Output.outputFloorIndices("Indices.txt", dungeonIndices);
        Output.outputTable("ItemRate.txt", itemDungeonRateList);
        Output.outputTable("TrapRate.txt", trapDungeonRateList);
        Output.outputTable("MonsterRate.txt", monsterRateList);
        Output.outputTable("ItemRateShop.txt", itemDungeonRateListFromEnums);
        Output.outputFloorDataTable("FloorData.txt", floorDataList);
        Output.outputFloorBasicDataTable("FloorBasicData.txt", floorBasicDataList);
        Output.outputMonsterDataTable("MonsterData.txt", monsterDataAll);

        // address check
        InnerRomAddress innerRomAddress = new InnerRomAddress(0x02EE12EE2);
        System.out.println(String.format("PhysicalAddress:%x", innerRomAddress.getPhysicalAddress()));
        PhysicalAddress physicalAddress = new PhysicalAddress(0x1BAD08);
        System.out.println(String.format("InnerAddress:0%x", physicalAddress.getInnerAddress().getAddress()));

    }
}