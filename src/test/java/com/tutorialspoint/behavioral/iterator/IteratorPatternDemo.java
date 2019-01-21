package com.tutorialspoint.behavioral.iterator;

import org.junit.Test;

public class IteratorPatternDemo {
    @Test
    public void main() {
        NameRepository nameRepository = new NameRepository();

        for (Iterator iter = nameRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }

}