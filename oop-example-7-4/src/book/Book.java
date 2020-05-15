package book;

public class Book {
    public String authorOfBook = "God";
    public String titleOfBook = "Bible";

    public Book(String authorOfBook, String titleOfBook) {
        this.authorOfBook = authorOfBook;
        this.titleOfBook = titleOfBook;

    }

    @Override
    public String toString() {
        return "Book{" +
            "authorOfBook='" + authorOfBook + '\'' +
            ", titleOfBook='" + titleOfBook + '\'' +
            '}';
    }
}
