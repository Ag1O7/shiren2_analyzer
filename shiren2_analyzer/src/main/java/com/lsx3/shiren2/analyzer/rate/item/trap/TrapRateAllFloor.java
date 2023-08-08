package com.lsx3.shiren2.analyzer.rate.item.trap;

import com.lsx3.shiren2.analyzer.address.InnerRomAddress;
import com.lsx3.shiren2.analyzer.dto.DungeonIndex;
import com.lsx3.shiren2.analyzer.dto.Index;
import com.lsx3.shiren2.analyzer.rate.item.AbsIndividualItemRateAllFloor;
import com.lsx3.shiren2.analyzer.rate.item.individual.IndividualItemRate;
import com.lsx3.shiren2.analyzer.rate.item.individual.IndividualItemRateOneFloor;

import java.util.ArrayList;
import java.util.List;

public class TrapRateAllFloor extends AbsIndividualItemRateAllFloor {

    public TrapRateAllFloor(byte[] rom, DungeonIndex dungeonIndex) {
        setRateOneFloors(analyzeRate(rom, dungeonIndex));
        setAllCodes(listUpAllCode());
    }

    public List<IndividualItemRateOneFloor> analyzeRate(byte[] rom, DungeonIndex dungeonIndex) {

        Index index = new Index(dungeonIndex.getTrapIndex(), dungeonIndex.getDungeonCode(), rom);
        List<IndividualItemRateOneFloor> individualItemRateOneFloors = new ArrayList<>();

        for (InnerRomAddress innerRomAddress : index.getVirtualAddresses()) {
            individualItemRateOneFloors.add(analyzeRateOneFloor(innerRomAddress, rom));
        }

        return individualItemRateOneFloors;
    }

    public IndividualItemRateOneFloor analyzeRateOneFloor(InnerRomAddress innerRomAddress, byte[] rom) {
        List<IndividualItemRate> individualItemRatesTemp = new ArrayList<>();

        int readAddress = innerRomAddress.getPhysicalAddress();
        while (isEndOfItem(rom, readAddress)) {
            individualItemRatesTemp.add(analyzeOneRate(rom, readAddress));
            readAddress += 2;
        }
        return new IndividualItemRateOneFloor(individualItemRatesTemp);
    }

}
