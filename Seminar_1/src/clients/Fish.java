package clients;

import java.time.LocalDate;


public class Fish extends Animal {

    public Fish (String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void fly(){
        System.out.println(getType() + " is not flying");
    }

    @Override
    public void go() {
        System.out.println(getType() + " is not going");
    }
    
}
