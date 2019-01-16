package com.journaldev.structural.composite;

import org.junit.Test;

public class CompositeTest {
    @Test
    public void composite() {
        Shape triangle = new Triangle();
        Shape tri1 = new Triangle();
        Shape circle = new Circle();

        Drawing drawing = new Drawing();
        drawing.add(triangle);
        drawing.add(tri1);
        drawing.add(circle);

        drawing.draw("Red");

        drawing.clear();

        drawing.add(triangle);
        drawing.add(circle);
        drawing.draw("Green");
    }

}