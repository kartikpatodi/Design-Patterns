package com.kartikpatodi.patterns.strategy.choices;

public class ConcatChoice implements IChoice {

    @Override
    public void myChoice(String s1, String s2) {
        System.out.println("You wanted to concatenate the numbers");
        String concat = s1 + s2;
        System.out.println("Result is : " + concat + "\n");
    }
}
