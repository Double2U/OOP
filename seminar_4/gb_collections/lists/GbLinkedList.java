package seminar_4.gb_collections.lists;

import java.util.Iterator;

import seminar_4.gb_collections.GbList;
import seminar_4.gb_collections.lists.util.*;

public class GbLinkedList<E> implements GbList<E> {

    private int size;
    private Node<E> firstNode;
    private Node<E> head;

    public GbLinkedList() {
        this.head = new Node<E>(null, null, firstNode);
        this.firstNode = new Node<E>(null, head, null);
        this.size = 0;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<>(null);
    }

    @Override
    public void add(E value) {
        Node<E> prev = head;
        prev.setValue(value);
        head = new Node<E>(null, null, prev);
        prev.setNext(head);
        size++;
    }

    @Override
    public void add(E value, int index) {
        Node<E> currentNode = firstNode.getNext();
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }
        Node<E> nextCurrentNode = new Node<E>(currentNode.getValue(), currentNode.getNext(), currentNode);
        currentNode.setValue(value);
        currentNode.setNext(nextCurrentNode);
        size++;
    }

    @Override
    public E get(int index) {
        Node<E> currentNode = firstNode.getNext();
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }
        return currentNode.getValue();

    }

    @Override
    public void remove(E value) {
        Node<E> removeNode = firstNode.getNext();
        for (int i = 0; i < size; i++) {
            removeNode = removeNode.getNext();
            if (removeNode.getValue() == value) {
                removeNode.getNext().setPrev(removeNode.getPrev());
                removeNode.getPrev().setNext(removeNode.getNext());
            }
        }
        size--;
    }

    @Override
    public void remove(int index) {
        Node<E> removeNode = firstNode.getNext();
        for (int i = 0; i < index; i++) {
            removeNode = removeNode.getNext();
        }
        removeNode.getNext().setPrev(removeNode.getPrev());
        removeNode.getPrev().setNext(removeNode.getNext());
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
        Node<E> target = firstNode.getNext();
        while (i != size) {
            builder.append(target.getValue()).append(", ");
            target = target.getNext();
            i++;
        }
        if (builder.length() == 1)
            return "[]";
        builder.deleteCharAt(builder.length() - 1).deleteCharAt(builder.length() - 1);
        builder.append("]");
        return builder.toString();
    }

}
