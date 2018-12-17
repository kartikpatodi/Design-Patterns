package com.kartikpatodi.patterns.template;

public class Main {
    public static void main(String[] args) {
        System.out.println("****Template Patterns****\n");

        BasicEngg basicEngg = new ComputerScience();
        System.out.println("Computer Science Papers");
        basicEngg.papers();

        System.out.println();

        basicEngg = new Electronics();
        System.out.println("Electronics Papers");
        basicEngg.papers();

    }

}
