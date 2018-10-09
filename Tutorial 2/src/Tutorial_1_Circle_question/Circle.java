package Tutorial_1_Circle_question;

public class Circle {

    private double radius;
    private String colour;

    public void circle(){
        radius = 1;
        colour = "blue";
    }

    public void circle(double r){
        radius = r;
        colour = "blue";
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(int i){
        this.radius = i;
    }

    public void setColour(String c){
        this.colour = c;
    }
    public String getColour(){
        return colour;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }


}
