package Library.service;

import Library.entity.Book;
import Library.repository.Library;

public interface LibraryFunctionsImpl {
    boolean addBook(Book book, Library library);

    boolean deleteBook(Book book, Library library);

    Book searchBook(int serial, String author, Library library);


}
