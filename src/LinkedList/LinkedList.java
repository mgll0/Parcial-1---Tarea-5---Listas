package uaslp.objetos.list2.src.LinkedList;
import uaslp.objetos.list2.src.List;
import uaslp.objetos.list2.src.Iterator;

public class LinkedList implements List {       //Lista con nodos
    private Node head;
    private Node tail;
    private int size;

    //Encapsulacion -> Capacidad que tienen las clases para hacer visible u ocultar los atributos
    //y los metodos para dar niveles de visibilidad

    public void addAtTail(Object newData){
        Node node = new Node();
        node.data = newData;
        node.previous = tail;
        tail.next = node;
        tail = node;

        if (head == null){
            head = node;
        }

        size++;
        System.out.println("Se añadio un nodo al final");
    }
    public void addAtFront(Object newData){
        Node node = new Node();
        node.data = newData;

        if (head == null){
            tail = node;
        } else {
            node.next = head;
            head.previous = node;
        }
        head = node;
        size++;
        System.out.println("Se añadio un nodo al inicio");
    }

    public void remove(int index){
        System.out.println("Se elimino el nodo en el indice: "+ index + " de " + (size-1));
        if (index < 0 || index >= size-1){        //No esta dentro de los limtites
            return;
        }
        LinkedListIterator it = (LinkedListIterator) getIterator();

        while (it.hasNext() && it.getCurrentIndex() != index){
            it.next();
        }
        Node nodeToErase = it.getCurrentNode();
        deleteNode(nodeToErase);
    }

    public void removeAll(){
        head = tail = null;
        size = 0;
        System.out.println("La lista fue eliminada");
    }

    public void setAt(int index, Object data){
        System.out.println("Se inserta en la pos " + index + " de " + size);
        if (index < 0 || index > size){        //No esta dentro de los limtites
            return;
        }
        if (index == 0){                        //Eliminar el primero
            addAtFront(data);
        } else
        if (index == size){                   //Eliminar el ultimo
            addAtTail(data);
        }

        LinkedListIterator it = (LinkedListIterator) getIterator();
        while (it.hasNext() && it.getCurrentIndex() != index){
            it.next();
        }
        Node itNode = it.getCurrentNode();

        Node node = new Node();
        node.data = data;

        node.next = itNode;
        node.previous = itNode.previous;
        itNode.previous = node;

    }
    private void deleteNode(Node nodeToErase){
        if (nodeToErase.previous == null && nodeToErase.next == null){
            removeAll();
        } else
        if (nodeToErase.next == null){
            tail = nodeToErase.previous;
            nodeToErase.next = null;
        } else
        if (nodeToErase.previous == null){
            head = nodeToErase.next;
            head.previous = null;
        } else {

            nodeToErase.next.previous = nodeToErase.previous;
            nodeToErase.previous.next = nodeToErase.next;
        }
        size--;
    }

    public Object getAt(int index){
        if (index < 0 || index >= size){
            return null;
        }
        LinkedListIterator it = (LinkedListIterator) getIterator();

        while (it.hasNext() && it.getCurrentIndex() != index){
            it.next();
        }

        return it.getCurrentNode().data;
    }

    public void removeAllWithValue(Object data){
        System.out.println("Eliminando todos con: " + data);

        LinkedListIterator it = (LinkedListIterator) getIterator();
        while (it.hasNext()){
            if (it.getCurrentNode().data == data){
                deleteNode(it.getCurrentNode());
                if (!it.hasNext()){
                    break;
                }
            }
            it.next();
        }

    }

    public int getSize(){
        return size;
    }

    public Iterator getIterator(){
        return new LinkedListIterator(head);
    }

    public boolean isEmpty(){
        return size == 0;
    }

}
