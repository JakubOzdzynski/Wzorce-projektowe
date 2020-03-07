package patterns.structral.adapter;

public abstract class AmericanCar implements AmericanMovable {
    double speed;

    public double getSpeedKMH() {
        return speed * Main.SpeedConverter.MILES_TO_KILOMETERS.getConverter();
    }
}
