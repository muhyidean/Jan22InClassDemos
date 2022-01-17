package lecture04_05;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
        list.add("Dean");
        list.add("Eggie");
        list.add("Charles");


        Iterator<String> iter = list.iterator();

        while(iter.hasNext()){
            String item = iter.next().toLowerCase();
            System.out.println(item);
        }

        System.out.println(list);




//        SingleLinkedList<Integer> gradesn = new SingleLinkedList<>();
//
//        gradesn.add(90);
//        gradesn.add(88);
//        gradesn.add(92);
//        gradesn.add(78);
//
//        for (int i:gradesn){
//            i = 5;
//            System.out.println(i);
//        }
//
//        System.out.println(gradesn);


        SingleLinkedList<String> grades = new SingleLinkedList<>();
        grades.add("A");
        grades.add("A-");
        grades.add("B");
        grades.add("B+");
        grades.add("A");
        grades.add("B+");

//        Iterator<String> iter = grades.iterator();
//
//        while(iter.hasNext()){
//            System.out.println(iter.next());
//        }
//        for (String s:grades){
//            System.out.println(s);
//        }

//        for (String s: grades){
//            System.out.println(s.toLowerCase());
//        }

//        System.out.println(grades);
//        System.out.print("ANSWER: " + grades.findHighGrades());
// Expected result --> 3

//        Integer [] ints = new Integer[5];
//
//        System.out.println(ints[0]);
//
//        SingleLinkedList<String> list = new SingleLinkedList<>();
//
//        list.add("Dean");
//        list.add("Eggie");
//        list.add(1,"Charles");
//        list.set(1,"Charlie");
//        list.add("Dean");
//        System.out.println(list);
////        System.out.println("Removed: " + list.remove(2));
//        System.out.println(list);
//
//        list.replaceAll("Dean", "Muhyieddin");
//        System.out.println(list);


    }
}
