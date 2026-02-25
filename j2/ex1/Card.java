package java_sandbox.j2.ex1;

public class Card implements Comparable<Card> {
  private String colour;
  private int number;

  private Card(String colour, int number) {
    this.colour = colour;
    this.number = number;
  }

  @Override
  public String toString() {
    String cardName = "";
    switch (this.number) {
        case 1:
          cardName += "As";
          break;
        case 11:
          cardName += "Jack";
          break;
        case 12:
          cardName += "Queen";
          break;
        case 13:
          cardName += "King";
          break;
        default:
            cardName += String.valueOf(this.number);
    }

    cardName += " of " + this.colour;
    System.out.println(cardName);
    return cardName;
  }

  @Override
  public int compareTo(Card card) {
    if (this.number < card.number) {
      return -1;
    } else if (this.number > card.number) {
      return 1;
    } else {
      return 0;
    }
  }

  public static Card generateCard() {
    String[] cardColours = {"HEART", "DIAMOND", "CLUB", "SPADE"}; 

    int randomNumber =(int)(Math.random() * 12 + 1);
    String randomColour = cardColours[(int)(Math.random()*3 +1)];

    Card card = new Card(randomColour, randomNumber);

    return card;
  }
}
