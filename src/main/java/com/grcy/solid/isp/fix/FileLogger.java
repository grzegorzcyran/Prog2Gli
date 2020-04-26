package com.grcy.solid.isp.fix;

import java.util.ArrayList;
import java.util.Collection;

public class FileLogger implements ReadableLogger {

    @Override
    public void writeMessage(String message) {
        // write message to file
    }

    @Override
    public Collection<String> getMessages() {
        // get messages from logger file
        return new ArrayList<>();
    }
}
