package shape;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    public Rectangle(){
        this.width=4;
        this.length=3;
        this.color="blue";
        this.filled=false;
    }
    public Rectangle(double width, double length){
        this.width=width;
        this.length=length;
        this.color="blue";
        this.filled=false;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        this.width=width;
        this.length=length;
        this.color=color;
        this.filled=filled;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length=length;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return 2*(length+width);
    }
    public String toString(){
        return "Shape: rect, length: "+this.length+", width: "+this.width+" ,color: "+this.color;
    }
}
