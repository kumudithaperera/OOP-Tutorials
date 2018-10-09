package Tutorial_1_Circle_question;

public class Circle {

    private double radius;
//    private String colour;
    private static int count = 0;

//    public void circle(){
//        radius = 1;
//        colour = "blue";
//    }

    public circle(double r){
        this.radius = r;
        count = count++
//      colour = "blue";
    }

    public double getRadius(){                   //if no settter method, then the object is immutble
                                                 //DEFAULT is not a keyword - assessible only within the package
        return radius;
    }

    public static int getcount(){
        return count;
    }

    public void setRadius(int i){
        this.radius = i;
    }

//    public void setColour(String c){
//        this.colour = c;
//    }
//    public String getColour(){
//        return colour;
//    }

    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }

    public double getCircumfernce(){
        return 2*Math.PI*radius;
    }

}
