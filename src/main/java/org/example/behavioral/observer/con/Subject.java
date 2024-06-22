package org.example.behavioral.observer.con;

import org.example.behavioral.observer.obs.Observer;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}
