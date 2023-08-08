package com.lsx3.shiren2.analyzer.address;

public class InnerRomAddress extends Address {
    public InnerRomAddress(int address) {
        super(address);
    }

    public int getAddress() {
        return address;
    }

    public int getPhysicalAddress() {
        return address - offsetAddress;
    }

    public String getPhysicalAddressHexString() {
        return Integer.toHexString(address - offsetAddress);
    }

}
