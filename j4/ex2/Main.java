package java_sandbox.j4.ex2;

public class Main {

  public static void main(String[] args) {
    CardManager cardManager = new CardManager();
    CardHand playerHand = new PlayerHand(cardManager);
    RiverHand riverHand = new RiverHand(cardManager);
  }
}
