package com.kartikpatodi.patterns.memento;

public class Caretaker {
    private Memento _memento;

    public void saveMemento(Memento m) {
        this._memento = m;
    }

    public Memento retrieveMemento() {
        return this._memento;
    }
}
