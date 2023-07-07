package oop.inheritance;

public class Triangle extends Shape implements Comparable {

    public Triangle() {
        super();
    }

    @Override
    public int calculatePerimeter() {
        return 0;
    }

    @Override
    public int calculateArea() {
        return 0;
    }

    public void show() {
        System.out.println("This is a triangle!");
    }

    @Override
    public boolean compareTo(Comparable comparable) {
        return false;
    }
}
