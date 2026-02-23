package java_sandbox.j1.ex3;

public class Main {
  public static void main(String[] args) {
    Time time = new Time(33, 42, 2);
    time.toString();
    time.addSecond();
    time.toString();
    time.addSeconds(3457);
    time.toString();
  }
}