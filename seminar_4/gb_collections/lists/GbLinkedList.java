package seminar_4.gb_collections.lists;

import java.util.Iterator;

import seminar_4.gb_collections.GbList;
import seminar_4.gb_collections.lists.util.ArrayIterator;

public class GbLinkedList<E> implements GbList<E> {

    private int size;
    private Node<E> head;

    public GbLinkedList() {
        this.head = null;
        this.size = 0;
    }

    @SuppressWarnings ("unchecked")
    public E[] toArray(){
        int size = size();
        E[] result = null;
        try {
           result = (E[]) new Object[size]; 
        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
        }
        int i = 0;
        while (i < size){
            result[i] = get(i);
            i++;
        }

        return result;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<>(toArray());
    }

    @Override
    public void add(E value) {
        if (head == null) {
            this.head = new Node<E>(value);
        } 

         else  {
            Node<E> curr = head;
            Node<E> prev = null;
            while(curr.next != null){
                prev = curr;
                curr = prev.next;
                prev.next = curr;
                curr.prev = prev;
            }
            curr.next = new Node<>(value);
           
         }

        size++;
    }

    @Override
    public void add(E value, int index) {
        if (head == null) {
            head = new Node<E>(value);
        }
        Node<E> currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        Node<E> nextCurrentNode = new Node<E>();
        nextCurrentNode.value = currentNode.value;
        nextCurrentNode.next = currentNode.next;
        nextCurrentNode.prev = currentNode;
        currentNode.value = value;
        currentNode.next = nextCurrentNode;

        size++;
    }

    @Override
    public E get(int index) {
        int i = 0;
        Node<E> currentNode = head;
        while (i < index) {
            currentNode = currentNode.next;
            i++;
        }
        return currentNode.value;
    }

    @Override
    public void remove(E value) {
        Node<E> removeNode = head;
        int i = 0;
        while (i < size - 1) {
        // for (int i = 0; i < size - 1; i++) {
            removeNode = removeNode.next;
            if (removeNode.value == value) {
                removeNode.next.prev = removeNode.prev;
                removeNode.prev.next = removeNode.next;
            }
            i++; 
        }
        size--;
    }

    @Override
    public void remove(int index) {
        if (index == 0) head = head.next;


        Node<E> removeNode = head;


        for (int i = 0; i < index; i++) {
            removeNode = removeNode.next;
        }
        
        Node<E> nextRemoveNode = new Node<>();

        if (index == size - 1){
            nextRemoveNode.prev = removeNode;
            nextRemoveNode.next = null;
            removeNode.next = null;
            size--;
            return;
        }

        removeNode.prev.next = removeNode.next;
        removeNode.next.prev = removeNode.prev;

        size--;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        int i = 0;
        E[] values = toArray();
        while (i < size) {
            builder.append(values[i]).append(", ");
            i++;
        }
        if (builder.length() == 1)
            return "[]";
        builder.deleteCharAt(builder.length() - 1).deleteCharAt(builder.length() - 1);
        builder.append("]");
        return builder.toString();
    }

    private class Node<T> {
        T value;
        Node<T> next;
        Node<T> prev;

        public Node () {
            this.value = null;
            this.next = null;
            this.prev = null;
        }

        public Node (T value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value.toString();
        }
    }

}
