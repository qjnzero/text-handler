package com.epam.jwd.handler.composite.impl;

import com.epam.jwd.handler.composite.Text;

import java.util.ArrayList;
import java.util.List;

public class Paragraph implements Text {

    private final List<Text> children = new ArrayList<>();


    public void add(Text text) {
        children.add(text);
    }

    public String collectToText() {
        StringBuilder paragraph = new StringBuilder();
        for (Text sentence : children) {
            paragraph.append(sentence.collectToText());
        }
        return String.valueOf(paragraph);
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
