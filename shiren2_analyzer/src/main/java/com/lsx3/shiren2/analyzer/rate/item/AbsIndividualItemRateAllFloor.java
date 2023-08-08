package com.lsx3.shiren2.analyzer.rate.item;

import com.lsx3.shiren2.analyzer.common.OutputBodies;
import com.lsx3.shiren2.analyzer.common.OutputBody;
import com.lsx3.shiren2.analyzer.enums.ICode;
import com.lsx3.shiren2.analyzer.enums.ItemCode;
import com.lsx3.shiren2.analyzer.enums.ItemTypeCode;
import com.lsx3.shiren2.analyzer.rate.abs.RateAllFloor;
import com.lsx3.shiren2.analyzer.rate.item.individual.IndividualItemRate;
import com.lsx3.shiren2.analyzer.rate.item.individual.IndividualItemRateOneFloor;
import com.lsx3.shiren2.analyzer.rate.item.type.ItemTypeRateAllFloor;
import com.lsx3.shiren2.analyzer.rate.item.type.ItemTypeRateOneFloor;

import java.util.ArrayList;
import java.util.List;

abstract public class AbsIndividualItemRateAllFloor extends RateAllFloor<IndividualItemRateOneFloor, ICode> {

    protected IndividualItemRate analyzeOneRate(byte[] rom, int readAddress) {
        ItemCode itemCode = ItemCode.byCode.lookup(rom[readAddress]);
        Byte probability = rom[readAddress + 1];

        return new IndividualItemRate(itemCode, probability);
    }

    protected boolean isEndOfItem(byte[] rom, int readAddress) {
        return rom[readAddress] != 0x00;
    }

    @Override
    public OutputBodies makeRatioBody() {
        return makeBody(false, null);
    }

    public OutputBodies makePercentBody(ItemTypeRateAllFloor itemTypeRateAllFloor) {
        return makeBody(true, itemTypeRateAllFloor);
    }

    @Override
    public OutputBodies makePercentBody() {
        return makeBody(true);
    }

    public OutputBodies makeBody(boolean isPercent, ItemTypeRateAllFloor itemTypeRateAllFloor) {
        // make item type table
        OutputBodies outputBodies = new OutputBodies();
        List<String> bodyOneFloor = new ArrayList<>();

        int floorNumber = 1;
        for (IndividualItemRateOneFloor individualItemRateOneFloor : getRateOneFloors()) {
            // title
            bodyOneFloor.add(floorNumber + "|");
            for (ICode iCode : getAllCodes()) {
                boolean isRateExist = false;
                for (IndividualItemRate individualItemRate : individualItemRateOneFloor.getRates()) {
                    if (iCode == individualItemRate.getCode()) {
                        if (isPercent) {
                            ItemTypeCode itemTypeCode = individualItemRate.getCode().getItemTypeCode();
                            ItemTypeRateOneFloor itemTypeRateOneFloor = itemTypeRateAllFloor.getRateOneFloors().get(floorNumber - 1);
                            int itemTypeRateSum = itemTypeRateOneFloor.getRateSum();
                            int itemTypeRateTemp = Byte.toUnsignedInt(itemTypeRateOneFloor.getItemTypeRate(itemTypeCode).getRate());
                            int individualItemRateInt = Byte.toUnsignedInt(individualItemRate.getRate());
                            int sum = individualItemRateOneFloor.getIndividualItemTypeRateSum(itemTypeCode);
                            float itemRatePercent = (float) individualItemRateInt / sum * itemTypeRateTemp / itemTypeRateSum * 100;
                            bodyOneFloor.add(String.format("%.2f", itemRatePercent) + "%|");
                        } else {
                            bodyOneFloor.add(Byte.toUnsignedInt(individualItemRate.getRate()) + "|");
                        }
                        isRateExist = true;
                    }
                }
                if (!isRateExist) {
                    bodyOneFloor.add("|");
                }
            }
            OutputBody currentOutputBody = new OutputBody(floorNumber, floorNumber, bodyOneFloor);

            outputBodies.addBody(currentOutputBody);
            bodyOneFloor = new ArrayList<>();

            floorNumber++;
        }
        return outputBodies;
    }

    @Override
    public OutputBodies makeBody(boolean isPercent) {
        // make item type table
        OutputBodies outputBodies = new OutputBodies();
        List<String> bodyOneFloor = new ArrayList<>();

        int floorNumber = 1;
        for (IndividualItemRateOneFloor individualItemRateOneFloor : getRateOneFloors()) {
            // title
            bodyOneFloor.add(floorNumber + "|");
            for (ICode iCode : getAllCodes()) {
                boolean isRateExist = false;
                for (IndividualItemRate individualItemRate : individualItemRateOneFloor.getRates()) {
                    if (iCode == individualItemRate.getCode()) {
                        if (isPercent) {
                            ItemTypeCode itemTypeCode = individualItemRate.getCode().getItemTypeCode();
                            int individualItemRateInt = Byte.toUnsignedInt(individualItemRate.getRate());
                            int sum = individualItemRateOneFloor.getIndividualItemTypeRateSum(itemTypeCode);
                            float itemRatePercent = (float) individualItemRateInt / sum * 100;
                            bodyOneFloor.add(String.format("%.2f", itemRatePercent) + "%|");
                        } else {
                            bodyOneFloor.add(Byte.toUnsignedInt(individualItemRate.getRate()) + "|");
                        }
                        isRateExist = true;
                    }
                }
                if (!isRateExist) {
                    bodyOneFloor.add("|");
                }
            }
            OutputBody currentOutputBody = new OutputBody(floorNumber, floorNumber, bodyOneFloor);

            outputBodies.addBody(currentOutputBody);
            bodyOneFloor = new ArrayList<>();

            floorNumber++;
        }
        return outputBodies;
    }
}
