package application;

import animal.Animal;
import cat.Cat;
import dog.Dog;
import horse.Horse;
import vet.Vet;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Vet vet = new Vet();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Horse horse = new Horse();

        List<Animal> animalList = new ArrayList<>();
        animalList.add(cat);
        animalList.add(dog);
        animalList.add(horse);

        animal1.setFood("Meat");
        cat.setFood("Fish");
        dog.setFood("Duck");
        horse.setFood("Sugar");

        for (Animal animal : animalList) {
            vet.treatAnimal(animal);
        }
    }
}
