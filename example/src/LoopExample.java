import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LoopExample {

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("for i = " + i);
        }

        int i = 0;
        while (i <= 10) {
            System.out.println("while i = " + i);
            ++i;
        }

        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int j: ints) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("matrix: ");
        int[][] matrix = {{1, 2, 3, 4, 5}, {11, 12, 13, 14, 15}};
        /*
            1 2 3 4 5
            6 7 8 9 10
         */
        for (int k = 0; k < matrix.length; k++) {
            for (int l = 0; l < matrix[k].length; l++) {
                System.out.print(matrix[k][l] + " ");
            }
            System.out.println();
        }

        for (int[] ks : matrix) {
            for (int k : ks) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

        /*
            1 6
            2 7
            3 8
            4 9
            5 10
         */

        int[][] matrix2 = {
                {1, 2, 3, 4},
                {6, 7, 8, 9, 10, 16},
                {11, 12, 13, 14, 15}
        };
        // {(1, 6, 11), (2, 7, 12)...}
        int maxInt = Arrays.stream(matrix2)
                .map(array -> array.length)
                .max(Integer::compareTo)
                .orElse(0);
        Tuple[] tuples = new Tuple[maxInt];
        for (int n = 0; n < maxInt; n++ ) {
            Tuple tuple = new Tuple();
            tuple.setInts(new int[matrix2.length]);
            for (int k = 0; k < matrix2.length; k++) { // numero di righe
                if (n < matrix2[k].length) {
                    tuple.getInts()[k] = matrix2[k][n];
                }
            }
            //System.out.println(Arrays.toString(tuple.getInts())); // (1, 6)
            tuples[n] = tuple;
        }

        for (Tuple tuple : tuples) {
            System.out.println(Arrays.toString(tuple.getInts()));
        }




    }



}
