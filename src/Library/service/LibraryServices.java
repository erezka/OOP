package Library.service;

import Library.entity.Book;
import Library.repository.Library;

public class LibraryServices implements LibraryFunctionsImpl {

    public boolean addBook(Book book, Library library) {
        for (int i = 0; i < library.getBooks().length; i++) {
            if (library.getBooks()[i] == null) {
                library.getBooks()[i] = book;
                return true;
            }

        }
        return false;

    }

    public boolean deleteBook(Book book, Library library) {
        for (int i = 0; i < library.getBooks().length; i++) {
            if (library.getBooks()[i] != null && library.getBooks()[i].equals(book)) {
                library.getBooks()[i] = null;
                return true;
            }
        }
        return false;

    }

    public Book searchBook(int serial, String name, Library library) {
        for (int i = 0; i < library.getBooks().length;i++) {
            if (library.getBooks()[i] != null && )

        }

    }
}
