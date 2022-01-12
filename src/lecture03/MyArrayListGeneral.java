package lecture03;

import java.util.Arrays;

public class MyArrayListGeneral<E> {

    // Data Members
    private static final int INITIAL_CAPACITY = 10;
    private E [] arr;
    private int size = 0;
    private int capacity;

    // Methods
    public MyArrayListGeneral(){
        capacity = INITIAL_CAPACITY;
        arr = (E[]) new Object[capacity]; //
    }

    // O(1)
    public void add(E item){
        // What is the size exceeds the capacity?
        if(size == capacity){
            reallocate(); // O(n)
        }
        arr[size] = item;
        size++;
    }

    // O(n)
    public void add(int index, E item){
        // check for bounds
        if(index <0 || index > size)
            throw new ArrayIndexOutOfBoundsException();

        // What is the size exceeds the capacity?
        if(size == capacity){
            reallocate(); // O(n)
        }

        // shifting the data to the end
        for (int i = size; i > index ; i--) {
            arr[i] = arr[i-1];
        }

        // insert the data
        arr[index] = item;
        size++;
    }

    // O(1)
    public E get(int index){
        if(index <0 || index >= size)
            throw new ArrayIndexOutOfBoundsException();

        return arr[index];
    }


    // O(1)
    public E set(int index, E newItem){
        if(index <0 || index >= size)
            throw new ArrayIndexOutOfBoundsException();

        E hand = arr[index]; // current value
        arr[index] = newItem;
        return hand;
    }

    // O(n)
    public E remove(int index){
        // check the bounds
        if(index <0 || index >= size)
            throw new ArrayIndexOutOfBoundsException();

        // hold the data to be removed
        E hand = arr[index];

        // shift the data to the beginning
        for (int i = index + 1; i < size ; i++) {
            arr[i-1] = arr[i];
        }

        // decrease size by 1
        size--;

        return hand;
    }

    // O(1)
    public int size(){
        return size;
    }


    // O(n)
    private void reallocate(){
        capacity = capacity * 2;
        arr = Arrays.copyOf(arr,capacity);
    }


    public String toString(){
        StringBuilder sb = new StringBuilder("[");
        for(int i = 0; i < size-1; ++i){
            sb.append(arr[i]+", ");
        }
        sb.append(arr[size-1]+"]");
        return sb.toString();
    }




    }