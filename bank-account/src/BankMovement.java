import java.time.LocalDateTime;

public class BankMovement {

    private final String typeOfOperation;
    private final LocalDateTime date;
    private final double money;

    public BankMovement(
            String typeOfOperation,
            double money) {
        this.typeOfOperation = typeOfOperation;
        this.date = LocalDateTime.now();
        this.money = money;
    }

    @Override
    public String toString() {
        return String.format("Operation %s has been completed at date %s and moved %s money from your bank account", typeOfOperation, date, money);
    }
}
