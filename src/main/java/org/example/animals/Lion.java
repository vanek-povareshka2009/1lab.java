package org.example.animals;

public class Lion extends predators {
    public static int count;
    public Lion(String name, int age, int maxRunDistance, int maxSwimDistance) {
        super(name,"Лев", age, maxRunDistance, maxSwimDistance);
        count++;
    }
}
