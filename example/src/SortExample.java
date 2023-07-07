import java.util.Arrays;

public class SortExample {


    public static void main(String[] args) {

        Integer[] ints = {0, 1, 13, 2, 3, 4, 5, 8, 6, 7};

        bubbleSort(ints);

        System.out.println(Arrays.deepToString(ints));

    }

    private static void bubbleSort(Integer[] ints) { // O(n^2)
        for (int i = 0; i < ints.length; i++) { // O(n)
            for (int j = 0; j < ints.length - 1; j++) { // O(n)
                if (ints[j] > ints[j + 1]) {
                    Integer swap = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = swap;
                }
            }
        }
    }

}
