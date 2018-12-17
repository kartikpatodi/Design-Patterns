package com.kartikpatodi.patterns.command;

public class UndoCommand implements ICommand {

    Receiver receiver;

    public UndoCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void doCmd() {
        receiver.performUndo();
    }
}
