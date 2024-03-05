package clients;

import java.time.LocalDate;

public class Dog extends Animal {
    public Dog (String name, float weigth, LocalDate age, Owner owner) {
        super(name, weigth, age, owner);
    }

    @Override
    public void fly(){
        System.out.println(getType() + "is not flying");
    }
    
}
