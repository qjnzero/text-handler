package com.epam.jwd.handler.parser.impl;

import com.epam.jwd.handler.composite.impl.MajorText;
import com.epam.jwd.handler.composite.Text;
import com.epam.jwd.handler.parser.Parser;
import com.epam.jwd.handler.util.RegexConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum TextParser implements Parser {

    INSTANCE;

    @Override
    public Text parse(String text) {
        Pattern p = Pattern.compile(RegexConstants.PARAGRAPH_REGEX);
        Matcher m = p.matcher(text);
        Text majorText = new MajorText();
        while (m.find()) {
            String foundParagraph = m.group();
            majorText.add(ParagraphParser.INSTANCE.parse(foundParagraph));
        }
        return majorText;
    }
}
