package clients.impl;

import java.time.LocalDate;

import clients.Animal;
import clients.Owner;

public class Duck extends Animal {

    public Duck (String name, float weight, LocalDate age, Owner owner){
        super(name, weight, age, owner);
    }
    
}
