package lecture08;

import java.util.NoSuchElementException;

public class ArrayQueue<E> implements MyQueue<E>{

    private int front;
    private int rear;
    private int size;
    private int capacity;
    private static final int INITIAL_CAPACITY = 10;
    private E[] data;

    //Constructors

    public ArrayQueue(int capacity){
        this.capacity = capacity;
        data = (E[]) new Object[this.capacity];
        front =0;
        rear = capacity - 1; // 0
        size = 0;
    }
    public ArrayQueue(){
        this(INITIAL_CAPACITY);
    }

    @Override
    public boolean add(E e) {

        return false;
    }

    @Override
    public boolean offer(E e) {
        if (size == capacity){
            // reallocate();
        }
        size++;
        rear = (rear + 1) % capacity;
        data[rear] = e;
        return true;
    }

    @Override
    public E remove() {
        if (size == 0 )
            throw new NoSuchElementException();
        E hand = data[front];
        front = (front + 1) % capacity;
        size--;
        return hand;

    }

    @Override
    public E poll() {
        if (size == 0 )
            return null;
        E hand = data[front];
        front = (front + 1) % capacity;
        size--;
        return hand;

    }

    @Override
    public E element() {
        if (size == 0)
            throw new NoSuchElementException();
        return data[front];
    }

    @Override
    public E peek() {
        if (size == 0)
            return null;
        return data[front];
    }

    @Override
    public int getSize() {
        return size;
    }

    private void reallocate(){
        int newCapacity = capacity * 2;
        E[] newData = (E[]) new Object[newCapacity];
        int j = front;
        for(int i = 0; i < size ; i++){
            newData[i] = data[j];
            j = (j + 1) % capacity;
        }
        front = 0;
        rear = size-1;
        capacity = newCapacity;
        data = newData;
    }
}
