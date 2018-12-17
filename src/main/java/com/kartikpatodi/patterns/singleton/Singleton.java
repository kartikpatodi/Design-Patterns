package com.kartikpatodi.patterns.singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
            System.out.println("New instance is created");
        } else {
            System.out.println("Using existing instance");
        }
        return instance;
    }
}

