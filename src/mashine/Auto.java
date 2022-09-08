package mashine;

public class Auto {
    private String brand;
    private Engine engine;
    private final Wheel wheel;
    private SteeringWheel steeringWheel;
    private Body body;

    public Auto(String brand, String color, Wheel wheel) {
        this.engine = new Engine();
        this.body = new Body(color);
        this.brand = brand;
        this.wheel = wheel;
        this.steeringWheel = new SteeringWheel(this.wheel);
    }

    public void turnRight() {
        steeringWheel.turnRight();
        System.out.println("Машина повернула направо");
    }

    public Wheel getWheel() {
        return wheel;
    }

}
