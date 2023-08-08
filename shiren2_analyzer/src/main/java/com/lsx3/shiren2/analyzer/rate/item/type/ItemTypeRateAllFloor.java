package com.lsx3.shiren2.analyzer.rate.item.type;

import com.lsx3.shiren2.analyzer.address.InnerRomAddress;
import com.lsx3.shiren2.analyzer.dto.DungeonIndex;
import com.lsx3.shiren2.analyzer.dto.Index;
import com.lsx3.shiren2.analyzer.enums.ItemTypeCode;
import com.lsx3.shiren2.analyzer.rate.abs.RateAllFloor;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class ItemTypeRateAllFloor extends RateAllFloor<ItemTypeRateOneFloor, ItemTypeCode> {

    public ItemTypeRateAllFloor(byte[] rom, DungeonIndex dungeonIndex) {
        setRateOneFloors(analyzeRate(rom, dungeonIndex));
        setAllCodes(listUpAllCode());
    }

    public List<ItemTypeRateOneFloor> analyzeRate(byte[] rom, DungeonIndex dungeonIndex) {

        Index index = new Index(dungeonIndex.getItemIndex(), dungeonIndex.getDungeonCode(), rom);
        List<ItemTypeRateOneFloor> itemTypeRateOneFloors = new ArrayList<>();

        for (InnerRomAddress innerRomAddress : index.getVirtualAddresses()) {
            itemTypeRateOneFloors.add(analyzeRateOneFloor(innerRomAddress, rom));
        }

        return itemTypeRateOneFloors;
    }

    public ItemTypeRateOneFloor analyzeRateOneFloor(InnerRomAddress innerRomAddress, byte[] rom) {
        List<ItemTypeRate> itemTypeRates = new ArrayList<>();
        int readAddress = innerRomAddress.getPhysicalAddress();

        while (true) {
            ItemTypeRateOneFloor itemTypeRateOneFloor = new ItemTypeRateOneFloor(itemTypeRates);

            if (isEndOfItem(rom, readAddress)) {
                // next floor
                return itemTypeRateOneFloor;
            }

            // add item type rate
            itemTypeRates.add(analyzeOneRate(rom, readAddress));

            readAddress += 8;
        }
    }

    private ItemTypeRate analyzeOneRate(byte[] rom, int readAddress) {
        ItemTypeCode itemTypeCode = ItemTypeCode.byCode.lookup(rom[readAddress]);
        Byte probability = rom[readAddress + 1];

        byte[] addressArray = {rom[readAddress + 4], rom[readAddress + 5], rom[readAddress + 6], rom[readAddress + 7]};
        int addressInt = ByteBuffer.wrap(addressArray).getInt();
        InnerRomAddress innerRomAddressTemp = new InnerRomAddress(addressInt);

        // add item type rate
        return new ItemTypeRate(itemTypeCode, probability, innerRomAddressTemp);
    }

    private boolean isEndOfItem(byte[] rom, int readAddress) {
        byte or = (byte) (rom[readAddress] | rom[readAddress + 1] | rom[readAddress + 4] | rom[readAddress + 5]
                | rom[readAddress + 6] | rom[readAddress + 7]);
        return or == 0x00;
    }

}