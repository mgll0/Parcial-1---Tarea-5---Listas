package Interfaces;

import Exceptions.BadIndexException;
import Exceptions.CollectionsException;
import Exceptions.NotNullAllowedException;

public interface List <T>{
    void addAtTail(T data) throws NotNullAllowedException;
    void addAtFront(T data) throws NotNullAllowedException;
    void remove(int index) throws BadIndexException;
    void removeAll();
    void removeAllWithValue(T data) throws NotNullAllowedException;
    void setAt(int index, T data) throws CollectionsException;
    T getAt(int index) throws BadIndexException;
    int getSize();
    boolean isEmpty();
    Iterator<T> getIterator();
}