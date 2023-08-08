package com.lsx3.shiren2.analyzer.common;

import java.util.List;

public class OutputRowBody {
    private List<String> body;

    public OutputRowBody(List<String> body) {
        this.body = body;
    }

    public List<String> getBody() {
        return body;
    }

    public boolean equals(OutputRowBody outputBody) {
        for (int i = 1; i < body.size(); i++) {
            if (!body.get(i).equals(outputBody.getBody().get(i))) {
                return false;
            }
        }
        return true;
    }
}
