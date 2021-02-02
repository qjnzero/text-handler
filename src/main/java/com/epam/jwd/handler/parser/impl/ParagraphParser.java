package com.epam.jwd.handler.parser.impl;

import com.epam.jwd.handler.composite.impl.Paragraph;
import com.epam.jwd.handler.composite.Text;
import com.epam.jwd.handler.parser.Parser;
import com.epam.jwd.handler.util.RegexConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum ParagraphParser implements Parser {

    INSTANCE;

    @Override
    public Text parse(String text) {
        String trimmedText = text.trim();
        Pattern p = Pattern.compile(RegexConstants.SENTENCE_REGEX);
        Matcher m = p.matcher(trimmedText);
        Paragraph paragraph = new Paragraph();
        while (m.find()) {
            String sentence = m.group();
            paragraph.add(SentenceParser.INSTANCE.parse(sentence));
        }
        return paragraph;
    }
}
