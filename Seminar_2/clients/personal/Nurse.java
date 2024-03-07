package clients.personal;

import clients.*;

public class Nurse extends Personal {

    public Nurse (String name, String surname, String qualification, int age, int experience){
        super(name, surname, qualification, age, experience);
    }



    public void giveInjection(Animal animal){
        System.out.println(getClass().getSimpleName() + "got injection" + animal.getType());
    }



}
