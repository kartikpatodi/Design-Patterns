package com.kartikpatodi.patterns.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("****Singleton Pattern****\n");

        //First call
        Singleton singleton1 = Singleton.getInstance();
        //Second call
        Singleton singleton2 = Singleton.getInstance();

    }
}
