package com.lsx3.shiren2.analyzer.common;

import java.util.ArrayList;
import java.util.List;

public class OutputRowBodies {
    private List<OutputRowBody> outputBodies;

    public OutputRowBodies() {
        this.outputBodies = new ArrayList<>();
    }

    public List<OutputRowBody> getOutputBodies() {
        return outputBodies;
    }

    public void addBody(OutputRowBody outputBody) {
        outputBodies.add(outputBody);
    }
}
