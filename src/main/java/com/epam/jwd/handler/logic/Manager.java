package com.epam.jwd.handler.logic;

import com.epam.jwd.handler.composite.Text;
import com.epam.jwd.handler.parser.impl.TextParser;
import com.epam.jwd.handler.reader.Reader;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class Manager {

    private static final String INPUT_FILE_PATH = "src/main/resources/input.file";
    private static final String text = Reader.read(INPUT_FILE_PATH);
    private static final Text PARSED_TEXT = TextParser.INSTANCE.parse(text);

    private Manager() {
    }

    public static List<Text> sortParagraphsByAmountOfSentences() {
        List<Text> paragraphs = PARSED_TEXT.getChildren();
        paragraphs.sort(Comparator.comparingInt(Text::getAmountOfChildren).reversed());
        return paragraphs;
    }

    public static List<Text> sortSentencesByAmountOfLexemes() {
        List<Text> paragraphs = PARSED_TEXT.getChildren();
        List<Text> allSentences = new ArrayList<>();
        for (Text paragraph : paragraphs) {
            allSentences.addAll(paragraph.getChildren());
        }
        allSentences.sort(Comparator.comparingInt(Text::getAmountOfChildren));
        return allSentences;
    }

    public static List<Text> sortSentencesByLengthOfLexemes() {
        List<Text> paragraphs = PARSED_TEXT.getChildren();

        List<Text> allSentences = new ArrayList<>();
        for (Text paragraph : paragraphs) {
            allSentences.addAll(paragraph.getChildren());
        }
        Comparator<Text> comparator = (s1, s2) -> {
            int firstLexemesSum = 0;
            for (Text l : s1.getChildren()) {
                firstLexemesSum += l.collectToText().length();
            }
            int secondLexemesSum = 0;
            for (Text l : s2.getChildren()) {
                secondLexemesSum += l.collectToText().length();
            }
            return firstLexemesSum - secondLexemesSum;
        };
        allSentences.sort(comparator);
        return allSentences;
    }

    public static void sortSentencesByAmountOfPunctuation() {
        // todo:
//        List<AbstractText> paragraphs = Main.textMajorComposite.getTextChildren();
//
//        List<AbstractText> allSentences = new ArrayList<>();
//        for (AbstractText paragraph : paragraphs) {
//            allSentences.addAll(paragraph.getTextChildren());
//        }
//        Comparator<AbstractText> comparator = ()
    }
}
