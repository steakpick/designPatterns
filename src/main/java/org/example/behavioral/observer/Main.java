package org.example.behavioral.observer;

import org.example.behavioral.observer.con.ConcreteSubject;
import org.example.behavioral.observer.obs.ConcreteObserver;
import org.example.behavioral.observer.obs.Observer;

public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");

        subject.attach(observer1);
        subject.attach(observer2);

        subject.setMessage("Hello, observers!");
        subject.setMessage("Another message");

        subject.detach(observer2);

        subject.setMessage("Who left?");
    }
}
