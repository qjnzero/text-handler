package com.epam.jwd.handler.composite.impl;

import com.epam.jwd.handler.composite.Text;

public class Sign implements Text {

    private final String sign;

    public Sign(String sign) {
        this.sign = sign;
    }

    public void add(Text text) {
        throw new UnsupportedOperationException();
    }

    public String collectToText() {
        return sign;
    }
}
