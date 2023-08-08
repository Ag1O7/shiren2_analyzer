package com.lsx3.shiren2.analyzer.rate.item.individual;

import com.lsx3.shiren2.analyzer.dto.Rate;
import com.lsx3.shiren2.analyzer.enums.ItemCode;

public class IndividualItemRate extends Rate<ItemCode> {
    public IndividualItemRate(ItemCode code, byte rate) {
        super(code, rate);
    }
}
