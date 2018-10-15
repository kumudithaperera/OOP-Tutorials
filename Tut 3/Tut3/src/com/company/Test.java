package com.company;

public class Test {
    public static void main (String[] args) {

        Cylinder c1 = new Cylinder();
        Circle Circle1 = new Circle();

        System.out.println("Cylinder:"
                + " radius=" + c1.getRadius()
                + " height=" + c1.getHeight()
                + " base area=" + Circle1.getArea()
                + " volume=" + c1.getVolume()
                + " Surface Area=" + c1.getArea());
// Declare and allocate a new instance of cylinder, specifying Height
        Cylinder c2 = new Cylinder(7.0);
        Circle Circle2 = new Circle(3.0);
        System.out.println("Cylinder:"
                + " radius=" + c2.getRadius()
                + " height=" + c2.getHeight()
                + " base area=" + Circle2.getArea()
                + " volume=" + c2.getVolume()
                + " Surface Area=" + c2.getArea());
// Declare and allocate a new instance of cylinder specifying radius and height
        Cylinder c3 = new Cylinder(10.0);
        System.out.println("Cylinder:"
                + " radius=" + c3.getRadius()
                + " height=" + c3.getHeight()
                + " base area=" + Circle1.getArea()
                + " volume=" + c3.getVolume()
                + " Surface Area=" + c1.getArea());
    }
}
