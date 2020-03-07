package patterns.behavioral.strategy;

public class Travel {
    private String startPoint;
    private String destinationPoint;

    public Travel(String startPoint, String destinationPoint) {
        this.startPoint = startPoint;
        this.destinationPoint = destinationPoint;
    }
    public void setTravelPlan(TravelStrategy plan) {
        plan.setTravelPlan(startPoint, destinationPoint);
    }
}
