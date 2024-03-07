package clients.impl;

import java.time.LocalDate;

import clients.Animal;
import clients.Goable;
import clients.Owner;
import clients.Swimable;

public class Dog extends Animal implements Goable, Swimable {
    public Dog (String name, float weigth, LocalDate age, Owner owner) {
        super(name, weigth, age, owner);
    }

    @Override
    public double run(){
        return 7;
    }

    @Override
    public double swim(){
        return 2;
    }
    
}
