package oop;

import oop.inheritance.*;
import oop.inheritance.Comparable;

public class InheritanceMain {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);
        System.out.println(rectangle.toString());
        System.out.printf("il perimetro del rettangolo é: %s\n", rectangle.calculatePerimeter());
        System.out.printf("l'area del rettangolo é: %s\n", rectangle.calculateArea());
//        System.out.printf("il colore del rettangolo é: %s\n", rectangle.getColor());

        Square square = new Square(10);
        System.out.println(square.toString());
        System.out.printf("il perimetro del quadrato é: %s\n", square.calculatePerimeter());
        System.out.printf("l'area del quadrato é: %s\n", square.calculateArea());
        System.out.printf("il colore del quadrato é: %s\n", square.getColor());

        Triangle triangle = new Triangle();
        System.out.printf("il colore del triangolo é: %s\n", triangle.getColor());

        //TIPO DICHIARATO -  TIPO EFFETTIVO
        // Shape | shape | Triangle@123
        Shape shape = new Triangle();
        System.out.printf("l'area della figura é: %s\n", shape.calculateArea());
        shape = new Square(10);
        System.out.printf("l'area della figura é: %s\n", shape.calculateArea());
//        Rectangle rectangle1 = new Square(10);
//        System.out.printf("l'area del rettangolo é: %s\n", rectangle1.calculateArea());

        Shape anonShape = new Shape() {
            @Override
            public int calculatePerimeter() {
                return 11111;
            }

            @Override
            public int calculateArea() {
                return 55;
            }
        };
        System.out.printf("l'area della figura anonima é: %s\n", anonShape.calculateArea());

        ShapeOperation shapeOperation = new Triangle();


        Object obj1 = new Triangle();
        Object obj2 = new Square(10);
        Object obj3 = new Rectangle(10, 5);

        if (instanceOfTriangle(obj1)) {
            Triangle triangle1 = (Triangle) obj1;
            triangle1.show();
        }
        if (instanceOfTriangle(obj2)) {
            Triangle triangle2 = (Triangle) obj2;
            triangle2.show();
        }


    }

    public static boolean instanceOfTriangle(Object o) {
        return (o instanceof Triangle);
    }

}
