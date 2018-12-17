package com.kartikpatodi.patterns.memento;

public class Originator {
    private String state;
    private Memento m;

    public void setState(String state) {
        this.state = state;
        System.out.println("Current state : " + state);
    }

    public Memento originatorMemento(){
        m = new Memento(state);
        return m;
    }

    public void revert(Memento m) {
        System.out.println("Restoring to previous state...");
        this.state = m.getState();
        System.out.println("Current state : " + state);
    }
}
