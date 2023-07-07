package oop;

import oop.protect.ProtectedExample;


/*

    1. abstraction
        - astrazione funzionale
        - astrazione dei dati
        - astrazione del sistema
    2. encapsulation
    3. inheritance
    4. polymorphism

 */
public class OopMain {

    public static void main(String[] args) {
        Car car = new Car(5, 3, "GIALLO", "HELLO");

        Car carBasic = new Car();
        carBasic.gears = 1;
        carBasic.setDoors(2);
        carBasic.color = "NERO";

        ProtectedExample protectedExample = new ProtectedExample();
        protectedExample.setExample("HELLO PROTECTED");
        System.out.println(protectedExample.getExample());

    }
}
