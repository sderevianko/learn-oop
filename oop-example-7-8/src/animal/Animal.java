package animal;

import java.util.Objects;

public class Animal {
    private String food;
    private String location;

    public void makeNoise() {
        System.out.println("Animal is sleeping");
    }

    public void eat(){
        System.out.println("Animal is eating");
    }

    public void sleep() {
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(food, animal.food) &&
            Objects.equals(location, animal.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(food, location);
    }

    @Override
    public String toString() {
        return "Animal{" +
            "food='" + food + '\'' +
            ", location='" + location + '\'' +
            '}';
    }
}
