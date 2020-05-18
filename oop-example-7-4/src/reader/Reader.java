package reader;

import book.Book;

public class Reader {
    private String fullName;
    private int libraryCardNumber;
    private String faculty;
    private String dateOfBirth;
    private String telephoneNumber;

    public Reader(){
    }

    public Reader(String fullName, int libraryCardNumber, String faculty, String dateOfBirth, String telephoneNumber){
        this.fullName = fullName;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.telephoneNumber = telephoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getLibraryCardNumber() {
        return libraryCardNumber;
    }

    public void setLibraryCardNumber(int libraryCardNumber) {
        this.libraryCardNumber = libraryCardNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
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
