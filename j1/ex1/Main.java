package java_sandbox.j1.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static List<Integer> listMoneyBills(List<Integer> moneyList, int moneyGiven) {
    while (moneyGiven > 0) {
      if (moneyGiven >= 10) {
        moneyList.add(10);
        moneyGiven -= 10;
      } else {
        moneyList.add(2);
        moneyGiven -= 2;
      }
    }
    return moneyList;
  }
  
  public static void main(String[] args) {
      Scanner moneyInput = new Scanner(System.in);
      System.out.println("give money amount");

      int moneyGiven = moneyInput.nextInt();
      
      List<Integer> moneyList = new ArrayList<>();
      if (moneyGiven % 2 == 1) {
        if (moneyGiven >= 5) {
          moneyList.add(5);
          moneyGiven -= 5;

          listMoneyBills(moneyList, moneyGiven);
        } else {
          System.out.println("Amount cannot be given back.");
          return;
        }
      } else {
        listMoneyBills(moneyList, moneyGiven);
      }
      System.out.println(moneyList);
  }
}
