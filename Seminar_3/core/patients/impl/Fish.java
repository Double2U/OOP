package core.patients.impl;

import java.time.LocalDate;

import clients.Animal;
import clients.Owner;
import clients.Swimable;

public class Fish extends Animal implements Swimable {

    public Fish (String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public double swim() {
        return 3;
    }


    
}
