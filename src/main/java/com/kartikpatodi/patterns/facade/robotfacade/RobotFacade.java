package com.kartikpatodi.patterns.facade.robotfacade;

import com.kartikpatodi.patterns.facade.robotparts.RobotBody;
import com.kartikpatodi.patterns.facade.robotparts.RobotColor;
import com.kartikpatodi.patterns.facade.robotparts.RobotMetal;

public class RobotFacade {

    RobotColor rc;
    RobotBody rb;
    RobotMetal rm;

    public RobotFacade() {
        this.rc = new RobotColor();
        this.rb = new RobotBody();
        this.rm = new RobotMetal();
    }

    public void createRobot(String color, String metal){
        System.out.println("Robot creation start");
        rc.setColor(color);
        rm.setMetal(metal);
        rb.createBody();
        System.out.println("Robot creation end");
        System.out.println();
    }
}
