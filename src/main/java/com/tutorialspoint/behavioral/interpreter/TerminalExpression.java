package com.tutorialspoint.behavioral.interpreter;

public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        System.out.println("interpret in TerminalExpression");
        if (context.contains(data)) {
            return true;
        }
        return false;
    }
}
