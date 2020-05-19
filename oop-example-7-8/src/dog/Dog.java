package dog;

import animal.Animal;

import java.util.Objects;

public class Dog extends Animal {
    private int age;

    public void makeNoise() {
        System.out.println("Dog is sleeping");
    }

    public void eat(){
        System.out.println("Dog is eating");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    @Override
    public String toString() {
        return "Dog{" +
            "age=" + age +
            '}';
    }
}
