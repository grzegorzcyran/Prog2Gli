package com.grcy.solid.ocp;

public class Logger {
    private LogDestination destination;

    public Logger(LogDestination destination) {
        this.destination = destination;
    }

    public void log(String message) throws Exception {
        switch (destination) {
            case CONSOLE:
                System.out.println("Printing to Console: " + message);
                break;
            case DB:
                System.out.println("Saving to DB: " + message);
                break;
            default:
                throw new IllegalArgumentException("Unsupported logging type!");
        }
    }
}
