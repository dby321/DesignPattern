package com.binyu.tujieDesignModel._01iterator;

public class Client {
    public static void main(String[] args) {
        Book book1 = new Book("《时间简史》");
        Book book2= new Book("《设计模式》");
        Book book3 = new Book("《大话西游》");
        BookShelf bookShelf = new BookShelf(5);
        bookShelf.appendBook(book1);
        bookShelf.appendBook(book2);
        bookShelf.appendBook(book3);
        System.out.println("-------------------------");
        Iterator iterator = bookShelf.createIterator();
        while(iterator.hasNext()){
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
        System.out.println("bookShelf.getLength():"+bookShelf.getLength());

        System.out.println("-------------------------");
        BookShelf2 bookShelf1 = new BookShelf2(3);
        bookShelf1.appendBook(book1);
        bookShelf1.appendBook(book2);
        bookShelf1.appendBook(book3);
        bookShelf1.appendBook(new Book("《重构》"));
        Iterator iterator1 = bookShelf1.createIterator();
        while(iterator1.hasNext()){
            Book book = (Book) iterator1.next();
            System.out.println(book.getName());
        }

    }
}
