package lecture04_05;

import lecture07.StackInterface;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class SingleLinkedList<E> implements StackInterface<E>, MyList<E>{

    // Data members
    private Node<E> head = null;
    private int size = 0;


    @Override
    public E push(E obj) {
        addFirst(obj);
        return head.data;
    }

    @Override
    public E peek() {
        if(empty())
            throw new EmptyStackException();
        return head.data;
    }

    @Override
    public E pop() {
        if(empty())
            throw new EmptyStackException();

        E hand = head.data;
        removeFirst();
        return hand;
    }

    @Override
    public boolean empty() {
        return head == null;
    }

    @Override
    public int getSize() {
        return size();
    }


    class MyIterator<E> implements Iterator<E>{
        public MyIterator() {}
        public Node<E> current = (Node<E>) head;


        @Override
        public boolean hasNext() {
            return (current != null);
        }
        @Override
        public E next() {
            E item = current.data;
            current = current.next;
            return item;
        }

        @Override
        public void remove(){
            E item = current.data;
            removeI(item);
        }


    }

    @Override
    public Iterator<E> iterator() {
        return new MyIterator<E>();
    }


    private static class Node<E>{

        // Data fields
        private E data;
        private Node<E> next;


        private Node (E item) {
            this.data = item;
            this.next = null;
        }
        private Node (E item, Node<E> nodeRef) {
            this.data = item;
            this.next = nodeRef;
        }
    }


    // Helper methods
    private void addFirst(E item){
        Node<E> newNode = new Node<>(item);
        Node<E> temp = head;
        head = newNode;
        newNode.next = temp;
        size++;
    }

    private void addAfter(E item, Node<E> node){
        Node<E> temp = new Node<>(item, node.next);
        node.next = temp;
        size++;
    }

    private E removeAfter(Node<E> node){ // Tom
        Node<E> toRemove = node.next;  // toRemove --> Dean

        if(toRemove != null){
            node.next = toRemove.next;
            size--;
            return toRemove.data;
        }
        else
            return null;
    }

    private E removeFirst(){
        Node<E> toRemove = head;

        if(head != null){
            head = head.next;
            size--;
            return toRemove.data;
        }
        else
            return null;
    }

    private Node<E> getNode(int index){
        Node<E> node = head;
        for (int i = 0; i < index && node != null; i++) {
            node = node.next;
        }
        return node;
    }


    // Public methods
    public void add(int index, E item){
        if(index < 0 || index > size)
            throw new ArrayIndexOutOfBoundsException();

        if(index ==0){
            addFirst(item);
        }
        else{
            Node<E> node = getNode(index - 1);
            addAfter(item, node);
        }

    }
    public void add(E item){
        add(size,item);
    }

    public E get(int index){
        if(index < 0 || index > size)
            throw new ArrayIndexOutOfBoundsException();

        Node<E> node = getNode(index);
        return node.data;
    }

    public int size(){
        return size;
    }

    public E set (int index, E replaceValue){
        if(index < 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException();

        Node<E> node = getNode(index);
        E hand = node.data;
        node.data = replaceValue;
        return hand;
    }

    public E remove(int index){ // 5
        if(index < 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException();

        if(index == 0)
            return removeFirst();
        else{
            Node<E> node = getNode(index - 1);
            return removeAfter(node);
        }
    }


    public boolean removeI(Object i){
        E item = (E) i;
        if(head ==null){
            return false;
        }

        Node<E> current = head;
        if(item.equals(current.data)){
            removeFirst();
            return true;
        }
        while(current.next != null){
            if(item.equals(current.next.data)){
                removeAfter(current);
                return true;
            }
            current = current.next;

        }
        return false;
    }

    public void traverse(){
        Node<E> current = head;

        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void replaceAll( E item, E itemReplaceWith){ // Dean , Muhyieddin
        Node<E> current = head;

        while(current != null){
            if(current.data.equals(item)){
                current.data = itemReplaceWith;
            }
            current = current.next;
        }
    }

    public void traverseTemplate(){
        Node<E> current = head;

        while(current != null){
            // TODO add functionality
            current = current.next;
        }
    }

    public int countGreaterThan(E item){
        int count = 0;
        Node<E> current = head;
        while(current != null){
            if( (int) current.data >= (int) item)
                count++;
            current = current.next;
        }

        return count;
    }

    public int findHighGrades(){
        int count = 0;
        Node<E> current = head;
        while(current != null){
            if( current.data.equals("A-") || current.data.equals("A") || current.data.equals("A+") )
                count++;
            current = current.next;
        }
        return count;
    }


    public void printReverse(){
        StackInterface<E> s = new SingleLinkedList<>();

//        Node<E> current = head;
//        while(current != null){
//            s.push(current.data);
//            current = current.next;
//        }
        Iterator<E> iter = this.iterator();
        while(iter.hasNext()){
            s.push(iter.next());
        }

        for (int i = 0; i < size; i++) {
            System.out.println(s.pop());
        }
    }



    public String toString() {
        Node<E> current = head;
        StringBuilder result = new StringBuilder();
        while (current != null) {
            result.append(current.data);
            if (current.next != null) {
                result.append(" ==> ");
            }
            current = current.next;
        }
        return result.toString();
    }








}
