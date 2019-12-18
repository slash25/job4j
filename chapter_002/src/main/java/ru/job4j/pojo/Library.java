package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Mathematic",100);
        Book book2 = new Book("Phisiks", 50);
        Book book3 = new Book("Geografy",98 );
        Book book4 = new Book("Clean code",300);

        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;

        for (int index = 0 ; index < books.length; index++){
            Book bk = books[index];
            System.out.println(bk.getName() + " - " + bk.getPages());
        }
        System.out.println("Replace Mathematics and Clean code.");

        books[0] = book4;
        books[3] = book1;

        for (int index = 0 ; index < books.length; index++){
            Book bk = books[index];
            System.out.println(bk.getName() + " - " + bk.getPages());
        }
        System.out.println("Search book with name Clean code.");

        for (int index = 0 ; index < books.length; index++){
            Book bk = books[index];
            if (bk.getName().equals("Clean code"))
            System.out.println(bk.getName() + " - " + bk.getPages() );
        }
    }
}
