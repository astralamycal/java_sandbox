package java_sandbox.j4.ex1;

public class Warrior extends Player {
  public Warrior(String name, int hp, int attack, int defense, int money) {
    super(name, hp, attack, defense, money);
  }

  @Override
  public void takeDamage(int damages){
    super.takeDamage(damages - 1);
  }

  @Override
  public void attack(Player player) {
    this.attack += 1;
    super.attack(player);
    this.attack -= 1;
  }
}
