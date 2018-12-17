package com.kartikpatodi.patterns.factory.animal;

public class Duck implements IAnimal {

    @Override
    public void speak() {
        System.out.println("Duck quacks");
    }
}
