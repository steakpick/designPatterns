package org.example.creation.singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
            System.out.println("Instance created");
        }
        System.out.println("Instance returned");
        return instance;
    }

}
