public class ExceptionExample {

    public static void main(String[] args) {
        String alfabeto = "abcdefghijklmnopqrstuvz";
        int index = 50;
        try {
            char x = alfabeto.charAt(index);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("l'indice inserito é troppo alto");
        }
    }
}
