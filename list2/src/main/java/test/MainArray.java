package uaslp.objetos.list2.src.main.java.test;

import uaslp.objetos.list2.src.main.java.ArrayList.ArrayList;

public class MainArray {
    public static void main(String []args){
        ArrayList list = new ArrayList<>();

        list.addAtTail(123);
        list.printList();
        list.addAtFront("Holas");
        list.printList();
        list.setAt(0,"JAja");
        list.printList();
        System.out.println("En la posicion 1 esta: "+ list.getAt(1));
        list.remove(1);
        list.printList();
        list.removeAll();
        list.printList();

    }
}