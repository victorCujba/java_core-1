public class Pointer {

    static final int i = 10;
    static final Example staticExample = new Example();

    public static void main(String[] args) {
        Example a = new Example();
        Example b = a;
        methodX(a);
        b.x = 10;
        System.out.println(a.x);
        staticExample.x = 10;
        System.out.println(staticExample.x);
    }

    public static void methodX(Example example) {
        methodY(example);
    }

    public static void methodY(Example example) {
        example.x = 15;
    }

}
