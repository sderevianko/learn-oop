package com.company.details;

public class Engine {
    private int power;
    private String manufacturer;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Engine{" +
            "power=" + power +
            ", manufacturer='" + manufacturer + '\'' +
            '}';
    }
}
