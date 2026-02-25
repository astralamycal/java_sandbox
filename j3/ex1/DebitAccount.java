package java_sandbox.j3.ex1;

public class DebitAccount extends BankAccount {
  
  public DebitAccount(String name, float balance) {
    super(name, balance);
  }

  public void withdraw(amount) {
    if (this.balance > amount) {
      super.withdraw(amount);
    } else {
      System.err.println("Not enough money on the account.");
    }
  }
}
