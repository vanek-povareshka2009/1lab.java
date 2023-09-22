package org.example.animals;

import java.lang.reflect.Type;

public abstract class predators extends Animal {
    public predators(String name, String type, int age, int maxRunDistance, int maxSwimDistance) {
        super(name, type, age, maxRunDistance, maxSwimDistance);
    }

    public void eat(Animal animal) {
        System.out.println(this.getType() + " скушол " + animal.getType());
    }
}
