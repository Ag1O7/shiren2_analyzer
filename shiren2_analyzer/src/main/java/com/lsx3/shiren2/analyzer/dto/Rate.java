package com.lsx3.shiren2.analyzer.dto;

import com.lsx3.shiren2.analyzer.enums.ICode;

public class Rate<T extends ICode> {
    private T code;
    private byte rate;

    public Rate(T code, byte rate) {
        this.code = code;
        this.rate = rate;
    }

    public T getCode() {
        return code;
    }

    public byte getRate() {
        return rate;
    }


}
