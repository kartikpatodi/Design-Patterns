package com.kartikpatodi.patterns.iterator.aggregate;

import com.kartikpatodi.patterns.iterator.iter.IIterator;

public interface ISubject {
    IIterator createIterator();
}
