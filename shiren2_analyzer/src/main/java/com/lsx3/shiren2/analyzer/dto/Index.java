package com.lsx3.shiren2.analyzer.dto;

import com.lsx3.shiren2.analyzer.address.InnerRomAddress;
import com.lsx3.shiren2.analyzer.enums.DungeonCode;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class Index {
    private List<InnerRomAddress> innerRomAddresses;

    public List<InnerRomAddress> getVirtualAddresses() {
        return innerRomAddresses;
    }

    public Index(InnerRomAddress innerRomAddress, DungeonCode dungeonCode, byte[] rom) {
        this.innerRomAddresses = new ArrayList<>();
        int indexAddress = innerRomAddress.getPhysicalAddress();

        for (int j = 0; j < dungeonCode.getFloorNumber(); j++) {
            byte[] addressArray = {rom[indexAddress], rom[indexAddress + 1], rom[indexAddress + 2], rom[indexAddress + 3]};
            int addressInt = ByteBuffer.wrap(addressArray).getInt();
            InnerRomAddress innerRomAddressTemp = new InnerRomAddress(addressInt);
            innerRomAddresses.add(innerRomAddressTemp);

            indexAddress += 4;
        }
    }
}
