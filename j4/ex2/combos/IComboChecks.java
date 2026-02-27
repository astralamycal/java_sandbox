package java_sandbox.j4.ex2.combos;

import java.util.ArrayList;
import java_sandbox.j4.ex2.Card;
import java_sandbox.j4.ex2.PlayerHand;
import java_sandbox.j4.ex2.RiverHand;

public interface IComboChecks {
  public void createCardList(PlayerHand playerhand, RiverHand riverHand);
  public boolean check(ArrayList<Card> cardList);
  }
