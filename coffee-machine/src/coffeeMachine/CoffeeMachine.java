package coffeeMachine;

public class CoffeeMachine {

    private boolean isCoffeeAvailable;

    public Coffee makeCoffee(Money money) {
        return new Coffee();
    }

    protected void setCoffeeAvailable(boolean isCoffeeAvailable) {
        this.isCoffeeAvailable = isCoffeeAvailable;
    }

    public boolean getCoffeeAvailable() {
        return this.isCoffeeAvailable;
    }
}
