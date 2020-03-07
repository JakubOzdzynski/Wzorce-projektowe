package patterns.structral.decorator;

public class WinterPackage extends CarDecorator {
    boolean seatHeated;

    public WinterPackage(Car car, boolean seatHeated) {
        super(car);
        this.seatHeated = seatHeated;
    }

    @Override
    public void assamble() {
        super.assamble();
        System.out.println("Adding winter package");
    }
}
