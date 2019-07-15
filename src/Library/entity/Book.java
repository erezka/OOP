package Library.entity;

import java.util.Objects;

public class Book {
    private int serialNumber;
    private String bookName;
    private String bookAuthor;
    private String bookGenre;
    private int volumes;

    public Book(int serialNumber, String bookName, String bookAuthor, String bookGenre, int volumes) {
        this.serialNumber = serialNumber;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookGenre = bookGenre;
        this.volumes = volumes;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public int getVolumes() {
        return volumes;
    }

    @Override
    public String toString() {
        return "Книга № " + serialNumber + "; " + "За авторством " + bookAuthor + ". "
                + "Название: " + bookName + "; " +
                "Жанр: " + bookGenre + "; " + " Количество томов  - " + volumes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return serialNumber == book.serialNumber &&
                bookName.equals(book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber, bookName);
    }
}
