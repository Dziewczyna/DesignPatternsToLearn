package designpatterns.decorator2.hen;

import java.util.ArrayList;
import java.util.List;

public abstract class Hen {
  private final String name;
  private final String colour;
  private final String breed;

  public Hen(String name, String colour, String breed) {
    this.name = name;
    this.colour = colour;
    this.breed = breed;
  }

  public String layEgg() {
    return "laid 1 egg";
  }

  public List<String> layEggs(int nrOfEggs) {
    List<String> laidEggs = new ArrayList<>();
    for (int i = 0; i < nrOfEggs; i++) {
      laidEggs.add(layEgg());
    }
    return laidEggs;
  }

  public abstract int getEggCounter();
}
