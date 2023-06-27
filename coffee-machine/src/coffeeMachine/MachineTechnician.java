package coffeeMachine;

public class MachineTechnician {

    private final CoffeeMachine coffeeMachine;

    public MachineTechnician(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    public void refillCoffee() {
        this.coffeeMachine.setCoffeeAvailable(true);
    }

}
