import coffeeMachine.CoffeeMachine;
import coffeeMachine.MachineTechnician;
import coffeeMachine.Money;

public class Main {

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.makeCoffee(new Money());
        System.out.println(coffeeMachine.getCoffeeAvailable());
        MachineTechnician machineTechnician = new MachineTechnician(coffeeMachine);
        machineTechnician.refillCoffee();
        System.out.println(coffeeMachine.getCoffeeAvailable());
    }

}