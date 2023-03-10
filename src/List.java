package uaslp.objetos.list2.src;

public interface List {
     void addAtTail(Object data);
     void addAtFront(Object data);
     void remove(int index);
     void removeAll();
     void removeAllWithValue(Object data);
     void setAt(int index, Object data);
     Object getAt(int index);
     int getSize();
     boolean isEmpty();
     Iterator getIterator();
}
