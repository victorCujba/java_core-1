import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/*
    Utilizzare lo scanner per
        - leggere input fintanto che non viene inserita la stringa "close".
            a quel punto chiudere il programma
        - se l'input é una somma, ad esempio "1 + 1", calcolare la somma.
 */
public class ScannerCalculatorExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        readInput(scanner);
    }

    private static void readInput(Scanner scanner) {
        boolean hasNext = scanner.hasNextLine();
        while (hasNext) {
            String nextLine = scanner.nextLine();
            if (!nextLine.equals("close")) {
                if (nextLine.contains("+") || nextLine.contains("*") || nextLine.contains("-") || nextLine.contains("/") ) {
                    char operator = getOperatorFromNextLine(nextLine);
                    doOperation(nextLine, operator);
                } else {
                    printNextLine(nextLine);
                }
                hasNext = scanner.hasNextLine();
            } else {
                hasNext = false;
            }
        }
    }

    private static char getOperatorFromNextLine(String nextLine) {
        Pattern pattern = Pattern.compile("");
        Matcher matcher = pattern.matcher(nextLine);

    }

    private static void doOperation(String nextLine, char operator) {
        int indexOfPlus = nextLine.indexOf(operator);
        String firstOp = nextLine.substring(0, indexOfPlus).trim();
        String secondOp = nextLine.substring(indexOfPlus+1).trim();
        int firstIntOp = Integer.parseInt(firstOp);
        int secondIntOp = Integer.parseInt(secondOp);
        System.out.printf("La somma dell'operazione %s = %s\n", nextLine, executeOperation(operator, firstIntOp, secondIntOp));
    }

    private static int executeOperation(char operator, int firstIntOp, int secondIntOp) {
        switch (operator) {
            case '+':
                return firstIntOp + secondIntOp;
            case '-':
                return firstIntOp - secondIntOp:
            case '/':
                return firstIntOp / secondIntOp;
            default:
                return firstIntOp * secondIntOp;
        }
    }

    private static void printNextLine(String nextLine) {
        System.out.printf("La stringa in input é -> %s\n", nextLine);
    }

}
