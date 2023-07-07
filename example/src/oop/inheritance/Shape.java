package oop.inheritance;

public abstract class Shape implements ShapeOperation {

    protected String color = "BLACK";

    public abstract int calculatePerimeter();

    public abstract int calculateArea();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
