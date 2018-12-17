package com.kartikpatodi.patterns.decorator;

public class Main {
    public static void main(String[] args) {
        System.out.println("****Decorator Pattern****\n");

        ConcreteComponent cc = new ConcreteComponent();
        ConcreteDecorator1 cd1 = new ConcreteDecorator1();
        //Decorating ConcreteComponent cc with ConcreteDecorator1
        cd1.setComponent(cc);
        cd1.doJob();

        ConcreteDecorator2 cd2 = new ConcreteDecorator2();
        //Decorating ConcreteComponent cc with ConcreteDecorator2
        cd2.setComponent(cc);
        cd2.doJob();
    }
}
