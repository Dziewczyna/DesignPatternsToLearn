package designpatterns.decorator2.hen;

import java.util.List;

public abstract class HenDecorator extends Hen {

    public HenDecorator(String name, String colour, String breed) {
        super(name, colour, breed);
    }

    public String layEgg() {
        return super.layEgg();
    }

    public List<String> layEggs(int nrOfEggs) {
        return super.layEggs(nrOfEggs);
    }

    public abstract int getEggCounter();
}
