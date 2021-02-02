package com.epam.jwd.handler.util;

public final class RegexConstants {

    private RegexConstants() {
    }

    public static final String PARAGRAPH_REGEX = "\\s{4}[A-Z].*(\\.|!|\\?|\\.\\.\\.)";
    public static final String SENTENCE_REGEX = ".*?(\\.|!|\\?|\\.\\.\\.)";
    public static final String LEXEME_REGEX = " ";
    public static final String WORD_REGEX = "^(\\(|\"|[a-zA-Z]*)[a-zA-Z].*";
    public static final String PUNCTUATION_REGEX = "\\p{Punct}";
    public static final String DASH_REGEX = "–";
    public static final String EMPTY_REGEX = "";
}
