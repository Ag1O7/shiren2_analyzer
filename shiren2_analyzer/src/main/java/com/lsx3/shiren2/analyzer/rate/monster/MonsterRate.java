package com.lsx3.shiren2.analyzer.rate.monster;

import com.lsx3.shiren2.analyzer.dto.Rate;
import com.lsx3.shiren2.analyzer.enums.MonsterCode;

public class MonsterRate extends Rate<MonsterCode> {
    public MonsterRate(MonsterCode code, byte rate) {
        super(code, rate);
    }
}
