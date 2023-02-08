package uaslp.objetos.list.LinkedList;

public class Main {
    public static void main(String []args){
        LinkedList linkedList = new LinkedList();

        linkedList.addAtFront("Hola ");
        linkedList.addAtTail("me llamo miguel");
        linkedList.removeIndex(1);
        int size = linkedList.getSize();
        System.out.println("El tamano es: " + size);

    }
}
