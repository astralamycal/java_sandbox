package java_sandbox.j4.ex2.combos;

import java.util.ArrayList;
import java_sandbox.j4.ex2.Card;

public class Flush extends ComboCheckPrepare {
  @Override
  public boolean  check(ArrayList<Card> cardList) {
    int suitCount = 1;
    int failedCount = 0;
    for (int i = 1; i < cardList.size(); i++) {
      if (cardList.get(i).getColour().equals(cardList.get(i - 1).getColour())) {
        suitCount++;
        if (suitCount >= 5) {
          return true;
        }
      } else {
        failedCount++;
        suitCount = 1;
      }
      if (failedCount > 3) {
        return false;
      }
    }
    return false;
  }
  
}
