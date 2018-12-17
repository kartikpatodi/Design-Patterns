package com.kartikpatodi.patterns.factory.animalfactory;

import com.kartikpatodi.patterns.factory.animal.Duck;
import com.kartikpatodi.patterns.factory.animal.IAnimal;
import com.kartikpatodi.patterns.factory.animal.Tiger;

public class Factory {

    public IAnimal getAnimalType(String type) {
        switch (type) {
            case "duck":
                return new Duck();
            case "tiger":
                return new Tiger();
            default:
                throw new IllegalArgumentException("Wrong type");
        }
    }

}
