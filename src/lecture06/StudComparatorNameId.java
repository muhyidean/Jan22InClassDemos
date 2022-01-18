package lecture06;

import java.util.Comparator;

public class StudComparatorNameId implements Comparator<Student> {


    @Override
    public int compare(Student s1, Student s2) {
        int id1 = s1.getId();
        int id2 = s2.getId();

        String name1 = s1.getName();
        String name2 = s2.getName();

        if(name1.compareTo(name2) != 0)
            return name1.compareTo(name2);

        if(id1 < id2)
            return -1;
        else if( id1 > id2)
            return 1;
        else
            return 0;
    }
}
