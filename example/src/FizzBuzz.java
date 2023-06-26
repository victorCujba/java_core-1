import java.util.Arrays;

public class FizzBuzz {

    /*
        RICHIESTA 1.
        Write a program that prints the numbers from 1 to 100.
        But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”.
        For numbers which are multiples of both three and five print “FizzBuzz”.

        RICHIESTA 2.
        L'intervallo dei numeri é da 1 a n, cui n é determinato da standard input.

        RICHIESTA 3.
        L'intervallo dei numeri iniziale {1 .. 100} e finale, ovvero il risultato di fizzbuzz, é inserito all'interno di un array.
     */
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] ints = new int[n];
        String[] results = new String[n];
        for (int i = 1; i <= n; i++) {
            ints[i-1] = i;
            results[i-1] = fizzBuzz(i);
        }
        System.out.println(Arrays.deepToString(results));
    }

    static String fizzBuzz(Integer i) {
        boolean divByThree = i % 3 == 0;
        boolean divByFive = i % 5 == 0;
        if (divByFive && divByThree) {
            return "FizzBuzz";
        } else if (divByThree) {
            return "Fizz";
        } else if (divByFive) {
            return "Buzz";
        } else {
            return i.toString();
        }
    }

}
