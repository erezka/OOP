package Library.service;

import Library.entity.Book;


public interface LibraryFunctionsImpl {

    boolean addBook(Book book);

    boolean deleteBook(int serial);

    Book searchBook(String bookName, String bookAuthor);


}
