package LinkedList;

import Interfaces.Iterator;

public class LinkedListIterator<T> implements Iterator<T> {
    private Node<T> currentNode;
    private int currentIndex;
    LinkedListIterator(Node<T> head){
        currentNode = head;
        currentIndex = 0;
    }

    public boolean hasNext(){
        return currentNode != null;
    }


    public T next(){
        T data = currentNode.data;
        currentNode = currentNode.next;
        currentIndex++;
        return data;
    }
    public int getCurrentIndex(){
        return currentIndex;
    }

    public Node<T> getCurrentNode(){
        return currentNode;
    }
}