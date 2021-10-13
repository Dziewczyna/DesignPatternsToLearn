package designpatterns.strategy;

public class BlueBulb implements Bulb {
    @Override
    public void shine() {
        System.out.println("I'm shining blue!");
    }
}
