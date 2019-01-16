package com.journaldev.creational.singleton;

public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {}

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception _ex) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
}
