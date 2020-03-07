package patterns.behavioral.strategy;

public class CarStartegy implements TravelStrategy {
    private boolean includePaidMotorways;
    private boolean includeFieldRoads;

    public CarStartegy(boolean includePaidMotorways, boolean includeFieldRoads) {
        this.includePaidMotorways = includePaidMotorways;
        this.includeFieldRoads = includeFieldRoads;
    }

    @Override
    public void setTravelPlan(String from, String to) {
        StringBuilder result = new StringBuilder("Travel by car from ")
                .append(from)
                .append(" to ")
                .append(to)
                .append(includePaidMotorways ? " including paid motorways " : "")
                .append(includeFieldRoads ? " including field roads" : "");
        System.out.println(result);
    }
}

