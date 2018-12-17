package com.kartikpatodi.patterns.iterator;

import com.kartikpatodi.patterns.iterator.aggregate.Arts;
import com.kartikpatodi.patterns.iterator.aggregate.ISubject;
import com.kartikpatodi.patterns.iterator.aggregate.Science;
import com.kartikpatodi.patterns.iterator.iter.IIterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("****Iterator Pattern****\n");

        ISubject arts = new Arts();
        ISubject science = new Science();

        IIterator artsIter = arts.createIterator();
        IIterator scienceIter = science.createIterator();

        System.out.println("Arts Subject :");
        println(artsIter);

        System.out.println("Science Subject :");
        println(scienceIter);
    }

    private static void println(IIterator iter) {
        while (!iter.isDone()) {
            System.out.println("=> " + iter.next());
        }
        System.out.println();
    }
}
