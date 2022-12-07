package com.binyu.tujieDesignModel._01iterator;

public class BookShelfIterator implements Iterator {
    private AbstractBookShelf bookShelf;
    private Integer index;
    public BookShelfIterator(AbstractBookShelf bookShelf) {
        this.bookShelf=bookShelf;
        this.index=0;
    }

    @Override
    public Boolean hasNext() {
        if(index<bookShelf.getLength()){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
