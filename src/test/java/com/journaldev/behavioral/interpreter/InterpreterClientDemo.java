package com.journaldev.behavioral.interpreter;

import org.junit.Test;

public class InterpreterClientDemo {
    @Test
    public void interpret() {
        String str1 = "28 in Binary";
        String str2 = "28 in Hexadecimal";

        InterpreterClient ec = new InterpreterClient(new InterpreterContext());
        System.out.println(str1 + "= " + ec.interpret(str1));
        System.out.println(str2 + "= " + ec.interpret(str2));

    }
}