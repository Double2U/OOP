import java.time.LocalDate;


import clients.*;
import clients.personal.Doctor;
import clients.personal.Nurse;
import clients.personal.Personal;


public class Main {
    public static void main(String[] args) {
        Lion liova = new Lion("Лёва", 45, LocalDate.of (2007, 2, 3), new Owner());
        Fish fish = new Fish("Дори", 1, null,  new Owner());
        Duck duck = new Duck("Скрудж", 2, null, null);
        Cat  cat = new Cat ("Вася", 2, LocalDate.of(2024,3,5), new Owner());
        Bird bird = new Bird("Кеша", 1, null, null);
        Dog dog = new Dog  ("Рекс", 4, null, new Owner());
        Personal nurse = new Nurse("Мария","Иванова" , "Процедурная", 25, 1);

        VeterinaryClinic veterinaryClinic = new VeterinaryClinic();

        
        veterinaryClinic.acceptEmployee(new Doctor("Виталий", "Ларин", "Терапевт", 36 , 4));
        veterinaryClinic.acceptEmployee(nurse);
        veterinaryClinic.getPersonal();
        veterinaryClinic.dismissEmployee(nurse);
        veterinaryClinic.getPersonal();
        veterinaryClinic.acceptAnimal(dog);
        veterinaryClinic.acceptAnimal(cat);
        veterinaryClinic.acceptAnimal(bird);
        veterinaryClinic.acceptAnimal(duck);
        veterinaryClinic.acceptAnimal(fish);
        veterinaryClinic.acceptAnimal(liova);
        veterinaryClinic.getAnimal();
        veterinaryClinic.dischargeAnimal(dog);
        veterinaryClinic.getAnimal();
        veterinaryClinic.getFlyableAnimal();
        veterinaryClinic.getGoableAnimal();
        veterinaryClinic.getSwimablesAnimal();

    }
}