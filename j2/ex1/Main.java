package java_sandbox.j2.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Card> cards = new ArrayList<>();
    
    for (int i = 0; i < 10; i++) {
      cards.add(Card.generateCard());
    }
    Collections.sort(cards);
    System.out.println(cards);
  }
}
