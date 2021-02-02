package com.epam.jwd.handler.parser.impl;

import com.epam.jwd.handler.composite.impl.Lexeme;
import com.epam.jwd.handler.composite.Text;
import com.epam.jwd.handler.parser.Parser;
import com.epam.jwd.handler.util.RegexConstants;

public enum LexemeParser implements Parser {

    INSTANCE;

    @Override
    public Text parse(String text) {
        Lexeme lexeme = new Lexeme();
        if (text.matches(RegexConstants.WORD_REGEX)) {
//            char[] chars = text.toCharArray();
//            String word = text;
//            for (char c : chars) {
//                if (!((64 < c && c < 91) || (96 < c && c < 123) || c == 45)) {
//                    word = word.replace(String.valueOf(c), "");
//                }
//            }
//
//            int amountOfPunctuationInTheBeginning = 0;
//            for (char c : chars) {
//                if (((64 < c && c < 91) || (96 < c && c < 123) || c == 45)) {
//                    break;
//                }
//                PunctuationParser.INSTANCE.parse(String.valueOf(c));
//                amountOfPunctuationInTheBeginning++;
//            }
//            WordParser.INSTANCE.parse(word);
//            for (int i = amountOfPunctuationInTheBeginning; i < chars.length; i++) {
//                if (((64 < chars[i] && chars[i] < 91) || (96 < chars[i] && chars[i] < 123) || chars[i] == 45)) {
//                    continue;
//                }
//                PunctuationParser.INSTANCE.parse(String.valueOf(chars[i]));
//            }
            lexeme.add(WordParser.INSTANCE.parse(text)); // todo: parse punctuation after word
        } else if (text.matches(RegexConstants.DASH_REGEX) || text.matches(RegexConstants.PUNCTUATION_REGEX)) {
            lexeme.add(PunctuationParser.INSTANCE.parse(text));
        } else {
            lexeme.add(ExpressionParser.INSTANCE.parse(text));
        }
        return lexeme;

    }

//    private void divideIntoWordAndPunctuation(String text) {
//        String word = removePunctuationFromLexeme(text);
//        int amount = findAmountOfPunctuationInTheBeginning(text.toCharArray());
//
//        Main.textMajorComposite.getLastChild().getLastChild().getLastChild().add(new Word((word)));
//        WordParser.INSTANCE.parse(word);
//
//        addPunctuationToTheEnd(text.toCharArray(), amount);
//    }
//
//    private String removePunctuationFromLexeme(String text) {
//        String word = text;
//        for (char c : text.toCharArray()) {
//            if (!((64 < c && c < 91) || (96 < c && c < 123))) {
//                word = word.replace(String.valueOf(c), "");
//            }
//        }
//        return word;
//    }
//
//    private int findAmountOfPunctuationInTheBeginning(char[] chars) {
//        int amountOfPunctuationInTheBeginning = 0;
//        for (char c : chars) {
//            if (((64 < c && c < 91) || (96 < c && c < 123))) {
//                break;
//            }
//            Main.textMajorComposite.getLastChild().getLastChild().getLastChild().add(new Punctuation((String.valueOf(c))));
//            PunctuationParser.INSTANCE.parse(String.valueOf(c));
//            amountOfPunctuationInTheBeginning++;
//        }
//        return amountOfPunctuationInTheBeginning;
//    }
//
//    private void addPunctuationToTheEnd(char[] chars, int amount) {
//        for (int i = amount; i < chars.length; i++) {
//            if (((64 < chars[i] && chars[i] < 91) || (96 < chars[i] && chars[i] < 123))) {
//                continue;
//            }
//            Main.textMajorComposite.getLastChild().getLastChild().getLastChild().add(new Punctuation((String.valueOf(chars[i]))));
//            PunctuationParser.INSTANCE.parse(String.valueOf(chars[i]));
//        }
//    }

}
