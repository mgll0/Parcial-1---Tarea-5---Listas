package uaslp.objetos.list2.src.main.java.ArrayList;

import uaslp.objetos.list2.src.main.java.List;

public class ArrayList <T> implements List <T>{    //Es una lista en un arreglo
    private static final int INITIAL_SIZE = 2;
    public T []array;      //arreglo de strings
    private int size;   //cuantos datos se le han insertado al arreglo

    @SuppressWarnings("unchecked")
    public ArrayList(){
        size = 0;
        array = (T[])( new Object [INITIAL_SIZE]);
    }

    public void addAtTail(T data){
        if (size == array.length){
            increseSize();
        }

        array[size] = data;
        size++;
    }

    public void addAtFront(T data){
        if (size == array.length){
            increseSize();
        }
        int i = size;
        ArrayListIterator<T> it = getIterator();
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

    @SuppressWarnings("unchecked")
    public void removeAll(){
        array = (T[])(new Object[INITIAL_SIZE]);
        size = 0;
    }

    public void setAt(int index, T data){
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

    public T getAt(int index){
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

    @SuppressWarnings("unchecked")
    private void increseSize(){
        Object []newArray = (new Object[array.length * 2]);
        //System.arraycopy(array, 0, newArray, 0, array.length); forma eficiente de copiar arreglos
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = (T[]) newArray;
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

    public ArrayListIterator<T> getIterator() {
        return new ArrayListIterator<>(this);
    }
}
