package com.kartikpatodi.patterns.observer.subjects;

import com.kartikpatodi.patterns.observer.observers.IObserver;

public interface ISubject {
    void register(IObserver o);
    void unregister(IObserver o);
    void notifyObservers();
}
