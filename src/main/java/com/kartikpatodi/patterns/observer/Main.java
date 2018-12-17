package com.kartikpatodi.patterns.observer;

import com.kartikpatodi.patterns.observer.observers.Observer1;
import com.kartikpatodi.patterns.observer.observers.Observer2;
import com.kartikpatodi.patterns.observer.observers.Observer3;
import com.kartikpatodi.patterns.observer.subjects.Subject1;
import com.kartikpatodi.patterns.observer.subjects.Subject2;

public class Main {
    public static void main(String[] args) {
        System.out.println("****Observer Pattern****\n");

        Subject1 sub1 = new Subject1();
        Subject2 sub2 = new Subject2();

        Observer1 ob1 = new Observer1();
        Observer2 ob2 = new Observer2();
        Observer3 ob3 = new Observer3();

        //ob1 and ob2 registers to sub1
        sub1.register(ob1);
        sub1.register(ob2);

        //ob2 and ob3 registers to sub1
        sub2.register(ob2);
        sub2.register(ob3);

        //change sub1 value -> 10
        //ob1 and ob2 notified
        sub1.setValue(10);
        System.out.println();

        //change sub2 value -> 20
        //ob2 and ob3 notified
        sub2.setValue(20);
        System.out.println();

        //unregister Observer2 from Subject 1
        sub1.unregister(ob2);

        //change sub1 value -> 30
        //only ob1 is notified
        sub1.setValue(30);
        System.out.println();

        //change sub2 value -> 40
        //ob2 can still notice change in sub2
        sub2.setValue(40);
    }
}
