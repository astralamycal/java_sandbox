package java_sandbox.j1.ex2;

public class Voiture {
  public String brand;
  public int price;
  public String model;
  public float distance;

  public Voiture(String brand, int price, String model, float distance) {
    this.brand = brand;
    this.price = price;
    this.model = model;
    this.distance = distance;
  }

  public void addDistance(float distance) {
    this.distance += distance;
    System.out.println(this.distance);
  }

  public void ToString(){
    System.out.println(this.brand + " - " + this.model + " - "
    + this.price + "€ - " + this.distance + " km");
  }
}
