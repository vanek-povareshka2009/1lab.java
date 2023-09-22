package org.example.animals;

public class Wolf extends predators {
    public static int count;
    public Wolf(String name, int age, int maxRunDistance, int maxSwimDistance) {
        super(name, "Волк",age, maxRunDistance, maxSwimDistance);
        count++;
    }
}
