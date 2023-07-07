package oop;


/*
            Modifier      Package  Subclass  World

            public          Yes      Yes     Yes

            protected       Yes      Yes     No

            Default (no
            modifier)       Yes       No     No

            private         No        No     No
 */
public class Car {

    protected int gears;
    private int doors;
    public String color;
    String name;

    public Car(int gears, int doors, String color, String givenName) {
        this.gears = gears;
        this.doors = doors;
        this.color = color;
        name = givenName;
    }

    public Car() {}

    public int getDoors() {
        return this.doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

}
