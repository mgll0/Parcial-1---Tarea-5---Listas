package uaslp.objetos.list.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList lista = new ArrayList();
        lista.addAtTail("llamo");
        lista.printList();
        lista.addAtFront("Hola");
        lista.printList();

        lista.setAt(1, "me");
        lista.printList();
        lista.addAtTail("Miguel");
        lista.printList();
        lista.removeIndex(1);
        lista.printList();
        lista.removeAllWithValue("Miguel");
        lista.printList();
        lista.removeAll();
        lista.printList();
    }
}
