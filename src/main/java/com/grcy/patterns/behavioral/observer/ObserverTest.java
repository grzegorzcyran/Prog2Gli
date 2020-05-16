package com.grcy.patterns.behavioral.observer;

public class ObserverTest {

    public static void main(String[] args) {
        Subject subject = new MyTopic();

        Observer o1 = new MySubscriber("Watchman");
        Observer o2 = new MySubscriber("Guardian");
        Observer o3 = new MySubscriber("Mail reader");

        subject.register(o1);
        subject.register(o3);

        o1.setSubject(subject);
        o3.setSubject(subject);

        ((MyTopic) subject).postNewMessage(" first message ");

        subject.register(o2);
        o2.setSubject(subject);
        ((MyTopic) subject).postNewMessage(" second message ");

        subject.unregister(o1);
        ((MyTopic) subject).postNewMessage(" third message ");


    }
}
