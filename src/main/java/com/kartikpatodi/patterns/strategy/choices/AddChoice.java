package com.kartikpatodi.patterns.strategy.choices;

public class AddChoice implements IChoice {

    @Override
    public void myChoice(String s1, String s2) {
        System.out.println("You wanted to add the numbers");
        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);
        int sum = i1 + i2;
        System.out.println("Result is : " + sum + "\n");
    }
}
