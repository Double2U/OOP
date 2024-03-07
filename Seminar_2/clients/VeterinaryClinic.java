package clients;

import java.util.ArrayList;
import java.util.List;
import clients.personal.*;


public class VeterinaryClinic {

    private List<Personal> personal = new ArrayList<>();
    private List<Animal> animals = new ArrayList<>();

    public void acceptEmployee(Personal employee) {
        personal.add(employee);
    }

    public void dismissEmployee(Personal employee) {
        personal.remove(employee);
    }

    public void acceptAnimal(Animal animal){
        animals.add(animal);
    }

    public void  dischargeAnimal(Animal animal) {
        animals.remove(animal);
    }

    public void getPersonal (){
        System.out.println(personal);
    }

    public void getAnimal (){
        System.out.println(animals);
    }

    public void getFlyableAnimal(){
        List<Flyable> flyables = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Flyable){
                flyables.add((Flyable)animal);
            }
        }
        System.out.println(flyables);
    }

    public void getGoableAnimal(){
        List<Goable> goables = new ArrayList<>();
        for (Animal animal : animals){
            if (animal instanceof Goable){
                goables.add(((Goable)animal));
            }
        }
        System.out.println(goables);
    }

    public void getSwimablesAnimal(){
        List<Swimable> swimables = new ArrayList<>();
        for (Animal animal : animals){
            if (animal instanceof Swimable){
                swimables.add(((Swimable) animal));
            }
        }
        System.out.println(swimables);
    }
}