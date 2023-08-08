package com.lsx3.shiren2.analyzer.rate.monster;

import com.lsx3.shiren2.analyzer.common.OutputRowBodies;
import com.lsx3.shiren2.analyzer.common.OutputRowBody;
import com.lsx3.shiren2.analyzer.dto.DungeonIndex;
import com.lsx3.shiren2.analyzer.enums.ICode;
import com.lsx3.shiren2.analyzer.rate.IRate;
import com.lsx3.shiren2.analyzer.rate.abs.DungeonRate;

import java.util.ArrayList;
import java.util.List;

public class MonsterDungeonRate extends DungeonRate<MonsterRateAllFloor> implements IRate {
    private final String TYPE_NAME = "モンスター";

    public MonsterDungeonRate(DungeonIndex dungeonIndex, byte[] rom) {
        super(dungeonIndex, rom);
    }

    public MonsterRateAllFloor analyzeRate(byte[] rom) {
        return new MonsterRateAllFloor(rom, dungeonIndex);
    }

    @Override
    public StringBuilder makeRateRatioTable() {
        return makeRateTable(makeRateRatioTablePrefix(getTypeName()), makeHeader(), rateAllFloor.makeRatioRowBody());
    }

    @Override
    public StringBuilder makeRatePercentTable() {
        return makeRateTable(makeRatePercentTablePrefix(getTypeName()), makeHeader(), rateAllFloor.makePercentRowBody());
    }

    public StringBuilder makeRateTable(StringBuilder prefix, List<String> header, OutputRowBodies outputRowBodies) {
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        sb.append(makeTableFromHeaderAndBody(header, outputRowBodies));
        return sb;
    }

    public StringBuilder makeTableFromHeaderAndBody(List<String> header, OutputRowBodies outputRowBodies) {

        StringBuilder sb = new StringBuilder();

        sb.append(getTablePrefix());
        sb.append(mixHeaderAndBody(header, outputRowBodies));
        sb.append(getTableSuffix());

        return sb;
    }

    private StringBuilder mixHeaderAndBody(List<String> header, OutputRowBodies outputRowBodies) {
        // mix header and body
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < header.size(); i++) {
            sb.append(header.get(i));

            sb.append(makeBodyRow(outputRowBodies.getOutputBodies().get(i)));

            // for header
            if (i == 0) {
                sb.append("c");
            }

            sb.append("\n");
        }
        return sb;
    }

    private String makeBodyRow(OutputRowBody bodyOneFloor) {
        StringBuilder sb = new StringBuilder();
        for (String body : bodyOneFloor.getBody()) {
            sb.append(body);
        }
        return sb.toString();
    }

    @Override
    protected List<String> makeHeader(String headerString, List<ICode> iCodes) {

        // make item type table
        List<String> header = new ArrayList<>();

        // make header
        header.add("|RIGHT:SIZE(9):|");

        for (int i = 1; i < rateAllFloor.getRateOneFloors().size() + 1; i++) {
            header.add("|~" + i + "|");
        }
        return header;
    }


    @Override
    protected String getTypeName() {
        return TYPE_NAME;
    }

}
