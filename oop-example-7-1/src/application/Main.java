package application;

import Phone.Phone;

public class Main {

    public static void main(String[] args) {
        Phone num = new Phone("380985775537","k510i",154);
        Phone num2 = new Phone();

        System.out.println("Phone number = " + num.getNumber());
        System.out.println("Phone model = " + num.getModel());
        System.out.println("Phone weight = " + num.getWeight());
        System.out.print("Calling " + num2.receiveCall("John"));
        num.receiveCall("Anna","380965445568");
    }
}
