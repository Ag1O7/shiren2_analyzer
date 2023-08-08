package com.lsx3.shiren2.analyzer.common;

import java.util.ArrayList;
import java.util.List;

public class OutputBodies {
    private List<OutputBody> outputBodies;

    public OutputBodies() {
        this.outputBodies = new ArrayList<>();
    }

    public List<OutputBody> getOutputBodies() {
        return outputBodies;
    }

    public void addBody(OutputBody outputBody) {
        if (outputBodies.size() == 0) {
            outputBodies.add(outputBody);
            return;
        }

        OutputBody previousOutputBody = outputBodies.get(outputBodies.size() - 1);
        if (!outputBody.equals(previousOutputBody)) {
            outputBodies.add(outputBody);
            return;
        }

        // only add 1 to header
        int toFloor = outputBodies.get(outputBodies.size() - 1).getToFloor() + 1;
        outputBodies.get(outputBodies.size() - 1).setToFloor(toFloor);
    }

}
