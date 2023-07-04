import java.util.Scanner;

/*
   ESERCITAZIONE

   PARTE 1:
       Creare un programma per la gestione di un conto corrente.
       Il programma deve essere in grado di effettuare le seguenti operazioni da linea di comando.
           - versamenti
           - prelievi
           - restituire il saldo
           - effettuare la lista degli ultimi 5 movimenti
       Il programma deve essere inizializzato nella classe main con almeno 1 conto corrente salvato.

   PARTE 2:
       Fare in modo che il programma permetta da linea di comando di gestire i conti correnti:
           - vedere la lista di tutti i conti correnti registrati
           - inserire un nuovo conto corrente
           - selezionare un conto corrente in modo da effettuare le operazioni definite nella parte 1
*/
public class Main {
  public static void main(String[] args) {

    BankAccount account = new BankAccount(100);

    Scanner scanner = new Scanner(System.in);
    boolean hasNextInput = true;

    while (hasNextInput) {
      System.out.println("quale operazione vuoi eseguire sul conto?");
      System.out.println("\t- Per effettuare un versamento premi 'V'");
      System.out.println("\t- Per effettuare un prelievo premi 'P'");
      System.out.println("\t- Per verificare il saldo 'S'");
      System.out.println("\t- Per visualizzare la lista degli 5 ultimi movimenti permi 'M'");
      System.out.println("\t- Per uscire dal programma inserire 'X'");

      char operation = scanner.next().charAt(0);

      switch (operation) {
        case 'V':
          System.out.print("\t- Inserisci l'importo da versare:");
          double moneyToDeposit = scanner.nextDouble();
          account.deposit(moneyToDeposit);
          break;
        case 'P':
          System.out.print("\t- Inserisci l'importo da prelevare:");
          double moneyToWithrdawal = scanner.nextDouble();
          account.withdrawal(moneyToWithrdawal);
          break;
        case 'S':
          System.out.printf("Il tuo saldo é %s\n", account.getBalance());
          break;
        case 'M':
          System.out.println(account.stringifyLastMovements(5));
          break;
        case 'X':
          hasNextInput = false;
          break;
        default:
          System.out.println("Operazione non riconosciuta.");
      }
    }

    scanner.close();
  }
}
