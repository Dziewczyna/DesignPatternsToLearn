package designpatterns.strategy;

public class GreenBulb implements Bulb {

    @Override
    public void shine() {
        System.out.println("I'm shining green light!");
    }
}
