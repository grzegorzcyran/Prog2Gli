package com.grcy.solid.ocp.fix;

public class ConsoleLogger implements MessageLogger {

    @Override
    public void log(String message) throws Exception {
        System.out.println(message);
    }
}
