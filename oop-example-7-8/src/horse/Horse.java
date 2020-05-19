package horse;

import animal.Animal;

import java.util.Objects;

public class Horse extends Animal {
    private int speed;

    public void makeNoise() {
        System.out.println("Horse is sleeping");
    }

    public void eat(){
        System.out.println("Horse is eating");
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return speed == horse.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }

    @Override
    public String toString() {
        return "Horse{" +
            "speed=" + speed +
            '}';
    }
}
