package com.lsx3.shiren2.analyzer.rate.monster;

import com.lsx3.shiren2.analyzer.address.InnerRomAddress;
import com.lsx3.shiren2.analyzer.common.OutputRowBodies;
import com.lsx3.shiren2.analyzer.common.OutputRowBody;
import com.lsx3.shiren2.analyzer.dto.DungeonIndex;
import com.lsx3.shiren2.analyzer.dto.Index;
import com.lsx3.shiren2.analyzer.dto.Rate;
import com.lsx3.shiren2.analyzer.enums.MonsterCode;
import com.lsx3.shiren2.analyzer.enums.MonsterTypeCode;
import com.lsx3.shiren2.analyzer.rate.abs.RateAllFloor;
import com.lsx3.shiren2.analyzer.rate.abs.RateOneFloor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MonsterRateAllFloor extends RateAllFloor<MonsterRateOneFloor, MonsterCode> {

    public MonsterRateAllFloor(byte[] rom, DungeonIndex dungeonIndex) {
        setRateOneFloors(analyzeRate(rom, dungeonIndex));
        setAllCodes(listUpAllCode());
    }

    public List<MonsterRateOneFloor> analyzeRate(byte[] rom, DungeonIndex dungeonIndex) {
        Index index = new Index(dungeonIndex.getMonsterIndex(), dungeonIndex.getDungeonCode(), rom);
        List<MonsterRateOneFloor> monsterRateOneFloors = new ArrayList<>();

        for (InnerRomAddress innerRomAddress : index.getVirtualAddresses()) {
            monsterRateOneFloors.add(analyzeRateOneFloor(innerRomAddress, rom));
        }

        return monsterRateOneFloors;
    }

    public MonsterRateOneFloor analyzeRateOneFloor(InnerRomAddress innerRomAddress, byte[] rom) {
        List<MonsterRate> monsterRates = new ArrayList<>();

        int readAddress = innerRomAddress.getPhysicalAddress();
        while (isEndOfItem(rom, readAddress)) {
            monsterRates.add(analyzeOneRate(rom, readAddress));
            readAddress += 4;
        }
        return new MonsterRateOneFloor(monsterRates);
    }

    private MonsterRate analyzeOneRate(byte[] rom, int readAddress) {
        byte monsterCode = rom[readAddress];
        byte monsterLevel = rom[readAddress + 1];
        byte monsterRate = rom[readAddress + 3];
        return new MonsterRate(MonsterCode.getMonsterCode(monsterCode, monsterLevel), monsterRate);
    }

    private boolean isEndOfItem(byte[] rom, int readAddress) {
        return rom[readAddress] != 0x00;
    }

    @Override
    public List<MonsterCode> listUpAllCode() {
        // list up all item type
        List<MonsterCode> allCodes = new ArrayList<>();
        for (RateOneFloor rateOneFloor : rateOneFloors) {
            List<Rate> rates = rateOneFloor.getRates();
            for (Rate rate : rates) {
                if (!allCodes.contains(rate.getCode())) {
                    allCodes.add((MonsterCode) rate.getCode());
                }
            }
        }
        return allCodes;
    }

    private int maxColumnSize() {
        int maxColumnSize = 0;
        for (MonsterRateOneFloor rateOneFloor : rateOneFloors) {
            int columnSize = rateOneFloor.getRates().size();
            if (maxColumnSize < columnSize) {
                maxColumnSize = columnSize;
            }
        }
        return maxColumnSize;
    }

    public OutputRowBodies makeRatioRowBody() {
        return makeRowBody(false);
    }

    public OutputRowBodies makePercentRowBody() {
        return makeRowBody(true);
    }

    public OutputRowBodies makeRowBody(boolean isPercent) {
        // make item type table
        OutputRowBodies outputBodies = new OutputRowBodies();

        // add header
        List<String> header = new ArrayList<>();
        for (int i = 0; i < maxColumnSize(); i++) {
            header.add("CENTER:SIZE(9):|");
        }
        outputBodies.addBody(new OutputRowBody(header));
        setRateOneFloors(sortRateOneFloors());

        int dungeonFloorNumber = rateOneFloors.size();
        for (int i = 0; i < dungeonFloorNumber; i++) {
            OutputRowBody currentOutputRowBody = new OutputRowBody(makeBodyOneFloor(rateOneFloors.get(i), isPercent));
            outputBodies.addBody(currentOutputRowBody);
        }

        return outputBodies;
    }

    protected List<String> makeBodyOneFloor(MonsterRateOneFloor rateOneFloor, boolean isPercent) {
        List<String> bodyOneFloor = new ArrayList<>();

        // title
        List<MonsterRate> rates = rateOneFloor.getRates();

        for (MonsterRate rate : rates) {
            if (rate == null) {
                bodyOneFloor.add("|");
                continue;
            }
            if (isPercent) {
                float itemRatePercent = (float) Byte.toUnsignedInt(rate.getRate()) / rateOneFloor.getRateSum() * 100;
                bodyOneFloor.add("BGCOLOR(" + rate.getCode().getMonsterTypeCode().getColorCode() + "):" + rate.getCode().getShortName() + "&br;" + String.format("%.2f", itemRatePercent) + "%|");
            } else {
                bodyOneFloor.add("BGCOLOR(" + rate.getCode().getMonsterTypeCode().getColorCode() + "):" + rate.getCode().getShortName() + "&br;" + Byte.toUnsignedInt(rate.getRate()) + "|");
            }
        }
        for (int i = 0; i < maxColumnSize() - rates.size(); i++) {
            bodyOneFloor.add("|");
        }
        return bodyOneFloor;
    }

    private List<MonsterRateOneFloor> sortRateOneFloors() {
        List<Map<Integer, MonsterRate>> newList = new ArrayList<>();
        for (int i = 0; i < rateOneFloors.size(); i++) {
            Map<Integer, MonsterRate> map = new HashMap<>();
            List<MonsterRate> monsterRates = rateOneFloors.get(i).getRates();
            List<MonsterRate> monsterRatesNotAdded = new ArrayList<>();
            for (int j = 0; j < monsterRates.size(); j++) {
                if (i == 0) {
                    if (monsterRates.get(j) != null && monsterRates.get(j).getCode().getMonsterTypeCode() == MonsterTypeCode.N_DUBBA) {
                        for (int m = maxColumnSize() - 1; 0 < m; m--) {
                            if (map.get(m) == null) {
                                map.put(m, monsterRates.get(j));
                                break;
                            }
                        }
                    } else {
                        map.put(j, monsterRates.get(j));
                    }
                } else {
                    Map<Integer, MonsterRate> previousMap = newList.get(i - 1);
                    boolean added = false;
                    for (Integer key : previousMap.keySet()) {
                        if (previousMap.get(key) != null && monsterRates.get(j) != null && previousMap.get(key).getCode() == monsterRates.get(j).getCode()) {
                            map.put(key, monsterRates.get(j));
                            added = true;
                        }
                    }
                    if (!added) {
                        monsterRatesNotAdded.add(monsterRates.get(j));
                    }
                }
            }
            for (MonsterRate monsterRate : monsterRatesNotAdded) {
                if (monsterRate != null && monsterRate.getCode().getMonsterTypeCode() == MonsterTypeCode.N_DUBBA) {
                    for (int m = maxColumnSize() - 1; 0 < m; m--) {
                        if (map.get(m) == null) {
                            map.put(m, monsterRate);
                            break;
                        }
                    }
                } else {
                    for (int k = 0; k < maxColumnSize(); k++) {
                        if (map.get(k) == null) {
                            map.put(k, monsterRate);
                            break;
                        }
                    }
                }
            }
            newList.add(map);
        }

        List<MonsterRateOneFloor> monsterRateOneFloors = new ArrayList<>();
        for (Map<Integer, MonsterRate> monsterRateMap : newList) {
            List<MonsterRate> monsterRatesTemp = new ArrayList<>();
            for (int l = 0; l < maxColumnSize(); l++) {
                if (monsterRateMap.get(l) != null) {
                    monsterRatesTemp.add(monsterRateMap.get(l));
                } else {
                    monsterRatesTemp.add(null);
                }
            }
            MonsterRateOneFloor monsterRateOneFloor = new MonsterRateOneFloor(monsterRatesTemp);
            monsterRateOneFloors.add(monsterRateOneFloor);
        }

        return monsterRateOneFloors;

    }

}