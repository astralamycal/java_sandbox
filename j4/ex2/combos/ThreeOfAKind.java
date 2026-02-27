package java_sandbox.j4.ex2.combos;

import java.util.ArrayList;
import java_sandbox.j4.ex2.Card;

public class ThreeOfAKind extends ComboCheckPrepare {
  @Override
  public boolean check(ArrayList<Card> cardList) {
    for (int i = 0; i < 5; i++) {
      for (int j = i + 1; j < 6; j++) {
        for (int k = j + 1; k < 7; k++) {
          if (cardList.get(i).compareTo(cardList.get(j)) == 0 && cardList.get(i).compareTo(cardList.get(k)) == 0) {
            return true;
          }
        }
      }
    }
    return false;
  }
  
}
