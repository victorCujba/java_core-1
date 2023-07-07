package oop;

public class Rectangle implements Comparable {
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
    public int compareTo(Object o) {
        return 0;
    }
}
