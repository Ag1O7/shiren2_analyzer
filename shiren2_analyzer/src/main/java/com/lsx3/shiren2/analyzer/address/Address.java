package com.lsx3.shiren2.analyzer.address;

public abstract class Address {
    public int address;
    public static final int offsetAddress = 0x1E6B040;

    public Address(int address) {
        this.address = address;
    }

}
