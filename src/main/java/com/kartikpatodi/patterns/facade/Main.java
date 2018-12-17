package com.kartikpatodi.patterns.facade;

import com.kartikpatodi.patterns.facade.robotfacade.RobotFacade;

public class Main {
    public static void main(String[] args) {
        System.out.println("****Facade Pattern****\n");

        RobotFacade rf1 = new RobotFacade();
        rf1.createRobot("Green","Iron");

        RobotFacade rf2 = new RobotFacade();
        rf2.createRobot("Blue","Steel");
    }
}
