package lecture06;

import java.util.Comparator;

public class StudComparator implements Comparator<Student> {


    @Override
    public int compare(Student s1, Student s2) {
        Double gpa1 = s1.getGPA();
        Double gpa2 = s2.getGPA();

        String name1 = s1.getName();
        String name2 = s2.getName();

        if(gpa1 != gpa2)
            return gpa2.compareTo(gpa1);
        return name2.compareTo(name1);
    }
}
