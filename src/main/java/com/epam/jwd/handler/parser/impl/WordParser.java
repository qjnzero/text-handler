package com.epam.jwd.handler.parser.impl;

import com.epam.jwd.handler.composite.impl.Sign;
import com.epam.jwd.handler.composite.Text;
import com.epam.jwd.handler.composite.impl.Word;
import com.epam.jwd.handler.parser.Parser;
import com.epam.jwd.handler.util.RegexConstants;

public enum WordParser implements Parser {

    INSTANCE;

    @Override
    public Text parse(String text) {
        Word word = new Word();
        for (String s : text.split(RegexConstants.EMPTY_REGEX)) {
            word.add(new Sign((s)));
        }
        return word;
    }
}
