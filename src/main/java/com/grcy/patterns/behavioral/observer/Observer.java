package com.grcy.patterns.behavioral.observer;

public interface Observer {

    void update();

    void setSubject(Subject s);
}
