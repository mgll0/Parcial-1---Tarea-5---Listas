package uaslp.objetos.list2.src.LinkedList;

import uaslp.objetos.list2.src.Iterator;
import uaslp.objetos.list2.src.LinkedList.Node;
import uaslp.objetos.list2.src.List;

public class LinkedListIterator implements Iterator{
    private Node currentNode;
    private int currentIndex;
    LinkedListIterator(Node head){
        currentNode = head;
        currentIndex = 0;
    }

    //public K getIterator() {
        //return this;
    //}

    public boolean hasNext(){
        return currentNode != null;
    }


    public Object next(){
        Object data = currentNode.data;
        currentNode = currentNode.next;
        currentIndex++;
        return data;
    }
    public int getCurrentIndex(){
        return currentIndex;
    }

    public Node getCurrentNode(){
        return currentNode;
    }
}

