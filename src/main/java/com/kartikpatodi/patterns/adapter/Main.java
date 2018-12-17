package com.kartikpatodi.patterns.adapter;

public class Main {
    public static void main(String[] args) {
        System.out.println("****Adapter Pattern****\n");

        System.out.println("Rectangle calculator l=10, w=10");
        Rectangle r = new Rectangle(10, 10);
        Calculator cal = new Calculator();
        System.out.println("Area = " + cal.getArea(r));

        System.out.println("Triangle calculator b=10, h=10");
        Triangle tr = new Triangle(10, 10);
        CalculatorTriangleAdapter calTr = new CalculatorTriangleAdapter();
        System.out.println("Area = " + calTr.getArea(tr));
    }
}
