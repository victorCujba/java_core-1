package coffeeMachine;

public class CoffeeMachine {

    private boolean isCoffeeAvailable;
    private int coffeePrice;
    private final Money money;

    public CoffeeMachine() {
        this.money = new Money();
    }

    public Coffee makeCoffee() {
        if (isCoffeeAvailable) {
            if (money.getCents() >= coffeePrice) {
                System.out.println("Coffee is coming!");
                return new Coffee();
            } else {
                System.out.println("Money is not enough to pay the coffee");
                return null;
            }
        } else {
            System.out.println("Coffee is not available");
            return null;
        }
    }

    protected void setCoffeeAvailable(boolean isCoffeeAvailable) {
        this.isCoffeeAvailable = isCoffeeAvailable;
    }

    public boolean getCoffeeAvailable() {
        return this.isCoffeeAvailable;
    }

    protected void setCoffeePrice(int coffeePrice) {
        this.coffeePrice = coffeePrice;
    }

    public void setMoney(int cents) {
        this.money.setCents(cents);
    }
}
