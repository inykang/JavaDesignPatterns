package com.tutorialspoint.behavioral.observer;

import org.junit.Test;

public class ObserverPatternDemo {
    @Test
    public void main() {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }

}