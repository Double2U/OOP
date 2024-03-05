package clients;

import java.time.LocalDate;

public class Bird extends Animal {
    public Bird(String name, float weight, LocalDate age, Owner owner){
        super(name, weight, age, owner);
    }


    @Override
    public void swim(){
        System.out.println(getType() + "is not swiming");
    }
    
}
