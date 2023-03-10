package uaslp.objetos.list2.src.ArrayList;

import uaslp.objetos.list2.src.Iterator;
import uaslp.objetos.list2.src.List;
public class ArrayListIterator implements Iterator {
    private Object currentObject;
    private int currentIndex;
    private final ArrayList list;

    ArrayListIterator(ArrayList list){
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
    public Object next(){
        currentIndex++;
        return list.array[currentIndex];
    }
    public Object previous(){
        currentIndex--;
        return list.array[currentIndex];

    }

    public int getCurrentIndex(){
        return currentIndex;
    }
}
