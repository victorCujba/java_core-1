public class IfExample {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        if (x % 2 == 0) {
            System.out.println("divisibile per 2");
        } else if (x % 3 == 0) {
            System.out.println("divisibile per 3");
        } else if (x % 5 == 0) {
            System.out.println("divisibile per 5");
        } else {
            System.out.println("non divisibile per 5 o per 3 o per 2");
        }
        System.out.println("END");
    }

}
