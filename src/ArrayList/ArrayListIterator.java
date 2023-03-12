package uaslp.objetos.list2.src.ArrayList;

import uaslp.objetos.list2.src.Iterator;
public class ArrayListIterator <T> implements Iterator <T>{
    private T currentObject;
    private int currentIndex;
    private final ArrayList<T> list;

    ArrayListIterator(ArrayList<T> list){
        this.list = list;
        currentIndex = 0;
    }
    public void setIndexAt(int index){
        currentIndex = index;
    }

    public boolean hasNext(){
        return currentIndex < list.getSize();
    }
    public boolean hasPrevious(){
        return currentIndex > 0;
    }
    public T next(){
        currentIndex++;
        return (T) list.array[currentIndex];
    }
    public T previous(){
        currentIndex--;
        return (T) list.array[currentIndex];

    }

    public int getCurrentIndex(){
        return currentIndex;
    }
}
