package java_sandbox.j4.ex2.combos;

import java.util.ArrayList;
import java_sandbox.j4.ex2.Card;

public class Straight extends ComboCheckPrepare {
  @Override
  public boolean check(ArrayList<Card> cardList) {

    int consecutiveCount = 1;
    for (int i = 1; i < cardList.size(); i++) {
      if (cardList.get(i).getValue() == cardList.get(i - 1).getValue() + 1) {
        consecutiveCount++;
        if (consecutiveCount >= 5) {
          return true;
        }
      } else if (cardList.get(i).getValue() != cardList.get(i - 1).getValue()) {
        consecutiveCount = 1;
      }
    }
  return false;
}
