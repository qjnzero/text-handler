package com.epam.jwd.handler.util;

import java.util.Stack;

public final class RpnConverter {

    private static final String operations = "-+/*^";

    private RpnConverter() {
    }

    public static String convertToRpn(String infix) {
        StringBuilder converted = new StringBuilder();
        Stack<Integer> s = new Stack<>();

        for (String token : infix.split(RegexConstants.EMPTY_REGEX)) {
            if (token.isEmpty()) {
                continue;
            }
            char c = token.charAt(0);
            int idx = operations.indexOf(c);

            // check for operator
            if (idx != -1) {
                if (!s.isEmpty()) {
                    while (!s.isEmpty()) {
                        int prec2 = s.peek() / 2;
                        int prec1 = idx / 2;
                        if (prec2 > prec1 || (prec2 == prec1 && c != '^')) {
                            converted.append(operations.charAt(s.pop()));
                        } else {
                            break;
                        }
                    }
                }
                s.push(idx);
            } else if (c == '(') {
                s.push(-2);
            } else if (c == ')') {
                while (s.peek() != -2) {
                    converted.append(operations.charAt(s.pop()));
                }
                s.pop();
            } else {
                converted.append(token);
            }
        }
        while (!s.isEmpty()) {
            converted.append(operations.charAt(s.pop()));
        }
        return converted.toString();
    }

}
