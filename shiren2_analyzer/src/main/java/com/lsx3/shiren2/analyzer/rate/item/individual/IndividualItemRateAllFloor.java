package com.lsx3.shiren2.analyzer.rate.item.individual;

import com.lsx3.shiren2.analyzer.rate.item.AbsIndividualItemRateAllFloor;
import com.lsx3.shiren2.analyzer.rate.item.type.ItemTypeRate;
import com.lsx3.shiren2.analyzer.rate.item.type.ItemTypeRateAllFloor;
import com.lsx3.shiren2.analyzer.rate.item.type.ItemTypeRateOneFloor;

import java.util.ArrayList;
import java.util.List;

public class IndividualItemRateAllFloor extends AbsIndividualItemRateAllFloor {

    public IndividualItemRateAllFloor(byte[] rom, ItemTypeRateAllFloor rateAllFloor) {
        setRateOneFloors(analyzeRate(rom, rateAllFloor));
        setAllCodes(listUpAllCode());
    }

    public List<IndividualItemRateOneFloor> analyzeRate(byte[] rom, ItemTypeRateAllFloor rateAllFloor) {
        List<IndividualItemRateOneFloor> individualItemRateOneFloors = new ArrayList<>();

        for (ItemTypeRateOneFloor itemTypeRateOneFloor : rateAllFloor.getRateOneFloors()) {
            individualItemRateOneFloors.add(analyzeRateOneFloor(rom, itemTypeRateOneFloor));
        }

        return individualItemRateOneFloors;
    }

    public IndividualItemRateOneFloor analyzeRateOneFloor(byte[] rom, ItemTypeRateOneFloor itemTypeRateOneFloor) {
        List<IndividualItemRate> individualItemRatesTemp = new ArrayList<>();

        for (ItemTypeRate itemTypeRate : itemTypeRateOneFloor.getRates()) {
            int individualItemRateAddress = itemTypeRate.getInnerRomAddress().getPhysicalAddress();
            while (isEndOfItem(rom, individualItemRateAddress)) {
                individualItemRatesTemp.add(analyzeOneRate(rom, individualItemRateAddress));
                individualItemRateAddress += 2;
            }
        }
        return new IndividualItemRateOneFloor(individualItemRatesTemp);
    }

}
