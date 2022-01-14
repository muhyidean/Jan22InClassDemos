package lecture04_05;

public class Demo {

    public static void main(String[] args) {

        SingleLinkedList<Integer> gradesn = new SingleLinkedList<>();

        gradesn.add(90);
        gradesn.add(88);
        gradesn.add(92);
        gradesn.add(78);

        System.out.println(gradesn.countGreaterThan(90));

        SingleLinkedList<String> grades = new SingleLinkedList<>();
        grades.add("A");
        grades.add("A-");
        grades.add("B");
        grades.add("B+");
        grades.add("A");
        grades.add("B+");
        System.out.print("ANSWER: " + grades.findHighGrades());
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
