package shape;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape(String c, boolean f){
        color=c;
        filled=f;
    }

    protected Shape() {
    }

    abstract double getPerimeter();
    abstract double getArea();
    public abstract String toString();
    public void setColor(String color) {this.color=color;}
    public String getColor(){return color;}
    public void setFilled(boolean filled) {this.filled=filled;}
    public boolean isFilled(){return filled;}


}
