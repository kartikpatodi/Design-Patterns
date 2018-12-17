package com.kartikpatodi.patterns.facade.robotparts;

public class RobotMetal {

    private String metal;

    public String getMetal() {
        return metal;
    }

    public void setMetal(String metal) {
        this.metal = metal;
        System.out.println("=> Metal is set to " + metal);
    }
}
