package java_sandbox.j4.ex2.combos;

import java.util.ArrayList;
import java_sandbox.j4.ex2.Card;;


public class FullHouse extends ComboCheckPrepare {
  @Override
  public boolean check(ArrayList<Card> cardList) {
    boolean threeOfAKind = ThreeOfAKind.check(cardList);
    boolean pair = Pair.check(cardList);
    return threeOfAKind && pair;
  }
}
