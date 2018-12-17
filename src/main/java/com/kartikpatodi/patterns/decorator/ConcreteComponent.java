package com.kartikpatodi.patterns.decorator;

public class ConcreteComponent extends Component{

    @Override
    public void doJob() {
        System.out.println("I am from Concrete component and I am closed for modification");
    }
}


