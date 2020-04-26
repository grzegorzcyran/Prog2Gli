package com.grcy.solid.isp;

import java.util.Collection;

public class ConsoleLogger implements Logger {

    @Override
    public void writeMessage(String message) {
        System.out.println(message);
    }

    @Override
    public Collection<String> getMessages() {
        throw new UnsupportedOperationException("You can't get logged messages for console logger.");
    }

}
