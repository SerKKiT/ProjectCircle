package shape;
import java.math.*;
public class Circle extends Shape {
    protected double radius;
    public Circle(){
        this.radius=2;
        this.filled=true;
        this.color="blue";
    }
    public Circle(double radius){
        this.radius=radius;
        this.filled=false;
        this.color="blue";
    }
    public Circle(double radius, boolean filled, String color){
        this.radius=radius;
        this.filled=filled;
        this.color=color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Shape: circle, radius: "+this.radius+", color: "+this.color;
    }
}