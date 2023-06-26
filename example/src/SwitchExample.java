public class SwitchExample {

    public static void main(String[] args) {
        String argument = args[0];
        char c = argument.charAt(0);

        switch (c) {
            case '+':
                System.out.println("l'operazione é una somma");
                break;
            case '-':
                System.out.println("l'operazione é una sottrazione");
                break;
            case '/':
                System.out.println("l'operazione é una divisione");
                break;
            case '*':
                System.out.println("l'operazione é una moltiplicazione");
                break;
            default:
                System.out.println("operazione non riconosciuta");
        }
    }
}
