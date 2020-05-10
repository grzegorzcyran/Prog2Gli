package com.grcy.patterns.behavioral.state;

public class Flight {
    FlightState state;

    public Flight() {
        if(this.state == null) {
            this.state = Onboarding.getInstance();
        }
    }

    public void setStatus(FlightState state) {
        this.state = state;
    }
    public void update() {
        if (state instanceof Takeaway) {
            System.out.println("==========Bedziemy startowac");
        } else if (state instanceof Flying) {
            System.out.println("==========Roznosimy drinki i jedzenie");
        }


        state.updateState(this);
    }
}
