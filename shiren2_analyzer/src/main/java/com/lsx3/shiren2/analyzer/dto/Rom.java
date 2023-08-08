package com.lsx3.shiren2.analyzer.dto;

import com.lsx3.shiren2.analyzer.address.PhysicalAddress;
import com.lsx3.shiren2.analyzer.enums.DungeonCode;
import com.lsx3.shiren2.analyzer.enums.DungeonIndexAddress;
import com.lsx3.shiren2.analyzer.enums.ItemRateIndexAddress;
import com.lsx3.shiren2.analyzer.floor.FloorBasicDataAllFloor;
import com.lsx3.shiren2.analyzer.floor.FloorDataAllFloor;
import com.lsx3.shiren2.analyzer.monster.MonsterDataAll;
import com.lsx3.shiren2.analyzer.rate.item.ItemDungeonRate;
import com.lsx3.shiren2.analyzer.rate.item.trap.TrapDungeonRate;
import com.lsx3.shiren2.analyzer.rate.monster.MonsterDungeonRate;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Rom {
    private final String fileName = "rom/shiren2.z64";
    private byte[] rom;

    public Rom() {
        this.rom = roadRom();
    }

    private byte[] roadRom() {
        Path file = Paths.get(fileName);
        try {
            byte[] bytes = Files.readAllBytes(file);

            return bytes;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public byte[] getRom() {
        return rom;
    }

    public List<DungeonIndex> analyzeDungeonIndex() {
        List<DungeonIndex> list = new ArrayList<>();
        int i = 0;
        for (DungeonIndexAddress dungeonIndexAddress : DungeonIndexAddress.values()) {
            DungeonCode dungeonCodeTemp = DungeonCode.getDungeonCode(i);
            DungeonIndex dungeonIndex = new DungeonIndex(dungeonCodeTemp, dungeonIndexAddress, this.getRom());
            list.add(dungeonIndex);
            i += 1;
        }
        return list;
    }

    public List<ItemDungeonRate> analyzeItemRate() {
        List<ItemDungeonRate> list = new ArrayList<>();
        for (ItemRateIndexAddress itemRateIndexAddress : ItemRateIndexAddress.values()) {
            DungeonIndex dungeonIndex = new DungeonIndex(itemRateIndexAddress.getDungeonCode(), new PhysicalAddress(itemRateIndexAddress.getRateIndexFromAddress()).getInnerAddress());
            ItemDungeonRate itemDungeonRateTemp = new ItemDungeonRate(dungeonIndex, this.getRom());
            list.add(itemDungeonRateTemp);
        }
        return list;
    }

    public ItemDungeonRate analyzeItemRate(DungeonIndex dungeonIndex) {
        ItemDungeonRate itemDungeonRateTemp = new ItemDungeonRate(dungeonIndex, this.getRom());
        return itemDungeonRateTemp;
    }

    public TrapDungeonRate analyzeTrapRate(DungeonIndex dungeonIndex) {
        TrapDungeonRate trapDungeonRate = new TrapDungeonRate(dungeonIndex, this.getRom());
        return trapDungeonRate;
    }

    public MonsterDungeonRate analyzeMonsterRate(DungeonIndex dungeonIndex) {
        MonsterDungeonRate monsterRate = new MonsterDungeonRate(dungeonIndex, this.getRom());
        return monsterRate;
    }

    public FloorDataAllFloor analyzeFloorData(DungeonIndex dungeonIndex) {
        FloorDataAllFloor floorDataAllFloor = new FloorDataAllFloor(dungeonIndex, this.getRom());
        return floorDataAllFloor;
    }

    public FloorBasicDataAllFloor analyzeFloorBasicData(DungeonIndex dungeonIndex) {
        FloorBasicDataAllFloor floorBasicDataAllFloor = new FloorBasicDataAllFloor(dungeonIndex, this.getRom());
        return floorBasicDataAllFloor;
    }

    public MonsterDataAll analyzeMonsterData() {
        MonsterDataAll monsterDataList = new MonsterDataAll(this.getRom());

        return monsterDataList;
    }

}
