package uaslp.objetos.list2.src.ArrayList;

import uaslp.objetos.list2.src.List;

public class ArrayList implements List{    //Es una lista en un arreglo
    private static final int INITIAL_SIZE = 2;
    public Object []array;      //arreglo de strings
    private int size;   //cuantos datos se le han insertado al arreglo


    public ArrayList(){
        array = new Object[INITIAL_SIZE];
        size = 0;
    }

    public void addAtTail(Object data){
        if (size == array.length){
            increseSize();
        }

        array[size] = data;
        size++;
    }

    public void addAtFront(Object data){
        if (size == array.length){
            increseSize();
        }
        int i = size;
        ArrayListIterator it = (ArrayListIterator) getIterator();
        it.setIndexAt(size);
        while (it.hasPrevious()){
            array[i] = it.previous();
            i--;
        }
        size++;
        array[i] = data;
    }

    public void remove(int index){
        if (index < 0 || index >= size){        //No esta dentro de los limtites
            return;
        }
        for (int i = index; i < size; i++){
            if (i < size-1){
                array[i] = array[i+1];
            }
        }
        size--;
    }

    public void removeAll(){
        array = new Object[INITIAL_SIZE];
        size = 0;
    }

    public void setAt(int index, Object data){
        if (index > size){
            return;
        }
        if (size == array.length){
            increseSize();
        }
        int i = size+1;
        for (; i > index; i--){
            array[i] = array[i-1];
        }
        array[i] = data;
        size++;
    }

    public Object getAt(int index){
        if (index < 0 || index >= size){        //No esta dentro de los limtites
            return null;
        }
        return array[index];
    }

    public void removeAllWithValue(Object data){
        for (int i = 0; i < size; i++){
            if (array[i].equals(data)){
                remove(i);
            }
        }
    }
    public int getSize(){
        return size;
    }

    private void increseSize(){
        Object []newArray = new Object[array.length * 2];
        //System.arraycopy(array, 0, newArray, 0, array.length); forma eficiente de copiar arreglos
        for (int i = 0; i < array.length; i++){
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public void printList(){
        for (int i = 0; i < size; i++){
            System.out.print(array[i] + " - ");
        }
        System.out.println("---- size: " + size);
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public ArrayListIterator getIterator() {
        return new ArrayListIterator(this);
    }
}
