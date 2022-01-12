package lecture03;

import java.util.Arrays;

public class MyArrayList {

    // Data Members
    private static final int INITIAL_CAPACITY = 10;
    private String [] arr;
    private int size = 0;
    private int capacity;

    // Methods
    public MyArrayList(){
        capacity = INITIAL_CAPACITY;
        arr = new String[capacity];
    }

    public void add(String item){
        // What is the size exceeds the capacity?
        if(size == capacity){
            reallocate();
        }
        arr[size] = item;
        size++;
    }

    public void add(int index, String item){
        // check for bounds
        if(index <0 || index > size)
            throw new ArrayIndexOutOfBoundsException();

        // What is the size exceeds the capacity?
        if(size == capacity){
            reallocate();
        }

        // shifting the data to the end
        for (int i = size; i > index ; i--) {
            arr[i] = arr[i-1];
        }

        // insert the data
        arr[index] = item;
        size++;
    }

    public String get(int index){
        if(index <0 || index >= size)
            throw new ArrayIndexOutOfBoundsException();

        return arr[index];
    }


    public String set(int index, String newItem){
        if(index <0 || index >= size)
            throw new ArrayIndexOutOfBoundsException();

        String hand = arr[index]; // current value
        arr[index] = newItem;
        return hand;
    }

    public String remove(int index){
        // check the bounds
        if(index <0 || index >= size)
            throw new ArrayIndexOutOfBoundsException();

        // hold the data to be removed
        String hand = arr[index];

        // shift the data to the beginning
        for (int i = index + 1; i < size ; i++) {
            arr[i-1] = arr[i];
        }

        // decrease size by 1
        size--;

        return hand;
    }

    public int size(){
        return size;
    }


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