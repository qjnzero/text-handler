package com.epam.jwd.handler.composite.impl;

import com.epam.jwd.handler.composite.Text;

import java.util.ArrayList;
import java.util.List;

public class Sentence implements Text {

    private final List<Text> children = new ArrayList<>();

    public void add(Text text) {
        children.add(text);
    }

    public String collectToText() {
        StringBuilder sentence = new StringBuilder();
        for (Text lexeme : children) {
            sentence.append(lexeme.collectToText());
            sentence.append(" ");
        }
        return String.valueOf(sentence);
    }
}
