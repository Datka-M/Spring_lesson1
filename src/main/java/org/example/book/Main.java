package org.example.book;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

//        Book book = context.getBean("romanBook",Book.class);
//        book.myBooks();

        Library library = context.getBean("myLibrary",Library.class);
//        library.myLibrary();
        library.getAutobiography().myBooks();
        context.close();
    }
}
