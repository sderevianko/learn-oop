package Phone;

import java.util.Objects;

public class Phone {

    public Phone(){
    }
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone(String number, String model,int weight) {
        this(number, model);
        this.weight = weight;
    }
    private String number;
    private String model;
    private int weight;
    //public int vars;

    public String receiveCall(String nameOfCaller) {
        return nameOfCaller;
    }

    public void receiveCall(String nameOfCaller, String number) {
        this.number = number;
    }

    /*static void sendMessage(String... vars) {
        System.out.println(" : " + vars.length);

        for(int i = 0; vars.; i++) {
            System.out.println(" arg " + i + ": " + vars[i]);
        }
    }*/

    public String getNumber() {
        return number;
    }
    public String getModel() {
        return model;
    }
    public int getWeight() {
        return weight;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return weight == phone.weight &&
            Objects.equals(number, phone.number) &&
            Objects.equals(model, phone.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, model, weight);
    }

    @Override
    public String toString() {
        return "Phone{" +
            "number='" + number + '\'' +
            ", model='" + model + '\'' +
            ", weight=" + weight +
            '}';
    }
}
