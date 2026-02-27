package java_sandbox.j4.ex1;

public abstract class Player {
  protected String name;
  protected int hp;
  protected int attack;
  protected int defense;
  protected int money;

  protected Player(String name, int hp, int attack, int defense, int money) {
    this.name = name;
    this.hp = hp;
    this.attack = attack;
    this.defense = defense;
    this.money = money;
  }

  public void takeDamage(int damages) {
    this.hp -= damages;
    if (this.hp <= 0) {
      this.hp = 0;
      System.out.println("Bro is ded :/");
    }
  }

  public void attack(Player player) {
    int damages = this.attack - player.defense;
    if (damages > 0) {
      player.takeDamage(damages);
      System.out.println("Bro took" + damages + "damages.");
    } else {
      System.out.println("You need to hit harder...");
    }
  }
}