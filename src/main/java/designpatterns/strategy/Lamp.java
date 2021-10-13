package designpatterns.strategy;

public class Lamp {
    private Bulb bulb;

    public Lamp(Bulb bulb) {
        this.bulb = bulb;
    }

    public void switchLightOn(){
        System.out.println("Switching lamp on!");
        bulb.shine();
    }
}
