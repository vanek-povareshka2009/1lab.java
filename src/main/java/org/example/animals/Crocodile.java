package org.example.animals;

public class Crocodile extends predators {
    public static int count;
    public Crocodile(String name, int age, int maxRunDistance, int maxSwimDistance) {
        super(name,"Крокодил", age, maxRunDistance, maxSwimDistance);
        count++;
    }
}
