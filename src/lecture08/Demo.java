package lecture08;

import java.util.*;

public class Demo {

    public static void main(String[] args) {

        Queue<String> q = new LinkedList<>();
        Deque<String> s = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(5);
        pq.add(10);
        pq.add(7);
        pq.add(8);
        pq.add(11);
        pq.add(3);

        System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());














        Queue<String> names = new ArrayDeque<>();
//        MyQueue<String> names = new LinkedListQ<>();


        names.offer("Dean");
        names.offer("Eggie");
        names.offer("Charles");

        System.out.println(names.peek()); // [Dean , Eggie , Charles]
        System.out.println("Removed: " + names.poll()); // [Eggie , Charles]
        System.out.println("Removed: " + names.poll()); // [Charles]
        System.out.println(names.peek()); // [Charles]
        names.offer("Dean"); // [Charles, Dean]
        names.offer("Eggie"); // [Charles, Dean, Eggie]
        System.out.println("Removed: " + names.poll()); // Dean, Eggie]
        System.out.println(names.peek()); // [Dean, Eggie]



    }
}
