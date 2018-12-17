package com.kartikpatodi.patterns.decorator;

public class ConcreteDecorator2 extends AbstractDecorator {
    @Override
    public void doJob() {
        System.out.println("**Start ConcreteDecorator2**");
        super.doJob();
        System.out.println("I am explicitly from ConcreteDecorator2");
        System.out.println("**End ConcreteDecorator2**");
    }
}
