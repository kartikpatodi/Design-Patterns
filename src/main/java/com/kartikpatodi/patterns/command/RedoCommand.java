package com.kartikpatodi.patterns.command;

public class RedoCommand implements ICommand {

    Receiver receiver;

    public RedoCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void doCmd() {
        receiver.performRedo();
    }
}
