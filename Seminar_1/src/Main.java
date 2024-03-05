import clients.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Lion liova = new Lion("Лёва", 45, LocalDate.of
                (2007, 2, 3), new Owner());
        Fish fish = new Fish("Дори", 1, null,  new Owner());
        Duck duck = new Duck("Скрудж", 2, null, null);
        Cat  cat = new Cat ("Вася", 2, LocalDate.of(2024,3,5), new Owner());
        Bird bird = new Bird("Кеша", 1, null, null);
        Dog dog = new Dog  ("Рекс", 4, null, new Owner());



        System.out.println(liova);
        System.out.println(liova.getType());
        liova.lifeCycle();
        fish.fly();
        fish.go();
        fish.swim();
        duck.fly();
        duck.swim();
        duck.go();
        dog.fly();
        cat.swim();
        bird.go();

        List<Animal> animals = new ArrayList<>();
        animals.add(liova);;
        animals.add(fish);
        animals.add(duck);
        animals.add(fish);
        System.out.println(animals);
    }
}