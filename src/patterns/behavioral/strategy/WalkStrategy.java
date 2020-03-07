package patterns.behavioral.strategy;

public class WalkStrategy implements TravelStrategy {
    private boolean includeTouristicPaths;
    private boolean excludeFastRoads;

    public WalkStrategy(boolean includeTouristicPaths) {
        this.includeTouristicPaths = includeTouristicPaths;
        this.excludeFastRoads = true;
    }
    @Override
    public void setTravelPlan(String from, String to) {
        StringBuilder result = new StringBuilder("Travelling on foot from ")
                .append(from)
                .append(" to ")
                .append(to)
                .append(includeTouristicPaths ? " touristic paths allowed" : "");
        System.out.println(result);
        }
}
