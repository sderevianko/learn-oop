package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    private String carModel;
    private String carClass;
    private int weight;
    private Driver driver;
    private Engine engine;

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void start(){
        System.out.println("Start");
    }

    public void stop(){
        System.out.println("Stop");
    }

    public void turnRight(){
        System.out.println("Turn right");
    }

    public void turnLeft(){
        System.out.println("Turn left");
    }

    public void printInfo() {
        System.out.print(getCarModel());
        System.out.println();
        System.out.print(getCarClass());
        System.out.println();
        System.out.print(getWeight());
        System.out.println();
        System.out.print(getDriver());
        System.out.println();
        System.out.print(getEngine());
    }

    @Override
    public String toString() {
        return "Car{" +
            "carModel='" + carModel + '\'' +
            ", carClass='" + carClass + '\'' +
            ", weight=" + weight +
            ", driver=" + driver +
            ", engine=" + engine +
            '}';
    }
}
