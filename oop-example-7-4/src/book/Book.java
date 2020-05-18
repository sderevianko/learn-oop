package book;

public class Book {
    private String authorOfBook = "God";
    private String titleOfBook = "Bible";

    public Book(String authorOfBook, String titleOfBook) {
        this.authorOfBook = authorOfBook;
        this.titleOfBook = titleOfBook;
    }

    public String getAuthorOfBook() {
        return authorOfBook;
    }

    public void setAuthorOfBook(String authorOfBook) {
        this.authorOfBook = authorOfBook;
    }

    public String getTitleOfBook() {
        return titleOfBook;
    }

    public void setTitleOfBook(String titleOfBook) {
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
