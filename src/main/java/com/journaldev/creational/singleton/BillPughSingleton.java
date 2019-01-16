package com.journaldev.creational.singleton;

public class BillPughSingleton {
    private static BillPughSingleton instance;

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE
                = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
