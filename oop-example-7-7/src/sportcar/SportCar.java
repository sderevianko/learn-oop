package sportcar;

import com.company.vehicles.Car;

public class SportCar extends Car {
    private double speed;

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
            "speed=" + speed +
            '}';
    }
}
