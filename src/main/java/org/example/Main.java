package org.example;

import org.example.animals.*;

public class Main {
    public static void main(String[] args) {


        Animal[] animals = {
                new Cat("Barsik", 5, 200, 0),
                new Dog("Kuzma", 3, 500, 10),
                new Tiger("Sanek", 8, 150, 50),
                new Tiger("Vanek", 4, 150, 50),
                new Wolf("Barsik2", 5, 200, 0),
                new Lion("Kyzya", 13, 500, 0),
                new Crocodile("Kyzya1",6, 50, 200)
        };

        for (Animal a : animals) {
            a.run(60);
            a.swim(100);
        }

        System.out.println("Количество котов " + Cat.count);
        System.out.println("Количество собак " + Dog.count);
        System.out.println("Количество тигров " + Tiger.count);
        System.out.println("Количество волков " + Wolf.count);
        System.out.println("Количество львов " + Lion.count);
        System.out.println("Количество крокодилов " + Crocodile.count + "\n");




        ((predators) animals[6]).eat(animals[0]);
        ((predators) animals[4]).eat(animals[1]);
        ((predators) animals[5]).eat(animals[3]);

    }
}