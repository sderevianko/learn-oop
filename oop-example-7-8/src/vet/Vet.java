package vet;

import animal.Animal;
import cat.Cat;
import dog.Dog;
import horse.Horse;

import java.util.Objects;

public class Vet {
    private Animal animal;

    Cat cat = new Cat();
    Dog dog = new Dog();
    Horse horse = new Horse();

    public void treatAnimal(Animal animal){
        if (animal.equals(cat)) {
            cat.setFood("Fish");
            cat.setLocation("Wood");
            System.out.print("Cat Food - ");
            System.out.println(cat.getFood());
            System.out.print("Cat Location - ");
            System.out.println(cat.getLocation());
        }
        if (animal.equals(dog)) {
            dog.setFood("Duck");
            dog.setLocation("Home");
            System.out.print("Dog Food - ");
            System.out.println(dog.getFood());
            System.out.print("Dog Location - ");
            System.out.println(dog.getLocation());
        }
        if (animal.equals(horse)) {
            horse.setFood("Sugar");
            horse.setLocation("Field");
            System.out.print("Horse Food - ");
            System.out.println(horse.getFood());
            System.out.print("Horse Location - ");
            System.out.println(horse.getLocation());
        }
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vet vet = (Vet) o;
        return Objects.equals(animal, vet.animal) &&
            Objects.equals(cat, vet.cat) &&
            Objects.equals(dog, vet.dog) &&
            Objects.equals(horse, vet.horse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animal, cat, dog, horse);
    }

    @Override
    public String toString() {
        return "Vet{" +
            "animal=" + animal +
            ", cat=" + cat +
            ", dog=" + dog +
            ", horse=" + horse +
            '}';
    }
}
