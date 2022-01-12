package lecture03;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        MyArrayListGeneral<String> nameList = new MyArrayListGeneral<>();


        MyArrayListGeneral<Employee> empList = new MyArrayListGeneral<>();

        Employee emp1 = new Employee(111, "Dean", 20000);
        Employee emp2 = new Employee(112,"Ryan", 100000);
        Employee emp3 = new Employee(113, "Eggie", 120000);

        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(new Employee(114,"Charles",110000));

        for (int i = 0; i < empList.size() ; i++) {
            System.out.println(empList.get(i).getName());
        }
//        for (Employee e:empList){
//            System.out.println(e.getName());
//        }











    }
}
