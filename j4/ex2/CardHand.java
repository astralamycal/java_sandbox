package java_sandbox.j4.ex2;

import java.util.ArrayList;

public abstract class CardHand {
  private ArrayList<Card> cardList = new ArrayList<>();

  public CardHand(CardManager cardManager, int cardAmount) {
    for (int i = 0; i < cardAmount; i++) {
      cardList.add(cardManager.drawCard());
    }
    System.out.println(cardList);
  }

  public ArrayList<Card> getCardList() {
    return this.cardList;
  }
}