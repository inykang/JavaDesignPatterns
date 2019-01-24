package com.tutorialspoint.behavioral.visitor;

import org.junit.Test;

public class VisitorPatternDemo {
    @Test
    public void main() {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}