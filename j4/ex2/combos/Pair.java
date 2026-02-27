package java_sandbox.j4.ex2.combos;

import java.util.ArrayList;
import java_sandbox.j4.ex2.Card;

public class Pair extends ComboCheckPrepare {

  @Override
  public boolean check(ArrayList<Card> cardList) {
    for (int i = 0; i < 8; i++) {
      for (int j = i + 1; j < 8; j++) {
        if (cardList.get(i).compareTo(cardList.get(j)) == 0) {
          return true;
        }
      }
    }
    return false;
  }
}
