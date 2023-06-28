package coffeeMachine;

public class Money {
  private int cents;

  public Money() {}

  public Money(Money money) {
    this.cents = money.getCents();
  }

  public int getCents() {
    return cents;
  }

  public void setCents(int cents) {
    this.cents = cents;
  }
}
