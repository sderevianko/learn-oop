package Person;

public class Person {

    public Person(){
    }
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    private String fullName;
    private int age;

    public void talk() {
        System.out.println("Person " + fullName + " is speaking");
    }
    public int getAge() {
        return age;
    }
    public String getFullName() {
        return fullName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
