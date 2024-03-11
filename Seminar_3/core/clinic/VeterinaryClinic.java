package core.clinic;

import java.util.ArrayList;
import java.util.List;

import core.*;

public class VeterinaryClinic {

    private List<Personal> personal = new ArrayList<>();
    private List<Animal> patients = new ArrayList<>();

    public void acceptEmployee(Personal employee) {
        personal.add(employee);
    }

    public void dismissEmployee(Personal employee) {
        personal.remove(employee);
    }

    public void acceptAnimal(Animal animal){
        patients.add(animal);
    }

    public void  dischargeAnimal(Animal animal) {
        patients.remove(animal);
    }

    public List<Personal> getPersonal(){
        return personal;
    }

    public List<Animal> getAnimal (){
        return patients;
    }

    public List<Animal> getFlyableAnimal(){
        List<Animal> flyables = new ArrayList<>();
        for (Animal animal : patients) {
            if (animal instanceof Flyable){
                flyables.add(animal);
            }
        }
        return flyables;
    }

    public List<Animal> getGoableAnimal(){
        List<Animal> goables = new ArrayList<>();
        for (Animal animal : patients){
            if (animal instanceof Goable){
                goables.add(animal);
            }
        }
        return goables;
    }

    public List<Animal> getSwimablesAnimal(){
        List<Animal> swimables = new ArrayList<>();
        for (Animal animal : patients){
            if (animal instanceof Swimable){
                swimables.add(animal);
            }
        }
        return swimables;
    }
}