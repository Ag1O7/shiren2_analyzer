package com.lsx3.shiren2.analyzer.common;

import java.util.List;

public class OutputBody {
    private int fromFloor;
    private int toFloor;

    private List<String> body;

    public OutputBody(int fromFloor, int toFloor, List<String> body) {
        this.fromFloor = fromFloor;
        this.toFloor = toFloor;
        this.body = body;
    }

    public int getFromFloor() {
        return fromFloor;
    }

    public int getToFloor() {
        return toFloor;
    }

    public void setToFloor(int toFloor) {
        this.toFloor = toFloor;
    }

    public List<String> getBody() {
        return body;
    }

    public boolean equals(OutputBody outputBody) {
        for (int i = 1; i < body.size(); i++) {
            if (!body.get(i).equals(outputBody.getBody().get(i))) {
                return false;
            }
        }
        return true;
    }
}
