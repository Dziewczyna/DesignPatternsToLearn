package designpatterns.decorator2;

import designpatterns.decorator2.hen.EggCounter;
import designpatterns.decorator2.hen.Hen;

import java.util.ArrayList;
import java.util.List;

public class Runner {
  public static void main(String[] args) {
    Cat cat = new Cat("IdźStąd", "szary", "dachowiec");
    cat.go();

    Dog dog = new Dog("Bailey", "Owczarek Podhalański", "średnia");
    dog.go();

    Parrot parrot = new Parrot("Felix", "kolorowy", "falista");
    parrot.go();

    List<Animal> object = new ArrayList<>();
    object.add(cat);
    object.add(dog);
    object.add(parrot);
    for (Animal animal : object) {
      animal.toString();
      animal.go();
    }

    Hen eggCounter = new EggCounter("Felix", "kolorowy", "falista");
    System.out.println(eggCounter.layEggs(4));
    System.out.println(eggCounter.getEggCounter());
  }
}
