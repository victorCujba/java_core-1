public class Main {

    int a = 45;
    int b;
    static Main instanceOfMain = new Main();

    public static void main(String[] args) {
        Example a = new Example();
        System.out.println(a.x); // 0
        a.x = 10;
        System.out.println(a.x); // 10
        Example e = a;
        e.x = 20;
        System.out.println("x di a -> " + a.x); // 20
        System.out.println("x di e -> " + e.x); // 20
    }

    public static void method1(int gigibau) {
        int y = 0;
        System.out.println("method1 y = " + y);
        System.out.println("method1 given x = " + gigibau);
        y = 15 + c;
        System.out.println("method1 new y = " + y);
    }

    public static void method2() {
        int x = 3;
        method1(10);
        System.out.println("method2 x = " + x);
        int y = 10;
    }

    public void method3() {
        int z = 5;
        System.out.println("method3 z = " + z);
        System.out.println("method3 c = " + c);
    }

    static final int c = 12;

}