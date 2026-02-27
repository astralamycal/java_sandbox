package java_sandbox.j4.ex1;

public class Mage extends Player {
  public Mage(String name, int hp, int attack, int defense, int money) {
    super(name, hp, attack, defense, money);
  }

  @Override
  public void attack(Player player) {
    this.hp += 1;
    super.attack(player);
  }
}
