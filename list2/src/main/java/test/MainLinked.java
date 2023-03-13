package uaslp.objetos.list2.src.main.java.test;
import uaslp.objetos.list2.src.main.java.LinkedList.LinkedList;
import uaslp.objetos.list2.src.main.java.List;
import uaslp.objetos.list2.src.main.java.Iterator;

public class MainLinked {
    public static void main(String []args){
        LinkedList list = new LinkedList();
        list.addAtFront("Holaa");
        list.addAtTail("mar");
        list.setAt(2,68);
        printLists(list);

        System.out.println("En la pos 1 esta: " + list.getAt(1));

        list.remove(1);
        printLists(list);
        list.removeAllWithValue("Holaa");
        printLists(list);

        list.addAtTail(1234);
        printLists(list);

        list.removeAll();
        printLists(list);
    }

    public static void printLists(List list){
        Iterator it = list.getIterator();
        int size = list.getSize();
        System.out.println("El tamano es: " + size);
        System.out.print("head>");
        while (it.hasNext()){
            System.out.print(" - " + it.next());
        }
        System.out.println(" - <tail\n");
    }
}
