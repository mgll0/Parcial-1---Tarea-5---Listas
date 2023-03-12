package uaslp.objetos.list2.src;

public interface List <T>{
     void addAtTail(T data);
     void addAtFront(T data);
     void remove(int index);
     void removeAll();
     void removeAllWithValue(T data);
     void setAt(int index, T data);
     T getAt(int index);
     int getSize();
     boolean isEmpty();
     Iterator<T> getIterator();
}
