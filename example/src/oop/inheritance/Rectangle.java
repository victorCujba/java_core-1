package oop.inheritance;

public class Rectangle extends Shape implements Show, Comparable {

    protected int width;
    protected int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int calculatePerimeter() {
        return (width + height) * 2;
    }

    public int calculateArea() {
        return width * height;
    }

    public String toString() {
        return String.format("Il rettangolo ha altezza %s e larghezza %s", height, width);
    }

    @Override
    public boolean compareTo(Comparable comparable) {
        return false;
    }

    @Override
    public String show() {
        return null;
    }
}
