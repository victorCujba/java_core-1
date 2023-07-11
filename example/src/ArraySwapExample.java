import java.util.Arrays;

public class ArraySwapExample {

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(ints));
        ints = removeElementInsideArray(11, ints);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] removeElementInsideArray(int toBeRemoved, int[] ints) {
        int positionOfElement = findPositionOfElement(toBeRemoved, ints);
        if (positionOfElement == -1) {
            System.out.println("Element to be removed doesn't exists inside given array.");
            return ints;
        } else {
            return copyArrayWithoutElement(toBeRemoved, positionOfElement, ints);
        }
    }

    /*
        index           :  0  1  2  3  4  5  6  7  8  9
                          _______________________________
        originalArray   : {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
        newArray        : {1, 2, 3, 4, 6, 7, 8, 9, 10}
     */
    private static int[] copyArrayWithoutElement(int toBeRemoved, int positionOfElement, int[] ints) {
        int[] copyOfArray = new int[ints.length - 1];
        for (int i = 0; i < ints.length; i++) {
            if (i < positionOfElement) {
                copyOfArray[i] = ints[i];
            } else if (i > positionOfElement) {
                copyOfArray[i-1] = ints[i];
            } else {
                System.out.printf("Element %s has been removed\n", toBeRemoved);
            }
        }
        return copyOfArray;
    }

    private static int findPositionOfElement(int toBeRemoved, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == toBeRemoved) {
                return i;
            }
        }
        return -1;
    }

}
