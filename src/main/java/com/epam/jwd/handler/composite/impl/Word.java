package com.epam.jwd.handler.composite.impl;

import com.epam.jwd.handler.composite.Text;

import java.util.ArrayList;
import java.util.List;

public class Word implements Text {

    private final List<Text> children = new ArrayList<>();

    public void add(Text text) {
        children.add(text);
    }

    public String collectToText() {
        StringBuilder word = new StringBuilder();
        for (Text sign : children) {
            word.append(sign.collectToText());
        }
        return String.valueOf(word);
    }
}
