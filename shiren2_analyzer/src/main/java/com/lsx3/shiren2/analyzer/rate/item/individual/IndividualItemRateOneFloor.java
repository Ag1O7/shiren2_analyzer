package com.lsx3.shiren2.analyzer.rate.item.individual;

import com.lsx3.shiren2.analyzer.enums.ItemTypeCode;
import com.lsx3.shiren2.analyzer.rate.abs.RateOneFloor;

import java.util.List;

public class IndividualItemRateOneFloor extends RateOneFloor<IndividualItemRate> {

    public IndividualItemRateOneFloor(List<IndividualItemRate> rates) {
        super(rates);
    }

    public int getIndividualItemTypeRateSum(ItemTypeCode itemTypeCode) {
        int individualItemTypeRateSum = 0;
        for (IndividualItemRate individualItemRate : getRates()) {
            if (itemTypeCode == individualItemRate.getCode().getItemTypeCode()) {
                individualItemTypeRateSum += Byte.toUnsignedInt(individualItemRate.getRate());
            }
        }
        return individualItemTypeRateSum;
    }
}
