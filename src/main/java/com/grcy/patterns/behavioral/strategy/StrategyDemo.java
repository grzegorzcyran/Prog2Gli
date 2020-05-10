package com.grcy.patterns.behavioral.strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        Travel travel = new Travel("Łańcut", "Wrocław");
        travel.setTravelPlan(new WalkStrategy(false));
        travel.setTravelPlan(new CarStrategy(true, false));
        travel.setTravelPlan(new CarStrategy(false, true));
        //enum na sterydach
        //travel.setTravelPlan(new FlightStrategy());
        //...
     }
}
