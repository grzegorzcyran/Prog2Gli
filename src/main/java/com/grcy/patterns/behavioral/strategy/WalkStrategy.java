package com.grcy.patterns.behavioral.strategy;

public class WalkStrategy implements TravelStrategy {
    private boolean includeTouristicPaths;

    public WalkStrategy(boolean includeTouristicPaths) {
        this.includeTouristicPaths = includeTouristicPaths;
    }

    @Override
    public void setTravelPlan(String from, String to) {
        StringBuilder result = new StringBuilder("Travel by car ")
                .append(includeTouristicPaths ? " including touristic paths" : "");
        System.out.println(result);
    }
}
