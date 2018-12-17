package com.kartikpatodi.patterns.observer.subjects;

import com.kartikpatodi.patterns.observer.observers.IObserver;

import java.util.ArrayList;
import java.util.List;

public class Subject1 implements ISubject {

    private int value;

    private List<IObserver> observers;

    public Subject1() {
        value = 0;
        observers = new ArrayList<>();
    }

    @Override
    public void register(IObserver o) {
        observers.add(o);
    }

    @Override
    public void unregister(IObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer ->
                observer.update(
                        this.getClass().getSimpleName(),
                        getValue()
                )
        );
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        notifyObservers();
    }
}
