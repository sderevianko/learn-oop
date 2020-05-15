package reader;

import book.Book;

public class Reader {
    public String fullName;
    public int libraryCardNumber;
    public String faculty;
    public String dateOfBirth;
    public String telephoneNumber;

    public Reader(){
    }
    public Reader(String fullName,int libraryCardNumber, String faculty, String dateOfBirth, String telephoneNumber){
        this.fullName = fullName;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.telephoneNumber = telephoneNumber;
    }
    public void takeBook(int numberOfBooksTaken) {
        System.out.print("Petrov V.V. takes ");
        System.out.println(numberOfBooksTaken);
    }
    public void takeBook(String... listOfBooks) {

        System.out.println("Petrov V.V. takes ");
        for (String listOfBook : listOfBooks) {
            System.out.println(listOfBook);
        }
    }
    public void takeBook(Book... args) {
        System.out.println("Petrov V.V. takes ");
        for (Book arg : args) {
            System.out.println(arg);
        }
    }
}
