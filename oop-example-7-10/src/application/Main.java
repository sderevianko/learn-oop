package application;

import computer.Acer;
import computer.Computer;
import computer.Telephone;

public class Main extends Telephone {

    public static void main(String[] args) {
	    Acer acer = new Acer();
        Computer computer = new Computer();
        Telephone telephone = new Telephone();
        Asus asus = new Asus();
        Mobile mobile = new Mobile();
        Monoblock monoblock = new Monoblock();

        // another package

        computer.setSamsung("Good");//public//work
        computer.getSamsung();      //public//work
        computer.read();            //private//dont work
        computer.sleep();           //protected//dont work
        computer.stay();            //default//dont work

        // another package superclass
        telephone.sleep5();    //protected//dont work but may work
        telephone.stay5();     //default//dont work
        telephone.read5();     //private//dont work

        // same package
        mobile.sleep3();    //protected// work
        mobile.stay3();     //default// work
        mobile.read3();     //private//dont work

        // same package superclass
        asus.sleep4();    //protected// work
        asus.stay4();     //default// work
        asus.read4();     //private//dont work


    }
}
