package Tutorial_1_Circle_question;

public class TestCircle {
    public static void main(String[]args){


        Circle circle1 = new Circle(50);  //when creating a object we should pass value(argument) to the object
        Circle circle2 = new Circle(30);
        Circle circle3 = new Circle(60);

        system.out.println("the radius is"+circle1.getradius()); //get radius calling the class

        circle1.setColour("blue");
        circle1.setRadius(2);

        System.out.println("The circle has radius of " + circle1.getRadius() + " and area of " +
                circle1.getArea()+" colour is "+circle1.getColour());

        Circle circle2 = new Circle();
        circle2.setColour("red");
        circle2.setRadius(4);

        System.out.println("The circle has radius of " + circle2.getRadius() + " and area of " +
                circle2.getArea()+" colour is "+circle2.getColour());

        circle1.setRadius(10);
        System.out.println(circle1.getRadius());

    }
}
