package com.kartikpatodi.patterns.adapter;

public class Calculator {

    Rectangle rect;

    public double getArea(Rectangle rect){
        this.rect = rect;
        return rect.l * rect.w;
    }
}
