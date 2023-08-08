package com.lsx3.shiren2.analyzer.address;

public class PhysicalAddress extends Address {
    public PhysicalAddress(int address) {
        super(address);
    }

    public int getPhysicalAddress() {
        return address;
    }

    public InnerRomAddress getInnerAddress() {
        return new InnerRomAddress(address + offsetAddress);
    }

}
