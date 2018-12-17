package com.kartikpatodi.patterns.template;

public abstract class BasicEngg {
    public void papers(){
        maths();
        softSkills();
        specialPaper();
    }

    public void maths(){
        System.out.println("=> Mathematics");
    }
    public void softSkills(){
        System.out.println("=> Soft Skills");
    }

    abstract public void specialPaper();
}
