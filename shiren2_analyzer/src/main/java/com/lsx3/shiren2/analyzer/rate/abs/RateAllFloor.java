package com.lsx3.shiren2.analyzer.rate.abs;

import com.lsx3.shiren2.analyzer.common.OutputBodies;
import com.lsx3.shiren2.analyzer.common.OutputBody;
import com.lsx3.shiren2.analyzer.dto.Rate;
import com.lsx3.shiren2.analyzer.enums.ICode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

abstract public class RateAllFloor<T extends RateOneFloor, C extends ICode> {
    protected List<T> rateOneFloors;
    protected List<C> allCodes;

    public List<T> getRateOneFloors() {
        return rateOneFloors;
    }

    public void setRateOneFloors(List<T> rateOneFloors) {
        this.rateOneFloors = rateOneFloors;
    }

    public void setAllCodes(List<C> allCodes) {
        this.allCodes = allCodes;
    }

    public List<C> getAllCodes() {
        return allCodes;
    }

    public List<C> listUpAllCode() {
        // list up all item type
        List<C> allCodes = new ArrayList<>();
        for (RateOneFloor rateOneFloor : rateOneFloors) {
            List<Rate> rates = rateOneFloor.getRates();
            for (Rate rate : rates) {
                if (!allCodes.contains(rate.getCode())) {
                    allCodes.add((C) rate.getCode());
                }
            }
        }

        allCodes.sort(Comparator.comparingInt(o -> Byte.toUnsignedInt(o.getCode())));
        return allCodes;
    }

    public OutputBodies makeRatioBody() {
        return makeBody(false);
    }

    public OutputBodies makePercentBody() {
        return makeBody(true);
    }

    public OutputBodies makeBody(boolean isPercent) {
        // make item type table
        OutputBodies outputBodies = new OutputBodies();

        int floorNumber = 1;
        for (T rateOneFloor : rateOneFloors) {
            OutputBody currentOutputBody = new OutputBody(floorNumber, floorNumber, makeBodyOneFloor(rateOneFloor, isPercent, floorNumber));
            outputBodies.addBody(currentOutputBody);

            floorNumber++;
        }
        return outputBodies;
    }

    protected List<String> makeBodyOneFloor(T rateOneFloor, boolean isPercent, int floorNumber) {
        List<String> bodyOneFloor = new ArrayList<>();

        // title
        bodyOneFloor.add(floorNumber + "|");
        for (ICode iCode : allCodes) {
            boolean isRateExist = false;

            List<Rate> rates = rateOneFloor.getRates();

            for (Rate itemTypeRate : rates) {
                if (iCode == itemTypeRate.getCode()) {
                    if (isPercent) {
                        float itemRatePercent = (float) Byte.toUnsignedInt(itemTypeRate.getRate()) / rateOneFloor.getRateSum() * 100;
                        bodyOneFloor.add(String.format("%.2f", itemRatePercent) + "%|");
                    } else {
                        bodyOneFloor.add(Byte.toUnsignedInt(itemTypeRate.getRate()) + "|");
                    }
                    isRateExist = true;
                }
            }
            if (!isRateExist) {
                bodyOneFloor.add("|");
            }
        }
        return bodyOneFloor;
    }
}