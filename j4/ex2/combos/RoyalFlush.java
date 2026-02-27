package java_sandbox.j4.ex2.combos;

public class RoyalFlush extends ComboCheckPrepare {
  @Override
  public boolean check(ArrayList<Card> cardList) {
    if (!Straight.check(cardList)) {
      return false;
    }
    String colour = cardList.get(0).getColour();
    for (int i = 1; i < cardList.size(); i++) {
      if (!cardList.get(i).getColour().equals(colour)) {
        return false;
      }
    }
    return true;
  }
}
