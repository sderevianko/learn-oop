package application;

import book.Book;
import reader.Reader;

public class Main {

    public static void main(String[] args) {

        Reader[] read = new Reader[3];
        read[0] = new Reader("Alex Smith", 100, "historical", "08-08-1994", "0976556453");
        read[1] = new Reader("Maria Smith", 101, "biological", "03-06-1997", "0986554732");
        read[2] = new Reader("Johann Carl Friedrich Gauss", 102, "physical", "11-10-1975", "0506798012");

        Reader r = new Reader();
        r.takeBook(3);
        r.takeBook("Black Holes and Baby Universes and Other Essays","The Universe in a Nutshell", "On the Shoulders of Giants");

        Book b = new Book("Stephen William Hawking","A Brief History of Time");
        Book c = new Book("Freeman John Dyson","Symmetry Groups in Nuclear and Particle Physics");
        r.takeBook(b, c);
    }
}
