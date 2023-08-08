package com.lsx3.shiren2.analyzer.rate.item.type;

import com.lsx3.shiren2.analyzer.enums.ItemTypeCode;
import com.lsx3.shiren2.analyzer.rate.abs.RateOneFloor;

import java.util.List;

public class ItemTypeRateOneFloor extends RateOneFloor<ItemTypeRate> {

    public ItemTypeRateOneFloor(List<ItemTypeRate> rates) {
        super(rates);
    }

    public ItemTypeRate getItemTypeRate(ItemTypeCode itemTypeCode) {
        for (ItemTypeRate itemTypeRate : getRates()) {
            if (itemTypeRate.getCode() == itemTypeCode) {
                return itemTypeRate;
            }
        }
        return null;
    }
}
