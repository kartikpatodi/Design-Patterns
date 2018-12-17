package com.kartikpatodi.patterns.observer.observers;

public class Observer1 implements IObserver {

    @Override
    public void update(String subjName, int newValue) {
        System.out.printf(
                "%s: value in %s is now %d%n",
                this.getClass().getSimpleName(),
                subjName,
                newValue
        );
    }
}
