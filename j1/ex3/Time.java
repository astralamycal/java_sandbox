package java_sandbox.j1.ex3;

public class Time {
  public int seconds;
  public int minutes;
  public int hours;

  public Time(int seconds, int minutes, int hours) {
    this.seconds = seconds;
    this.minutes = minutes;
    this.hours = hours;
    fixTime();
  }

  public void ToString() {
    String formattedTime = "";
    if (this.hours < 10) {
      formattedTime += "0";
    }
    formattedTime += this.hours + ":";

    if (this.minutes < 10) {
      formattedTime += "0";
    }
    formattedTime += this.minutes + ":";

    if (this.seconds < 10) {
      formattedTime += "0";
    }
    formattedTime += this.seconds;

    System.out.println(formattedTime);
  }

  public void fixTime() {
    while (this.seconds >= 60) {
      this.seconds -= 60;
      this.minutes += 1;
    }

    while (this.minutes >= 60) {
      this.minutes -= 60;
      this.hours += 1;
    }

    while (this.hours >= 24) {
      this.hours -= 24;
    }
  }

  public void addSecond() {
    this.seconds++;
    fixTime();
  }

  public void addSeconds(int seconds) {
    this.seconds += seconds;
    fixTime();
  }
}
