package patterns.behavioral.state;

public class Flight {
    FlightState flightState;

    public Flight() {
        if (this.flightState == null)
            this.flightState = Onboarding.getInstance();
    }

    public void setFlightState(FlightState flightState) {
        this.flightState = flightState;
    }
    public void update() {
        flightState.updateState(this);
    }
//    public void processFlight() {
//        switch (flightState) {
//            case Onboarding
//        }
//    }
}
