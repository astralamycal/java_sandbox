package java_sandbox.j3.ex1;

public class CheckingAccount extends BankAccount {
  private float overdraft;

  public CheckingAccount(String name, float amount, float overdraft) {
    super(name, amount);
    this.overdraft = overdraft;
  }

  public float getOverdraft() {
    return this.overdraft;
  }

  public void withdraw(amount) {
    if (this.balance - amount > this.overdraft) {
      super.withdraw(amount);
    } else {
      System.err.println("Cannot exceed overdraft limits.");
    }
  }
}
