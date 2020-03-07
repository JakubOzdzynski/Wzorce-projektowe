package patterns.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        Travel travel = new Travel("Rzeszów", "Kraków");
        travel.setTravelPlan(new WalkStrategy(false));
        travel.setTravelPlan(new CarStartegy(true, false));
        travel.setTravelPlan(new CarStartegy(false, true));
    }
}
