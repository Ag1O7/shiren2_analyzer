package com.lsx3.shiren2.analyzer.rate.item;

import com.lsx3.shiren2.analyzer.dto.DungeonIndex;
import com.lsx3.shiren2.analyzer.rate.IRate;
import com.lsx3.shiren2.analyzer.rate.abs.DungeonRate;
import com.lsx3.shiren2.analyzer.rate.item.individual.IndividualItemRateAllFloor;
import com.lsx3.shiren2.analyzer.rate.item.type.ItemTypeRateAllFloor;

public class ItemDungeonRate extends DungeonRate<ItemTypeRateAllFloor> implements IRate {
    private IndividualItemRateAllFloor individualItemRateAllFloor;

    private final String HEADER_INDIVIDUAL_ITEM_DUNGEON = "|RIGHT:フロア&br;アイテム＼|";
    private final String HEADER_INDIVIDUAL_ITEM_NOT_DUNGEON = "|RIGHT:種別&br;アイテム＼|";
    private final String TYPE_NAME_ITEM_TYPE = "カテゴリ別";
    private final String TYPE_NAME_INDIVIDUAL_ITEM = "アイテム";

    public ItemDungeonRate(DungeonIndex dungeonIndex, byte[] rom) {
        super(dungeonIndex, rom);
        this.individualItemRateAllFloor = new IndividualItemRateAllFloor(rom, rateAllFloor);
    }

    public ItemTypeRateAllFloor analyzeRate(byte[] rom) {
        return new ItemTypeRateAllFloor(rom, dungeonIndex);
    }

    @Override
    public StringBuilder makeRateTable() {
        StringBuilder sb = super.makeRateTable();

        sb.append(makeIndividualItemRateRatioTable());
        sb.append(makeIndividualItemRatePercentTable());

        return sb;
    }

    public StringBuilder makeIndividualItemRateRatioTable() {
        return makeRateTable(makeRateRatioTablePrefix(getIndividualItemName()), makeHeader(getIndividualHeaderString(), individualItemRateAllFloor.getAllCodes()), individualItemRateAllFloor.makeRatioBody());
    }

    public StringBuilder makeIndividualItemRatePercentTable() {
        return makeRateTable(makeRatePercentTablePrefix(getIndividualItemName()), makeHeader(getIndividualHeaderString(), individualItemRateAllFloor.getAllCodes()), individualItemRateAllFloor.makePercentBody(rateAllFloor));
    }

    protected String getIndividualHeaderString() {
        if (dungeonIndex.getDungeonCode().isDungeon()) {
            return HEADER_INDIVIDUAL_ITEM_DUNGEON;
        }
        return HEADER_INDIVIDUAL_ITEM_NOT_DUNGEON;
    }

    @Override
    protected String getTypeName() {
        return TYPE_NAME_ITEM_TYPE;
    }

    protected String getIndividualItemName() {
        return TYPE_NAME_INDIVIDUAL_ITEM;
    }

}
