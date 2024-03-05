package clients;

import java.time.LocalDate;

public class Cat extends Animal {
    public Cat (String name, float weigth, LocalDate age, Owner owner ){
        super(name, weigth, age, owner);
    }

    @Override
    public void fly(){
        System.out.println(getType() + " is not flying");
    }

    @Override
    public void swim(){
        System.out.println(getType() + " is not swiming");
    }
    
}
