package java_sandbox.j4.ex2;

public class Card implements Comparable<Card> {
  private String colour;
  private int number;

  public Card(String colour, int number) {
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
    return cardName;
  }

  public int getValue() {
    return this.number;
  }

  public String getColour() {
    return this.colour;
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
}