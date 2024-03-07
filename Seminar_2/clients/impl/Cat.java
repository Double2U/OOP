package clients.impl;

import java.time.LocalDate;

import clients.Animal;
import clients.Goable;
import clients.Owner;

public class Cat extends Animal implements Goable {
    public Cat (String name, float weigth, LocalDate age, Owner owner ){
        super(name, weigth, age, owner);
    }

    @Override
    public double run(){
        return 5;
    }
}
