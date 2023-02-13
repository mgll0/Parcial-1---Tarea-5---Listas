package uaslp.objetos.list.ArrayList;

public class ArrayList {
    private static final int INITIAL_SIZE = 2;
    public String []array;      //arreglo de strings
    private int size;   //cuantos datos se le han insertado al arreglo

    public ArrayList(){
        array = new String[INITIAL_SIZE];
    }

    public void addAtTail(String data){
        if (size == array.length){
            increseSize();
        }

        array[size] = data;
        size++;
    }

    public void addAtFront(String data){    //no muy eficiente imo
        int newArrayTam = array.length;
        if (size == array.length){
           newArrayTam *= 2;
        }
        String []newArray = new String[newArrayTam];

        newArray[0] = data;
        for (int i = 0; i < size; i++){
            newArray[i+1] = array[i];
        }
        array = newArray;
        size++;
    }

    public void removeIndex(int index){
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
        array = new String[INITIAL_SIZE];
        size = 0;
    }

    public void setAt(int index, String data){
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

    public String getAt(int index){
        if (index < 0 || index >= size){        //No esta dentro de los limtites
            return "Esa posicion no esta dentro del arreglo";
        }
        return array[index];
    }

    public void removeAllWithValue(String data){
        for (int i = 0; i < size; i++){
            if (array[i].equals(data)){
                removeIndex(i);
            }
        }
    }
    public int getSize(){
        return size;
    }

    private void increseSize(){
        String []newArray = new String[array.length * 2];
        //System.arraycopy(array, 0, newArray, 0, array.length); forma eficiente de copiar arreglos
        for (int i = 0; i < array.length; i++){
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public void printList(){
        for (int i = 0; i < size; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("---- size: " + size);
    }
}
