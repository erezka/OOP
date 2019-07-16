package Library.service;

import Library.entity.Book;
import Library.repository.Library;

public class Demo implements RunableImpl {
    public void run(){
        Library library1 = new Library("Библиотека Антохи");
        Book book1 = new Book(1,"Гарри Поттер","Джоан Роулинг","Фэнтези",7);
        Book book2 = new Book(2,"Властелин Колец","Дж.Р.Р.Толкиен","Фэнтези",3);
        Book book3 = new Book(3,"Хранитель мечей","Ник Перумов","Фэнтези",15);
        Book book4 = new Book(4,"Пятьдесят оттенков серого"," Э. Л. Джеймс","женский роман",3);
        Book book5 = new Book(5,"Удивительные приключения Робинзона Крузо","Д.Дэфо","приключенческий роман",1);

        library1.addBook(book1);
        library1.addBook(book2);
        library1.addBook(book3);
        library1.addBook(book4);
        library1.addBook(book5);

        library1.howManyBooks(library1);
        System.out.println(library1.toString());

        library1.searchBook("хранитель мечей","ник перумов");
        library1.deleteBook(4);

        System.out.println(library1.searchBook("Гарри Поттер", "джоан Роулинг").toString());












    }
}
