package com.kartikpatodi.patterns.command;

public class Receiver {

    public void performUndo(){
        System.out.println("Performing Undo");
    }

    public void performRedo(){
        System.out.println("Performing Redo");
    }

}
