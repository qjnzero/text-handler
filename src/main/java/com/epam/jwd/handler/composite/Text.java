package com.epam.jwd.handler.composite;

import java.util.List;

public interface Text {

    void add(Text text);

    String collectToText();

    List<Text> getChildren();

    int getAmountOfChildren();

}
