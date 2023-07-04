import java.util.List;

public interface BankAccountOperation {

    /**
     * Aggiorna il saldo aumentando la somma con i soldi depositati
     * @param money
     */
    void deposit(double money);

    /**
     * Aggiorna il saldo diminuendo la somma con i soldi ritirati e ritorna la somma
     * @param money
     * @return soldi ritirati
     */
    double withdrawal(double money);

    /**
     * restituisce il saldo
     * @return il valore di balance
     */
    double getBalance();

    /**
     * restituisce la lista degli ultimi n movimenti bancari
     * @return stringified last n movements
     */
    String stringifyLastMovements(int lastMovements);


}
