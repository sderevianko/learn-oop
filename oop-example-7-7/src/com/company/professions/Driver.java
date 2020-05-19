package com.company.professions;

import person.Person;

public class Driver extends Person {
    private String fullName;
    private int drivingExperience;

    public String getFullName() {
        return fullName;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    @Override
    public String toString() {
        return "Driver{" +
            "fullName='" + fullName + '\'' +
            ", drivingExperience=" + drivingExperience +
            '}';
    }
}
