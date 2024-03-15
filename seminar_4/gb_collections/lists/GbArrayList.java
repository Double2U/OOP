package seminar_4.gb_collections.lists;

import java.util.Iterator;

import seminar_4.gb_collections.GbList;
import seminar_4.gb_collections.lists.util.ArrayIterator;

public class GbArrayList<E> implements GbList<E> {

    private E[] values;
    private int size;
    private int capacity;

    @SuppressWarnings("unchecked")
    public GbArrayList() {
        this.size = 0;
        this.capacity = 10;
        try {
            this.values = (E[]) new Object[capacity];
        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private void addCapacity() {
        capacity = capacity + capacity / 2;;
        try{
            E[] arr = (E[]) new Object[capacity];
            System.arraycopy(values, 0, arr , 0, values.length);
            this.values = arr; 
        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<>(values);
    }

    @Override
    public void add(E value) {
        if (capacity == size) {
            addCapacity();
        }
        values[size++] = value;
    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public void remove(E value) {
        for(int i = 0; i < values.length; i++) {
            if (values[i].equals(value)){
                remove(i);
                return;
            }
        }
        throw new RuntimeException("Element was not found");

    }

    @SuppressWarnings("unchecked")
    @Override
    public void remove(int index) {
        try {
            E[] arr = values;
            values = (E[]) new Object[arr.length - 1];
            System.arraycopy(arr, 0, values, 0, index);
            int amountElementsAfterIndex = values.length - index - 1;
            System.arraycopy(arr, index + 1, values, index, amountElementsAfterIndex);
            size--;    
        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public int size() {
        return size;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void add(E value, int index) {
        if (capacity == size){
            addCapacity();
        } 
        try {
            E[] arr = values;
            values = (E[]) new Object[capacity];
            System.arraycopy(arr, 0, values, 0, index);
            values[index] = value;
            int amountElementsAfterIndex = arr.length - index - 1;
            System.arraycopy(arr, index, values, index + 1, amountElementsAfterIndex);
        } catch (ClassCastException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        int i = 0;
        while(values[i] != null){
            builder.append(values[i]).append(", ");
            i++;
        }
        if (builder.length() == 1)
            return "[]";
        builder.deleteCharAt(builder.length() - 1).deleteCharAt(builder.length() - 1);
        builder.append("]");
        return builder.toString();    
    }
}
