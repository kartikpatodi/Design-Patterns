package com.kartikpatodi.patterns.state;

public class On extends RemoteControl {

    @Override
    public void pressSwitch(TV context) {
        System.out.println("I am On... Going to be Off now...");
        context.setState(new Off());
    }}
