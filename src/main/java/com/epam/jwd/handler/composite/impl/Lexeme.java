package com.epam.jwd.handler.composite.impl;

import com.epam.jwd.handler.composite.Text;

import java.util.ArrayList;
import java.util.List;

public class Lexeme implements Text {

    private final List<Text> children = new ArrayList<>();

    public void add(Text text) {
        children.add(text);
    }

    public String collectToText() {
        StringBuilder lexeme = new StringBuilder();
        for (Text wordOrExpOrPunct: children) {
            lexeme.append(wordOrExpOrPunct.collectToText());
        }
        return String.valueOf(lexeme);
    }
}
