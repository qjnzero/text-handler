package com.epam.jwd.handler.parser.impl;

import com.epam.jwd.handler.composite.impl.ExpressionText;
import com.epam.jwd.handler.composite.impl.Sign;
import com.epam.jwd.handler.composite.Text;
import com.epam.jwd.handler.parser.Parser;
import com.epam.jwd.handler.util.RegexConstants;
import com.epam.jwd.handler.util.RpnConverter;

public enum ExpressionParser implements Parser {

    INSTANCE;

    public Text parse(String text) {
        ExpressionText expressionText = new ExpressionText();
        for (String s : RpnConverter.convertToRpn(text).split(RegexConstants.EMPTY_REGEX)) {
            expressionText.add(new Sign(s));
        }
        return expressionText;
    }

}
