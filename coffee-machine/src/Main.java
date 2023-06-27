import coffeeMachine.CoffeeMachine;
import coffeeMachine.MachineTechnician;
import coffeeMachine.Money;

public class Main {

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.makeCoffee();
        System.out.println(coffeeMachine.getCoffeeAvailable());
        MachineTechnician machineTechnician = new MachineTechnician(coffeeMachine);
        machineTechnician.refillCoffee();
        machineTechnician.setCoffeePrice(60);
        System.out.println(coffeeMachine.getCoffeeAvailable());
        coffeeMachine.makeCoffee();
        coffeeMachine.setMoney(60);
        coffeeMachine.makeCoffee();
    }

}