package com.tutorialspoint.behavioral.template;

import org.junit.Test;

public class TemplatePatternDemo {
    @Test
    public void main() {
        Game game = new Cricket();
        game.play();

        System.out.println();
        game = new Football();
        game.play();
    }
}