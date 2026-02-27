package java_sandbox.j4.ex2.combos;

import java.util.ArrayList;
import java.util.Collections;
import java_sandbox.j4.ex2.Card;
import java_sandbox.j4.ex2.PlayerHand;
import java_sandbox.j4.ex2.RiverHand;

public abstract class ComboCheckPrepare implements IComboChecks {
  protected ArrayList<Card> cardList = new ArrayList<>();

  @Override
  public void createCardList(PlayerHand playerhand, RiverHand riverHand) {
    for (int i = 0; i < 2; i++) {
      cardList.add(playerhand.getCardList().get(i));
    }

    for (int i = 0; i < 5; i++) {
      cardList.add(riverHand.getCardList().get(i));
    }

    Collections.sort(cardList);
  }

  public ArrayList<Integer> checkCombos(PlayerHand playerhand, RiverHand riverHand) {
    createCardList(playerhand, riverHand);

    ArrayList<Integer> comboChecks = new ArrayList<>();
    comboChecks.add(RoyalFlush.check(cardList));
    comboChecks.add(StraightFlush.check(cardList));
    comboChecks.add(FourOfAKind.check(cardList));
    comboChecks.add(FullHouse.check(cardList));
    comboChecks.add(ThreeOfAKind.check(cardList));
    comboChecks.add(Flush.check(cardList));
    comboChecks.add(Straight.check(cardList));
    comboChecks.add(DoublePair.check(cardList));
    comboChecks.add(Pair.check(cardList));
    return comboChecks;
  }
}
