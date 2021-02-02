package com.epam.jwd.handler.composite.impl;

import com.epam.jwd.handler.composite.Text;

import java.util.ArrayList;
import java.util.List;

public class MajorText implements Text {

    private final List<Text> children = new ArrayList<>();

    public void add(Text text) {
        children.add(text);
    }

    public String collectToText() {
        StringBuilder text = new StringBuilder();
        for (Text paragraph : children) {
            text.append("    ");
            text.append(paragraph.collectToText());
            text.replace(text.length() - 1, text.length(), "");
            text.append("\n");
        }
        return String.valueOf(text);
    }
}
