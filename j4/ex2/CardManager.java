package java_sandbox.j4.ex2;

import java.util.ArrayList;

public class CardManager {
  private ArrayList<Card> cardList = new ArrayList<>();

  private void init() {
    String[] cardColours = {"HEART", "DIAMOND", "CLUB", "SPADE"};

    for (String colour : cardColours) {
      for (int number = 1; number <= 13; number++) {
        cardList.add(new Card(colour, number));
      }
    }
  }

  public CardManager() {
    this.init();
  }

  public Card drawCard() {
    int randomNumber = (int)(Math.random()*52);
    Card randomCard = cardList.get(randomNumber);
    cardList.remove(randomNumber);
    
    return randomCard;
  }
}
