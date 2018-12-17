package com.kartikpatodi.patterns.command;

public class Main {

    public static void main(String[] args) {
        System.out.println("****Command Pattern****\n");

        Receiver intendedReceiver = new Receiver();
        Invoke invoke = new Invoke();
        UndoCommand undoCmd = new UndoCommand(intendedReceiver);
        RedoCommand redoCmd = new RedoCommand(intendedReceiver);

        //undo
        invoke.executeCommand(undoCmd);
        //redo
        invoke.executeCommand(redoCmd);
    }

}
