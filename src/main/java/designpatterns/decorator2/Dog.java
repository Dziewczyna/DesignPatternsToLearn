package designpatterns.decorator2;

public class Dog implements Animal {
  private final String name;
  private final String breed;
  private final String lengthOfDogFur;

  public Dog(String name, String breed, String lengthOfDogFur) {
    this.name = name;
    this.breed = breed;
    this.lengthOfDogFur = lengthOfDogFur;
  }

  public void go() {
    System.out.println("Dog is going!");
  }

  public void makeASound() {
    System.out.println("Hau!");
  }

  public void play() {
    System.out.println("łapanie piłeczki");
  }

  public String toString() {
    return "Wabię się "
        + name
        + ", jestem rasy "
        + breed
        + ", a mój rodzaj sierści to "
        + lengthOfDogFur;
  }
}
