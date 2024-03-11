package core.personal;

import clients.*;
import core.Personal;;

public class Doctor extends Personal{

    private Nurse nurse;

    public Doctor(String name, String surname, String qualification, int age, int experience, Nurse nurse){
        super(name, surname, qualification, age, experience);
        this.nurse = nurse;
    } 

    public Doctor(String name, String surname, String qualification, int age, int experience){
        super(name, surname, qualification, age, experience);
        this.nurse = null;
    } 

    public String getNurse(){
        return getName() + nurse.getSurname();
    }

    public void makeDiagnosis(Animal animal){
        System.out.println(getType() + " made diagnosis " + animal.getType());
    }

    public void prescribeMedicine(Animal animal){
        System.out.println(getType() + " prescibed medicine");
    }

}
