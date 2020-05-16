package com.grcy.patterns.behavioral.observer;

public class MySubscriber implements Observer {

    private String name;
    private Subject topic;

    public MySubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        if(msg == null) {
            System.out.println(name + " : no new messages!");
        } else {
            System.out.println(name + " : reading message: " + msg);
        }
    }

    @Override
    public void setSubject(Subject s) {
        this.topic = s;
    }
}
