package com.kartikpatodi.patterns.factory;

import com.kartikpatodi.patterns.factory.animal.IAnimal;
import com.kartikpatodi.patterns.factory.animalfactory.Factory;

public class Main {
    public static void main(String[] args) {
        System.out.println("****Factory Pattern****\n");

        Factory factory = new Factory();
        IAnimal duck = factory.getAnimalType("duck");
        IAnimal tiger = factory.getAnimalType("tiger");

        duck.speak();
        tiger.speak();
    }
}
