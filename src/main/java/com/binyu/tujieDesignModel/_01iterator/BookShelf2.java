package com.binyu.tujieDesignModel._01iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf2 extends AbstractBookShelf{
    private List<Book> books;
    private Integer bookNum;

    public BookShelf2(int maxSize) {
        this.books=new ArrayList<>(maxSize);
        this.bookNum=0;
    }
    public void appendBook(Book book){
        this.books.add(book);
        bookNum++;
    }
    @Override
    public Iterator createIterator() {
        return new BookShelfIterator(this);
    }

    @Override
    public Book getBookAt(Integer index) {
        return this.books.get(index);
    }

    public Integer getLength() {
        return bookNum;
    }
}
