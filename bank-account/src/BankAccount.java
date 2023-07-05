import java.util.ArrayList;
import java.util.List;

public class BankAccount implements BankAccountOperation {

    private final int accountNumber;
    private final String owner;
    private double balance;
    private final List<BankMovement> movements;

    public BankAccount(int accountNumber, String owner, double balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
        this.movements = new ArrayList<>();
    }

    @Override
    public void deposit(double money) {
        this.balance += money;
        movements.add(new BankMovement("deposit", money));
    }

    @Override
    public double withdrawal(double money) {
        if (balance >= money) {
            this.balance -= money;
            System.out.printf("Il tuo nuovo saldo é %s\n", this.balance);
            movements.add(new BankMovement("withdrawl", -money));
            return money;
        }
        System.out.println("Fondi non sufficienti per effettuare il prelievo.");
        return 0;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public String stringifyLastMovements(int lastMovements) {
        StringBuilder sb = new StringBuilder("I tuoi ultimi movimenti sono:\n");
        for (int i = movements.size()-1; i >= movements.size()-lastMovements && i >= 0; i--) {
            sb.append("\t- ").append(movements.get(i)).append("\n");
        }
        return sb.toString();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return String.format("This bank account with number %s is owned by %s", accountNumber, owner);
    }
}
