package com.kartikpatodi.patterns.decorator;

public class ConcreteDecorator1 extends AbstractDecorator {
    @Override
    public void doJob() {
        super.doJob();
        System.out.println("I am explicitly from ConcreteDecorator1");
    }
}
