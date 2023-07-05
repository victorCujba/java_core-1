import java.util.HashMap;
import java.util.Map;

public class Bank {

  private static int numberOfAccounts = 1;
  private final Map<Integer, BankAccount> bankAccounts;

  public Bank() {
    this.bankAccounts = new HashMap<>();
  }

  public Integer createBankAccount(String owner) {
    return createBankAccount(owner, 0);
  }

  public Integer createBankAccount(String owner, double money) {
    BankAccount account = new BankAccount(numberOfAccounts++, owner, money);
    bankAccounts.put(account.getAccountNumber(), account);
    return account.getAccountNumber();
  }

  public String showBankAccounts() {
    return bankAccounts.toString();
  }

  public BankAccount getBankAccount(Integer accountNumber) {
    return bankAccounts.get(accountNumber);
  }
}
