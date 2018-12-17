package com.kartikpatodi.patterns.state;

public class Main {
    public static void main(String[] args) {
        System.out.println("****State Pattern****\n");

        // Initially the TV is off
        Off initState = new Off();

        TV tv = new TV(initState);

        // First time press
        tv.pressButton();

        // Second time press
        tv.pressButton();
    }
}
