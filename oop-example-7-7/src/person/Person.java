package person;

public class Person {
    private String fullNamePerson;

    public String getFullNamePerson() {
        return fullNamePerson;
    }

    public void setFullNamePerson(String fullNamePerson) {
        this.fullNamePerson = fullNamePerson;
    }

    @Override
    public String toString() {
        return "Person{" +
            "fullNamePerson='" + fullNamePerson + '\'' +
            '}';
    }
}
