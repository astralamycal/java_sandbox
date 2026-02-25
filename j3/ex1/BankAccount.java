package java_sandbox.j3.ex1;

public class BankAccount {
  protected String name;
  protected float balance;
  
  public BankAccount(String name, float balance) {
    this.name = name;
    this.balance = balance;
  }

  public String getName() {
    return this.name;
  }

  public float getBalance() {
    return this.balance;
  }

  public void deposit(float amount){
    if (amount >= 0) {
      this.balance += amount;
      System.out.println("new balance amount: " + this.balance);
    }
    System.err.println("Cannot deposit negative amount.");
  }

  public void withdraw(float amount) {
    if (amount >= 0) {
      this.balance -= amount;
      System.out.println("new balance amount: " + this.balance);
    } else {
      System.err.println("Cannot deposit negative amount.");
    }
  }
}
