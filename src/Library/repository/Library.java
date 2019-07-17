package Library.repository;

import Library.entity.Book;
import Library.service.LibraryFunctionsImpl;

public class Library implements LibraryFunctionsImpl {

    private String libraryName;
    private Book[] books;


    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new Book[5];
    }

    public String getLibraryName() {
        return libraryName;
    }

    public Book[] getBooks() {
        return books;
    }

    public boolean addBook(Book book) {
        for (int i = 0; i < getBooks().length; i++) {
            if (getBooks()[i] == null) {
                getBooks()[i] = book;
                return true;
            }

        }
        return false;

    }

    public boolean deleteBook(int serial) {
        for (int i = 0; i < getBooks().length; i++) {
            if (getBooks()[i] != null && serial == getBooks()[i].getSerialNumber()) {
                getBooks()[i] = null;
                return true;
            }
        }
        return false;

    }

    public Book searchBook(String bookName, String bookAuthor) {
        for (int i = 0; i < getBooks().length; i++) {
            if (getBooks()[i] != null && bookName.equalsIgnoreCase(getBooks()[i].getBookName()) &&
                    bookAuthor.equalsIgnoreCase(getBooks()[i].getBookAuthor())) {
                return getBooks()[i];
            }
        }
        return null;
    }

    public int howManyBooks(Library library) {
        int count = 0;
        for (int i = 0; i < library.getBooks().length; i++) {
            if (library.getBooks()[i] != null) {
                count++;
            }

        }
        return count;
    }

    @Override
    public String toString() {
        return "В библиотеке " + libraryName + " содержится " + howManyBooks(this) + " книг";
    }
}
