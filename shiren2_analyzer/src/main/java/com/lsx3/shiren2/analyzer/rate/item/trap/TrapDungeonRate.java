package com.lsx3.shiren2.analyzer.rate.item.trap;

import com.lsx3.shiren2.analyzer.dto.DungeonIndex;
import com.lsx3.shiren2.analyzer.rate.IRate;
import com.lsx3.shiren2.analyzer.rate.abs.DungeonRate;

public class TrapDungeonRate extends DungeonRate<TrapRateAllFloor> implements IRate {
    private final String HEADER_ITEM_DUNGEON = "|RIGHT:フロア&br;アイテム＼|";
    private final String HEADER_ITEM_NOT_DUNGEON = "|RIGHT:種別&br;アイテム＼|";
    private final String TYPE_NAME = "ワナ";

    public TrapDungeonRate(DungeonIndex dungeonIndex, byte[] rom) {
        super(dungeonIndex, rom);
    }

    @Override
    protected String getTypeName() {
        return TYPE_NAME;
    }

    public TrapRateAllFloor analyzeRate(byte[] rom) {
        return new TrapRateAllFloor(rom, dungeonIndex);
    }

    @Override
    protected String getHeaderString() {
        if (dungeonIndex.getDungeonCode().isDungeon()) {
            return HEADER_ITEM_DUNGEON;
        }
        return HEADER_ITEM_NOT_DUNGEON;
    }
}
