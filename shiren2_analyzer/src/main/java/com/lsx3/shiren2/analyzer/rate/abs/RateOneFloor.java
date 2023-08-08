package com.lsx3.shiren2.analyzer.rate.abs;

import com.lsx3.shiren2.analyzer.dto.Rate;

import java.util.List;

public class RateOneFloor<T extends Rate> {
    private List<T> rates;

    public RateOneFloor(List<T> rates) {
        this.rates = rates;
    }

    public List<T> getRates() {
        return rates;
    }

    public int getRateSum() {
        int itemTypeRateSum = 0;
        for (Rate rateTemp : rates) {
            if (rateTemp != null) {
                itemTypeRateSum += Byte.toUnsignedInt(rateTemp.getRate());
            }
        }
        return itemTypeRateSum;
    }
}
