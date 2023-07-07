import java.util.Scanner;

public class SystemInExample {


    /*
        Utilizzare lo scanner per
            - leggere input fintanto che non viene inserita la stringa "close".
                a quel punto chiudere il programma
            - se l'input é una somma, ad esempio "1 + 1", calcolare la somma.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        readInput(scanner);

        boolean hasNext = scanner.hasNextLine();
        while (hasNext) {
            System.out.println("prima di next line");
            String nextLine = scanner.nextLine();
            if (!nextLine.equals("close")) {
                hasNext = scanner.hasNextLine();
            } else {
                hasNext = false;
            }
            System.out.println("dopo di next line");
        }
    }

    private static void readInput(Scanner scanner) {
        String userInput = "";
        int i = 0;
        // scanner.hasNext | scanner.hasNextLine | scanner.hasNext(String pattern)
        while (i < 5) {
            userInput += "\t" + scanner.nextLine() + "\n";
            i++;
        }

        System.out.printf("This is the user input ->\n%s", userInput);

        scanner.close();
    }

}
