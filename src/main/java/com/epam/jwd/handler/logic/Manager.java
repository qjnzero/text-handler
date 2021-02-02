package com.epam.jwd.handler.logic;

public final class Manager {

    private Manager() {
    }

    public static void sortParagraphsByAmountOfSentences() {
//        List<AbstractText> paragraphs = Main.textMajorComposite.getTextChildren();
//        paragraphs.sort(Comparator.comparingInt(AbstractText::getAmountOfChildren).reversed());
    }

    public static void sortSentencesByAmountOfLexemes() {
//        List<AbstractText> paragraphs = Main.textMajorComposite.getTextChildren();
//        List<AbstractText> allSentences = new ArrayList<>();
//        for (AbstractText paragraph : paragraphs) {
//            allSentences.addAll(paragraph.getTextChildren());
//        }
//        allSentences.sort(Comparator.comparingInt(AbstractText::getAmountOfChildren));
    }

//    public static void sortSentencesByLengthOfLexemes() {
////        List<AbstractText> paragraphs = Main.textMajorComposite.getTextChildren();
//
//        List<AbstractText> allSentences = new ArrayList<>();
//        for (AbstractText paragraph : paragraphs) {
//            allSentences.addAll(paragraph.getTextChildren());
//        }
//        Comparator<AbstractText> comparator = (s1, s2) -> {
//            int firstLexemesSum = 0;
//            for (AbstractText l : s1.getTextChildren()) {
//                firstLexemesSum += l.collectToText().length();
//            }
//            int secondLexemesSum = 0;
//            for (AbstractText l : s2.getTextChildren()) {
//                secondLexemesSum += l.collectToText().length();
//            }
//            return firstLexemesSum - secondLexemesSum;
//        };
//        allSentences.sort(comparator);
//    }
//
//    public static void sortSentencesByAmountOfPunctuation() {
//        List<AbstractText> paragraphs = Main.textMajorComposite.getTextChildren();
//
//        List<AbstractText> allSentences = new ArrayList<>();
//        for (AbstractText paragraph : paragraphs) {
//            allSentences.addAll(paragraph.getTextChildren());
//        }
////        Comparator<AbstractText> comparator = ()
//    }
}
