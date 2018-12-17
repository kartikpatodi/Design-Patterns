package com.kartikpatodi.patterns.facade.robotparts;

public class RobotColor {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("=> Color is set to " + color);
    }
}
