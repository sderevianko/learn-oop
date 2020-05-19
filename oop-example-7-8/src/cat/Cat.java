package cat;

import animal.Animal;

import java.util.Objects;

public class Cat extends Animal {
    private int numberOfLives;

    public void makeNoise() {
        System.out.println("Cat is sleeping");
    }

    public void eat(){
        System.out.println("Cat is eating");
    }

    public int getNumberOfLives() {
        return numberOfLives;
    }

    public void setNumberOfLives(int numberOfLives) {
        this.numberOfLives = numberOfLives;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return numberOfLives == cat.numberOfLives;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfLives);
    }

    @Override
    public String toString() {
        return "Cat{" +
            "numberOfLives=" + numberOfLives +
            '}';
    }
}
