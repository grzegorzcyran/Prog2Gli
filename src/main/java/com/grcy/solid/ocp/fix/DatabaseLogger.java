package com.grcy.solid.ocp.fix;

public class DatabaseLogger implements MessageLogger {


    @Override
    public void log(String message) throws Exception {
        //write message to db
    }
}
