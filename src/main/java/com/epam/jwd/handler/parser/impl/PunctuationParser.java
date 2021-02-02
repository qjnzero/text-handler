package com.epam.jwd.handler.parser.impl;

import com.epam.jwd.handler.composite.impl.Punctuation;
import com.epam.jwd.handler.composite.impl.Sign;
import com.epam.jwd.handler.composite.Text;
import com.epam.jwd.handler.parser.Parser;
import com.epam.jwd.handler.util.RegexConstants;

public enum PunctuationParser implements Parser {

    INSTANCE;

    @Override
    public Text parse(String text) {
        Punctuation punctuation = new Punctuation();
        for (String s : text.split(RegexConstants.EMPTY_REGEX)) {
            punctuation.add(new Sign((s)));
        }
        return punctuation;
    }
}
