package com.epam.jwd.handler.parser;

import com.epam.jwd.handler.composite.Text;

public interface Parser {

    Text parse(String text);
}
