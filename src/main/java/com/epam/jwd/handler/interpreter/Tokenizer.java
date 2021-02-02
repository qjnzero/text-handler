package com.epam.jwd.handler.interpreter;

import com.epam.jwd.handler.util.RegexConstants;

import java.util.ArrayDeque;

public final class Tokenizer {

    private Tokenizer() {
    }

    private static Expression tokenize(String token, ArrayDeque<Expression> stack) {
        Expression left, right;
        switch (token) {
            case "+":
                right = stack.pop();
                left = stack.pop();
                return Expression.plus(left, right);
            case "-":
                right = stack.pop();
                left = stack.pop();
                return Expression.minus(left, right);
            case "*":
                right = stack.pop();
                left = stack.pop();
                return Expression.multiply(left, right);
            case "/":
                right = stack.pop();
                left = stack.pop();
                return Expression.divide(left, right);
            default:
                return Expression.number(Integer.parseInt(token));
        }
    }

    public static Expression parse(String expression) {
        ArrayDeque<Expression> stack = new ArrayDeque<>();
        for (String token : expression.split(RegexConstants.EMPTY_REGEX)) {
            stack.push(tokenize(token, stack));
        }
        return stack.pop();
    }
}
