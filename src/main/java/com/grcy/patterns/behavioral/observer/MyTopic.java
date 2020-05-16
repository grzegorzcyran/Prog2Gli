package com.grcy.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {

    private List<Observer> observers;
    private String message;
    private boolean changed;

    public MyTopic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer o) {

        if(o == null) {
            throw new NullPointerException("Null observer");
        }

        if(!observers.contains(o)) {
            observers.add(o);
        }
    }

    @Override
    public void unregister(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        List<Observer> tempObservers = null;

        if(!changed) {
            return;
        }
        //przepisujemy listę do zmiennej lokalnej żeby mieć pewność że nie nastąpi po drodze modyfikacja
        //listy na której działamy
        //czyli nie przybędzie ani nie ubędzie elementów listy (w naszym przypadku obserwujących temat)
        tempObservers = new ArrayList<>(this.observers);
        this.changed = false;

        tempObservers.forEach(Observer::update);

    }

    @Override
    public Object getUpdate(Observer o) {
        return this.message;
    }

    public void postNewMessage(String msg) {
        System.out.println("New message posted ");
        this.message = msg;
        this.changed = true;
        notifyObservers();
    }

}
