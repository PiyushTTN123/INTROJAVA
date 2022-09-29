package JavaCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        List<Employee2> list= new ArrayList<>();
        list.add(new Employee2(41.0,832000.00,"Piyush Gour"));
        list.add(new Employee2(25.0,175000.00,"Ram Roy"));
        list.add(new Employee2(63.0,645500.00,"Jay Kumar"));
        list.add(new Employee2(89.0,285000.00,"Hari Mishra"));
        list.add(new Employee2(45.0,525000.00,"Shyam Raj"));

        Collections.sort(list,
                new Comparator<Employee2>() {
                    @Override
                    public int compare(Employee2 employee, Employee2 t1) {
                        return employee.name.compareTo(t1.name);
                    }
                });
        System.out.println("Sorting on the basis of first name and last name:");
        System.out.println(list);// on the basis of first and last name

        Collections.sort(list, new Comparator<Employee2>() {
            @Override
            public int compare(Employee2 employee, Employee2 t1) {
                return employee.salary.compareTo(t1.salary);
            }
        });

        System.out.println("Sorting on the basis of salary:");
        System.out.println(list);

    }  
}
