package com.grcy.solid.ocp.fix;

import com.grcy.solid.ocp.LogDestination;

public class Logger {
    MessageLogger messageLogger;

    public Logger(MessageLogger messageLogger) {

        this.messageLogger = messageLogger;
    }
    public void log(String message) throws Exception {
        messageLogger.log(message);
    }
}
