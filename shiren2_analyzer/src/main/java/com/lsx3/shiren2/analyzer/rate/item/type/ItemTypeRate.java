package com.lsx3.shiren2.analyzer.rate.item.type;

import com.lsx3.shiren2.analyzer.address.InnerRomAddress;
import com.lsx3.shiren2.analyzer.dto.Rate;
import com.lsx3.shiren2.analyzer.enums.ItemTypeCode;

public class ItemTypeRate extends Rate<ItemTypeCode> {
    private InnerRomAddress innerRomAddress;

    public ItemTypeRate(ItemTypeCode code, byte rate, InnerRomAddress innerRomAddress) {
        super(code, rate);
        this.innerRomAddress = innerRomAddress;
    }

    public InnerRomAddress getInnerRomAddress() {
        return innerRomAddress;
    }
}
