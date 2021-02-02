package com.epam.jwd.handler.parser.impl;

import com.epam.jwd.handler.composite.impl.Sentence;
import com.epam.jwd.handler.composite.Text;
import com.epam.jwd.handler.parser.Parser;
import com.epam.jwd.handler.util.RegexConstants;

public enum SentenceParser implements Parser {

    INSTANCE;

    @Override
    public Text parse(String text) {
        Sentence sentence = new Sentence();
        for (String s : text.trim().split(RegexConstants.LEXEME_REGEX)) {
            sentence.add(LexemeParser.INSTANCE.parse(s));
        }
        return sentence;
    }
}
