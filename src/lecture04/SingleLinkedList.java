package lecture04;

public class SingleLinkedList<E> {

    // Data members
    private Node<E> head = null;
    private int size = 0;

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
        Node<E> temp = new Node<>(item, head);
        head = temp;
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
