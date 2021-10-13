package designpatterns.decorator2;

public class Parrot implements Animal {
  private final String name;
  private final String colour;
  private final String breed;

  public Parrot(String name, String colour, String breed) {
    this.name = name;
    this.colour = colour;
    this.breed = breed;
  }

  public void go() {
    System.out.println("Parrot is flying!");
  }

  public void makeASound() {
    System.out.println("Dzień dobry!");
  }

  public void play() {
    System.out.println("Chodzenie i mówienie");
  }

  public String toString() {
    return "Wabię się "
        + name
        + ", kolor mojego upierzenia to "
        + colour
        + ", jestem rasy "
        + breed;
  }
}
