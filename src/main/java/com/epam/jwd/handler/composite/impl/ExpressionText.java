package com.epam.jwd.handler.composite.impl;

import com.epam.jwd.handler.composite.Text;
import com.epam.jwd.handler.interpreter.Expression;
import com.epam.jwd.handler.interpreter.Tokenizer;

import java.util.ArrayList;
import java.util.List;

public class ExpressionText implements Text {

    private final List<Text> children = new ArrayList<>();

    public void add(Text text) {
        children.add(text);
    }

    public String collectToText() {
        StringBuilder sBuilderExpression = new StringBuilder();
        for (Text sign : children) {
            sBuilderExpression.append(sign.collectToText());
        }

        Expression expression = Tokenizer.parse(String.valueOf(sBuilderExpression));

        return String.valueOf(expression.interpret());
    }
}
