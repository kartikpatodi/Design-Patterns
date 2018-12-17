package com.kartikpatodi.patterns.adapter;

public class CalculatorTriangleAdapter {

    Calculator calRect;
    Triangle tr;

    public double getArea(Triangle tr) {
        this.tr = tr;
        calRect = new Calculator();
        Rectangle mapperRect = new Rectangle(0.5 * tr.b, tr.h);
        return calRect.getArea(mapperRect);
    }

}
