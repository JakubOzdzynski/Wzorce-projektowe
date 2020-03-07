package patterns.structral.decorator;

public class SportPackage extends CarDecorator {
    boolean sportSeats;
    boolean sportWheel;

    public SportPackage(Car car, boolean sportSeats) {
        super(car);
        this.sportSeats = sportSeats;
        this.sportWheel = false;
    }

    public void addSportWheel() {
        this.sportWheel = true;
    }

    @Override
    public void assamble() {
        super.assamble();
        System.out.println("Adding sport package");
    }
}
