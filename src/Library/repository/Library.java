package Library.repository;
import Library.entity.Book;

public class Library {

    private String libraryName;
    private Book[] books;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books =  new Book[5];
    }

    public String getLibraryName() {
        return libraryName;
    }

    public Book[] getBooks() {
        return books;
    }
}
