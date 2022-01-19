package lecture06;

import java.util.*;

public class Demo {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("Dean");
        set.add("Eggie");

        Iterator<String> iterator = set.iterator();
        System.out.println(iterator.next());


        List<Student> students = new ArrayList<>();

        students.add(new Student(111,"John",3.3));
        students.add(new Student(112,"Abeil",3.9)); //"Abeil",3.9
        students.add(new Student(113,"Jane",3.9));
        students.add(new Student(114,"John", 3.5));

        // [ 114, 113, 112, 111 ]
        Comparator studentCom = new StudComparator();
        Comparator studentComNameId = new StudComparatorNameId();

        Collections.sort(students,studentComNameId); //

        Iterator<Student> iter = students.iterator();

        while(iter.hasNext()){
            Student s = iter.next();
            System.out.println(s.getId() + " " + s.getName() + " " + s.getGPA());
        }

    }
}
