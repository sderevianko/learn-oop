package lorry;

import com.company.vehicles.Car;

public class Lorry extends Car {
    private int carrying;

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "Lorry{" +
            "carrying=" + carrying +
            '}';
    }
}
