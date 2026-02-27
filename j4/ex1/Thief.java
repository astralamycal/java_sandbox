package java_sandbox.j4.ex1;

public class Thief extends Player {
  public Thief(String name, int hp, int attack, int defense, int money) {
    super(name, hp, attack, defense, money);
  }

  @Override
  public void attack(Player player) {
    this.money += 5;
    player.money -= 5;
    System.out.println("yoink");

    super.attack(player);
  }
}
