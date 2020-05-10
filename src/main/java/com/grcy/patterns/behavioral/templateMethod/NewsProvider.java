package com.grcy.patterns.behavioral.templateMethod;

public abstract class NewsProvider {
    private int id;
    private String message;

    public abstract boolean authorize();

    public final boolean sendMessage() {
        System.out.println("Message sent:"+message);
        return true;
    }
    public abstract boolean endConnection();

    public final void provideNews() {
        authorize();
        sendMessage();
        endConnection();
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
