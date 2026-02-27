package java_sandbox.j4.ex2.combos;

import java.util.ArrayList;
import java_sandbox.j4.ex2.Card;

public class DoublePair extends ComboCheckPrepare {
  @Override
  public boolean check(ArrayList<Card> cardList) {
    int pairCount = 0;
    for (int i = 0; i < 6; i++) {
      for (int j = i + 1; j < 7; j++) {
        if (cardList.get(i).compareTo(cardList.get(j)) == 0) {
          pairCount++;
          break;
        }
      }
    }
    return pairCount >= 2;
  }
}