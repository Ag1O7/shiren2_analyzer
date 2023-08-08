package com.lsx3.shiren2.analyzer.dto;

import com.lsx3.shiren2.analyzer.address.InnerRomAddress;
import com.lsx3.shiren2.analyzer.enums.DungeonCode;
import com.lsx3.shiren2.analyzer.enums.DungeonIndexAddress;
import com.lsx3.shiren2.analyzer.rate.monster.MonsterDungeonRate;

import java.nio.ByteBuffer;

public class DungeonIndex {
    private DungeonCode dungeonCode;
    private InnerRomAddress basicFloorDataIndex;
    private InnerRomAddress floorDataIndex;
    private InnerRomAddress monsterIndex;
    private InnerRomAddress itemIndex;
    private InnerRomAddress trapIndex;
    private int floorLimit;
    private int nazoNumber;

    public DungeonIndex(DungeonCode dungeonCode, DungeonIndexAddress dungeonIndexAddress, byte[] rom) {
        this.dungeonCode = dungeonCode;
        int indexAddress = dungeonIndexAddress.getDungeonIndexFromAddress().getPhysicalAddress();

        for (int i = 0; i < 6; i++) {
            byte[] addressArray = {rom[indexAddress], rom[indexAddress + 1], rom[indexAddress + 2], rom[indexAddress + 3]};
            int addressInt = ByteBuffer.wrap(addressArray).getInt();
            InnerRomAddress innerRomAddress = new InnerRomAddress(addressInt);

            if (i == 0) {
                basicFloorDataIndex = innerRomAddress;
            } else if (i == 1) {
                floorDataIndex = innerRomAddress;
            } else if (i == 2) {
                monsterIndex = innerRomAddress;
            } else if (i == 3) {
                itemIndex = innerRomAddress;
            } else if (i == 4) {
                trapIndex = innerRomAddress;
            } else if (i == 5) {
                floorLimit = rom[indexAddress];
                nazoNumber = rom[indexAddress + 1];
            }

            indexAddress += 4;
        }
    }

    public DungeonIndex(DungeonCode dungeonCode, InnerRomAddress innerRomAddress) {
        this.dungeonCode = dungeonCode;
        this.itemIndex = innerRomAddress;
    }

    public DungeonCode getDungeonCode() {
        return dungeonCode;
    }

    public InnerRomAddress getBasicFloorDataIndex() {
        return basicFloorDataIndex;
    }

    public InnerRomAddress getFloorDataIndex() {
        return floorDataIndex;
    }

    public InnerRomAddress getMonsterIndex() {
        return monsterIndex;
    }

    public InnerRomAddress getItemIndex() {
        return itemIndex;
    }

    public InnerRomAddress getTrapIndex() {
        return trapIndex;
    }

    public int getFloorLimit() {
        return floorLimit;
    }

    public int getNazoNumber() {
        return nazoNumber;
    }

    public MonsterDungeonRate getDungeonMonsterRate() {
        return null;
    }

    public StringBuilder makeTable() {

        return null;
    }
}
