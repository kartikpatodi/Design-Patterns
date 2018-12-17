package com.kartikpatodi.patterns.command;

public class Invoke {
    ICommand cmd;

    public void executeCommand(ICommand cmd) {
        this.cmd = cmd;
        cmd.doCmd();
    }
}
