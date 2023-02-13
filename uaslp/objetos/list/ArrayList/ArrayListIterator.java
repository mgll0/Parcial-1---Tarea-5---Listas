package uaslp.objetos.list.ArrayList;
//No tengo idea alguna de como realizar el next
/*
******************************************************
******************************************************
 */
public class ArrayListIterator {
    private String currentString;
    public boolean hasNext(){
        return currentString != null;
    }
    public String next(){
        String data = currentString;
        return data;
    }

}
