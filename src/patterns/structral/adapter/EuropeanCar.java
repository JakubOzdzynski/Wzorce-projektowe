package patterns.structral.adapter;

public abstract class EuropeanCar implements EuropeanMovable {
    double speed;

    public double getSpeedMPH() {
        return speed * Main.SpeedConverter.KILOMETERS_TO_MILES.getConverter();
    }
}
