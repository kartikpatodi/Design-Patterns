package com.kartikpatodi.patterns.iterator.iter;

public interface IIterator<T> {
    void first();
    T next();
    boolean isDone();
    T currentItem();
}
