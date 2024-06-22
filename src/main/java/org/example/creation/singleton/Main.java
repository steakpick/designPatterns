package org.example.creation.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton = Singleton.getInstance();
        singleton = Singleton.getInstance();
    }
}
