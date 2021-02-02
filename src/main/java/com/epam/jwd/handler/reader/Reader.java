package com.epam.jwd.handler.reader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class Reader {

    private static final String JOINER = "\n";

    private Reader() {
    }

    public static String read(String path) {
        try (Stream<String> stream = Files.lines(Paths.get(path))) {
            return stream.collect(Collectors.joining(JOINER));
        } catch (IOException e) {
            // todo: log
            throw new UnsupportedOperationException();
        }
    }
}
