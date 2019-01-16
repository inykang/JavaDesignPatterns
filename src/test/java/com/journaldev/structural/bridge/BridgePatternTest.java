package com.journaldev.structural.bridge;

import org.junit.Test;

import static org.junit.Assert.*;

public class BridgePatternTest {

    @Test
    public void testBridge() {
        Shape triangle = new Triangle(new RedColor());
        triangle.applyColor();

        Shape pentagon = new Pentagon(new GreenColor());
        pentagon.applyColor();
    }

}