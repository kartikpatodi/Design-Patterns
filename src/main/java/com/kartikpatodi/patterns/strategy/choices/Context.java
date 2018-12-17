package com.kartikpatodi.patterns.strategy.choices;

public class Context {
    IChoice iChoice;

    public void setChoice(IChoice iChoice) {
        this.iChoice = iChoice;
    }

    public void showChoice(String s1, String s2) {
        iChoice.myChoice(s1, s2);
    }
}
