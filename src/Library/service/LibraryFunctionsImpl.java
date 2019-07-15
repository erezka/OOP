package Library.service;

import Library.entity.Book;
import Library.repository.Library;

public interface LibraryFunctionsImpl {
    boolean addBook(Book book, Library library);

    boolean deleteBook(Book book, Library library);

    Book searchBook(String author, String name, Library library, Book book);


}
