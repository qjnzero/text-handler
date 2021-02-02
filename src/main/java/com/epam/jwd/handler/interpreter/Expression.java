package com.epam.jwd.handler.interpreter;

@FunctionalInterface
public interface Expression {

    static Expression number(int number) {
        return () -> number;
    }

    static Expression plus(Expression left, Expression right) {
        return () -> left.interpret() + right.interpret();
    }

    static Expression minus(Expression left, Expression right) {
        return () -> left.interpret() - right.interpret();
    }

    static Expression multiply(Expression left, Expression right) {
        return () -> left.interpret() * right.interpret();
    }

    static Expression divide(Expression left, Expression right) {
        return () -> left.interpret() / right.interpret();
    }

    int interpret();
}
