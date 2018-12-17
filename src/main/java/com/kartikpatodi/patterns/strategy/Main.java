package com.kartikpatodi.patterns.strategy;

import com.kartikpatodi.patterns.strategy.choices.AddChoice;
import com.kartikpatodi.patterns.strategy.choices.ConcatChoice;
import com.kartikpatodi.patterns.strategy.choices.Context;
import com.kartikpatodi.patterns.strategy.choices.IChoice;

public class Main {
    public static void main(String[] args) {
        System.out.println("****Strategy Pattern****\n");

        System.out.println("First integer : 5");
        System.out.println("Second integer : 5");
        System.out.println("\nChoice (1 or 2)" +
                "\n(1) Addition" +
                "\n(2) Concatenation\n");

        for (int i = 1; i <= 2; i++) {
            System.out.println("=> " + i);
            IChoice choice = null;
            Context ctx = new Context();

            switch (i) {
                case 1:
                    choice = new AddChoice();
                    break;
                case 2:
                    choice = new ConcatChoice();
                    break;
            }

            ctx.setChoice(choice);
            ctx.showChoice("5", "5");
        }

    }
}
