package uaslp.objetos.list.LinkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    //Encapsulacion -> Capacidad que tienen las clases para hacer visible u ocultar los atributos
    //y los metodos para dar niveles de visibilidad

    public void addAtTail(String newData){
        Node node = new Node();
        node.data = newData;
        node.previous = tail;

        if (head == null){
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        size++;
        System.out.println("Se añadio un nodo al final");
    }
    public void addAtFront(String newData){
        Node node = new Node();
        node.data = newData;

        if (head == null){
            tail = node;
        } else {
            node.next = head;
            head.previous = node;
            head = node;
        }
        size++;
        System.out.println("Se añadio un nodo al inicio");
    }

    public void removeIndex(int index){
        System.out.println("Se elimino el nodo en el indice: "+ index);
        if (index < 0 || index >= size){        //No esta dentro de los limtites
            return;
        } else
        if (index == 0 && head == tail){        //Eliminar unico elemento del la lista
            head = tail = null;
        } else
        if (index == 0){                        //Eliminar el primero
            head = head.next;
            head.previous = null;
        } else
        if (index == size-1){                   //Eliminar el ultimo
            tail = tail.previous;
            tail.next = null;
        } else {

            Node currentNode = head;                //Eliminar entre head y tail
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }

            currentNode.previous.next = currentNode.next;
            currentNode.next.previous = currentNode.previous;
            currentNode.next = currentNode.previous = currentNode = null;   //se puede hacer esto?
        }
        size--;
    }

    public void removeAll(){
        head = tail = null;
        size = 0;
        System.out.println("La lista fue eliminada");
    }

    public void setAt(int index, String data){
        if (index < 0 || index >= size){        //No esta dentro de los limtites
            return;
        }
        if (index == 0){                        //Eliminar el primero
            addAtFront(data);
        } else
        if (index == size-1){                   //Eliminar el ultimo
            addAtTail(data);
        }
    }

    public String getAt(int index){
        if (index < 0 || index >= size){
            return null;
        }
        Node currentNode = head;
        for (int currentIndex = 0; currentIndex < index; currentIndex++){
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }

    public void removeAllWithValue(String data){
        System.out.println("Eliminando todos con: " + data);
        Node currentNode = head;
        for (int i = 0; i < size-1; i++){
            if (currentNode.data == data){
                Node temp = currentNode;
                currentNode = currentNode.next;
                temp.previous.next = currentNode;
                currentNode.previous = temp.previous;
                size--;
            } else {
                currentNode = currentNode.next;
            }
        }
    }

    public int getSize(){
        return size;
    }

    public LinkedListIterator getIterator(){
        return new LinkedListIterator(head);
    }

}
