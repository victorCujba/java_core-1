public class ShortCircuitExample {

    public static void main(String[] args) {

        if (methodFalse() && methodTrue() && methodTrue()) {
            System.out.println(" punto del codice non raggiungibile ");
        } else {
            System.out.println(" punto del codice raggiunto ");
        }

        if (!methodFalse() || methodTrue() || methodFalse()) {
            System.out.println(" punto del codice raggiunto ");
        } else {
            System.out.println(" punto del codice non raggiungibile ");
        }

        Tuple tuple = new Tuple();
//        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
//        tuple.setInts(ints);
        checkTupleLength(tuple);
    }

    static boolean methodFalse() {
        System.out.println("this is false");
        return false;
    }

    static boolean methodTrue() {
        System.out.println("this is true");
        return true;
    }

    static void checkTupleLength(Tuple tuple) {
        boolean gtThanTen = tuple.getInts() != null && tuple.getInts().length > 10;
        if (gtThanTen) {
            System.out.println("A very long tuple");
        }
    }

}
