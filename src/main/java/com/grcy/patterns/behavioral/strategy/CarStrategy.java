package com.grcy.patterns.behavioral.strategy;

public class CarStrategy implements TravelStrategy{
    private boolean includePaidMotorways;
    private boolean includeFieldRoads;

    public CarStrategy(boolean includePaidMotorways, boolean includeFieldRoads) {
        this.includePaidMotorways = includePaidMotorways;
        this.includeFieldRoads = includeFieldRoads;
    }

    @Override
    public void setTravelPlan(String from, String to) {

        StringBuilder result = new StringBuilder("Travel by car ")
                .append(includePaidMotorways ? "including paid motorways"  : "")
                .append(includeFieldRoads ? " including field roads" : "");
        System.out.println(result);
    }
}
