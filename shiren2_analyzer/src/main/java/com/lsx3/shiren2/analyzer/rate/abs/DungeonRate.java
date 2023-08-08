package com.lsx3.shiren2.analyzer.rate.abs;

import com.lsx3.shiren2.analyzer.common.OutputBodies;
import com.lsx3.shiren2.analyzer.common.OutputBody;
import com.lsx3.shiren2.analyzer.dto.DungeonIndex;
import com.lsx3.shiren2.analyzer.enums.ICode;
import com.lsx3.shiren2.analyzer.rate.IRate;

import java.util.ArrayList;
import java.util.List;

public abstract class DungeonRate<T extends RateAllFloor> implements IRate {
    protected DungeonIndex dungeonIndex;
    protected T rateAllFloor;
    protected final String FLOOR_SUFFIX_DUNGEON = "F";
    private final String HEADER_ITEM_DUNGEON = "|RIGHT:フロア&br;アイテム種別＼|";
    private final String HEADER_ITEM_NOT_DUNGEON = "|RIGHT:種別&br;アイテム種別＼|";
    private final String TYPE_NAME = "";
    private final String RATIO_PREFIX = "出現率(比率)\n";
    private final String PERCENT_PREFIX = "出現率(%)\n";

    public DungeonRate(DungeonIndex dungeonIndex, byte[] rom) {
        this.dungeonIndex = dungeonIndex;
        this.rateAllFloor = analyzeRate(rom);
    }

    public abstract T analyzeRate(byte[] rom);

    public StringBuilder makeRateTable() {
        StringBuilder sb = new StringBuilder();

        sb.append(makeH2Title());
        sb.append(makeRateRatioTable());
        sb.append(makeRatePercentTable());

        return sb;
    }

    protected String makeH2Title() {
        return "** " + dungeonIndex.getDungeonCode().getDungeonName() + "\n";
    }

    public StringBuilder makeRateRatioTable() {
        return makeRateTable(makeRateRatioTablePrefix(getTypeName()), makeHeader(), rateAllFloor.makeRatioBody());
    }

    public StringBuilder makeRatePercentTable() {
        return makeRateTable(makeRatePercentTablePrefix(getTypeName()), makeHeader(), rateAllFloor.makePercentBody());
    }

    public StringBuilder makeRateTable(StringBuilder prefix, List<String> header, OutputBodies body) {
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        sb.append(makeTableFromHeaderAndBody(header, body));
        return sb;
    }

    protected StringBuilder makeRateRatioTablePrefix(String typeName) {
        StringBuilder sb = new StringBuilder();
        sb.append("*** " + typeName + RATIO_PREFIX);

        return sb;
    }

    protected StringBuilder makeRatePercentTablePrefix(String typeName) {
        StringBuilder sb = new StringBuilder();
        sb.append("*** " + typeName + PERCENT_PREFIX);

        return sb;
    }

    protected List<String> makeHeader() {
        return makeHeader(getHeaderString(), rateAllFloor.getAllCodes());
    }

    protected List<String> makeHeader(String headerString, List<ICode> iCodes) {

        // make item type table
        List<String> header = new ArrayList<>();

        // make header
        header.add(headerString);

        for (ICode iCode : iCodes) {
            header.add("|~" + iCode.getName() + "|");
        }
        return header;
    }

    public StringBuilder makeTableFromHeaderAndBody(List<String> header, OutputBodies outputBodies) {

        StringBuilder sb = new StringBuilder();

        sb.append(getTablePrefix());
        sb.append(mixHeaderAndBody(header, outputBodies));
        sb.append(getTableSuffix());

        return sb;
    }

    private StringBuilder mixHeaderAndBody(List<String> header, OutputBodies outputBodies) {
        // mix header and body
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < header.size(); i++) {
            sb.append(header.get(i));

            for (OutputBody bodyOneFloor : outputBodies.getOutputBodies()) {
                sb.append(makeBodyRow(bodyOneFloor, i));
            }

            if (i == 0) {
                // add "h" to the last of header
                sb.append("h");
            }

            sb.append("\n");
        }
        return sb;
    }

    private String makeBodyRow(OutputBody bodyOneFloor, int i) {
        if (i == 0) {
            // first row
            int fromFloor = bodyOneFloor.getFromFloor();
            int toFloor = bodyOneFloor.getToFloor();
            if (fromFloor == toFloor) {
                return fromFloor + getHeaderSuffix() + "|";
            } else {
                return fromFloor + getHeaderSuffix() + "-" + toFloor + getHeaderSuffix() + "|";
            }
        }
        return bodyOneFloor.getBody().get(i);
    }

    protected String getHeaderSuffix() {
        if (dungeonIndex.getDungeonCode().isDungeon()) {
            return FLOOR_SUFFIX_DUNGEON;
        }
        return "";
    }

    abstract protected String getTypeName();

    protected String getHeaderString() {
        if (dungeonIndex.getDungeonCode().isDungeon()) {
            return HEADER_ITEM_DUNGEON;
        }
        return HEADER_ITEM_NOT_DUNGEON;
    }

    protected String getTablePrefix() {
        return "#style(class=white-space_normal)\n";
    }

    protected String getTableSuffix() {
        return "#style(end)\n\n";
    }
}
