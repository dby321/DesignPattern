package com.binyu.tujieDesignModel._01iterator;

public class BookShelf extends AbstractBookShelf{

    private Book[] books;
    private Integer bookNum;

    public BookShelf(int maxSize) {
        this.books=new Book[maxSize];
        this.bookNum=0;
    }

    @Override
    public void appendBook(Book book){
        this.books[bookNum]=book;
        bookNum++;
    }
    @Override
    public Iterator createIterator() {
        return new BookShelfIterator(this);
    }

    @Override
    public Book getBookAt(Integer index) {
        return this.books[index];
    }

    @Override
    public Integer getLength() {
        return bookNum;
    }
}
