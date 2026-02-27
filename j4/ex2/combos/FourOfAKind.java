package java_sandbox.j4.ex2.combos;

import java.util.ArrayList;
import java_sandbox.j4.ex2.Card;

public class FourOfAKind extends ComboCheckPrepare {
  @Override
  public boolean check(ArrayList<Card> cardList) {
    for (int i = 0; i < 4; i++) {
      if (cardList.get(i).getValue() == cardList.get(i + 1).getValue() &&
          cardList.get(i).getValue() == cardList.get(i + 2).getValue() &&
          cardList.get(i).getValue() == cardList.get(i + 3).getValue()) {
        return true;
      }
    }
    return false;
  }
  
}
