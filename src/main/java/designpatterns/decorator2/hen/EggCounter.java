package designpatterns.decorator2.hen;

import java.util.List;

public class EggCounter extends HenDecorator {
  private int eggCounter = 0;

  public EggCounter(String name, String colour, String breed) {
    super(name, colour, breed);
  }

  @Override
  public String layEgg() {
    int tmpEggCounter = eggCounter + 1;
    return super.layEgg();
  }

  @Override
  public List<String> layEggs(int nrOfEggs) {
    eggCounter += nrOfEggs;
    System.out.println("Laid " + nrOfEggs + " eggs");
    return super.layEggs(nrOfEggs);
  }

  public int getEggCounter() {
    return eggCounter;
  }
}
