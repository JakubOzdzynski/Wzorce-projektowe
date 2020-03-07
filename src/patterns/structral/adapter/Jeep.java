package patterns.structral.adapter;

public class Jeep extends AmericanCar {
    String name;

    public Jeep(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }
    public String getName() {
        return name;
    }

    @Override
    public double getSpeed() {
        return speed;
    }
}

