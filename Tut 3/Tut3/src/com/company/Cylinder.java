package com.company;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        height = 1.0;
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

    @Override
    public double getArea(){
        double Area = 2*Math.PI*getRadius()*height;
        return Area;
    }

    public double getVolume() {
        double volume = super.getArea()*height;
        return volume;
    }
}