package com.binyu.tujieDesignModel._01iterator;

public abstract class AbstractBookShelf implements Aggregate{

    @Override
    public Iterator createIterator() {
        throw new RuntimeException("没有实现具体的迭代器");
    }


    public abstract Book getBookAt(Integer index);
    public abstract void appendBook(Book book);
    public abstract Integer getLength();
}
