package com.kartikpatodi.patterns.singleton;

public class BillPughSingleton {
    private static BillPughSingleton instance;

    private BillPughSingleton() {
    }

    private static class BillPughSingletonHelper {
        private static final BillPughSingleton instance = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return BillPughSingletonHelper.instance;
    }
}
