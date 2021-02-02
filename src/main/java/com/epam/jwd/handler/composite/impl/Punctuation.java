package com.epam.jwd.handler.composite.impl;

import com.epam.jwd.handler.composite.Text;

import java.util.ArrayList;
import java.util.List;

public class Punctuation implements Text {

    private final List<Text> children = new ArrayList<>();

    public void add(Text text) {
        children.add(text);
    }

    public String collectToText() {
        StringBuilder punct = new StringBuilder();
        for (Text sign : children) {
            punct.append(sign.collectToText());
        }
        return String.valueOf(punct);
    }

    @Override
    public List<Text> getChildren() {
        return new ArrayList<>(children);
    }

    @Override
    public int getAmountOfChildren() {
        return children.size();
    }
}
