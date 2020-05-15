package recursion;

public class Recursion {

    public int printFromFirstTillSecondNumber(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            System.out.print(firstNumber);
            System.out.print(" ");
            firstNumber -= 1;
        }
        if (firstNumber < secondNumber) {
            System.out.print(firstNumber);
            System.out.print(" ");
            firstNumber += 1;
        }
        if (firstNumber == secondNumber) {
            System.out.print(firstNumber);
            return firstNumber;
        } else {
            return printFromFirstTillSecondNumber(firstNumber, secondNumber);
        }
    }
}
