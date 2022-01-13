package lecture04;

public class NodeSample {


    private static class Node<E> {

        private E data;
        private Node<E> next = null;

        public Node(E data, Node<E> next){
            this.data = data;
            this.next = next;
        }
        public Node(E data){
            this.data = data;
            this.next = null;
        }

        public static void main(String[] args) {


            Node<String> a = new Node<>("A");
            Node<String> b = new Node<>("B");
            Node<String> c = new Node<>("C");
            Node<String> d = new Node<>("D");


    Node<String> head = a;
            a.next = b;
            b.next = c;
            c.next = d;




            System.out.println(head.next.next.next.data);


        }
    }



}
