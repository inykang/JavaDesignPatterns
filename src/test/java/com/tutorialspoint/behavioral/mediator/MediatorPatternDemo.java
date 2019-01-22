package com.tutorialspoint.behavioral.mediator;

import org.junit.Test;

import static org.junit.Assert.*;

public class MediatorPatternDemo {
    @Test
    public void main() {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi, John!");
        john.sendMessage("Hello! Robert!");
    }

}