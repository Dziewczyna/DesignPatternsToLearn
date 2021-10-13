package designpatterns.decorator2;

public class Cat implements Animal {
  private final String name;
  private final String colour;
  private final String breed;

  public Cat(String name, String colour, String breed) {
    this.name = name;
    this.colour = colour;
    this.breed = breed;
  }

  public void go() {
    System.out.println("Cat is going!");
  }

  public void makeASound() {
    System.out.println("Miau!");
  }

  public void play() {
    System.out.println("Drapanie drapaka i fukanie na gości");
  }

  public String toString() {
    return "Wabię się " + name + ", mój kolor futerka to " + colour + ", jestem rasy " + breed;
  }
}
