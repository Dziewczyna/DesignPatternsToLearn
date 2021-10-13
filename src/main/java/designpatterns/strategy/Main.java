package designpatterns.strategy;

public class Main {

    public static void main(String[] args) {
        Lamp lamp = new Lamp(new GreenBulb());
        lamp.switchLightOn();
    }
}
