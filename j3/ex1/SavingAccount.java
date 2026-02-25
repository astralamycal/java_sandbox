package java_sandbox.j3.ex1;

public class SavingAccount extends BankAccount {
  private float interestRate;

  public SavingAccount(String name, float balance, float interestRate) {
    super(name, balance);
    this.interestRate = interestRate;
  }

  public float getInterestRate() {
    return this.interestRate;
  }

  public double getInterests() {
    double interestAmount = this.balance * this.interestRate;

    System.out.println(interestAmount);

    return interestAmount;
  }
}
