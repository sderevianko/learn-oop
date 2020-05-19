package application;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import person.Person;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        Driver driver2 = new Driver();
        Person person = new Person();
        Engine engine = new Engine();

        person.setFullNamePerson("Anna Lusia");
        car.setCarModel("Tesla model S P100D");
        car.setCarClass("Sedan");
        car.setWeight(2250);
        engine.setManufacturer("USA");
        engine.setPower(100);
        driver2.setFullName(person.getFullNamePerson());
        driver2.setDrivingExperience(12);
        car.setDriver(driver2);
        car.setEngine(engine);
        car.printInfo();
    }
}
