package Library.service;

import Library.entity.Book;
import Library.repository.Library;

public interface LibraryFunctionsImpl {
    boolean addBook(Book book);

    boolean deleteBook(int serial);

    Book searchBook(String bookName, String bookAuthor);


}
