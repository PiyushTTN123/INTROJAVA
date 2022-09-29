package JavaCollections;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Question4 {
    public static void main(String[] args) {
        Employee4 e1= new Employee4("Ram Gour",42,"Software Developer");
        Employee4 e2= new Employee4("Raj Sahu",27,"Associate Software Developer");
        Employee4 e3= new Employee4("Kamal Dubey",47,"Testing Engineer");
        Employee4 e4= new Employee4("Harsh Raj",28,"Quality Engineer");
        Employee4 e5= new Employee4("Ramesh Sharma",37,"Seniar Software Developer");

        Map<Employee4,Integer> mp= new HashMap<>();
        mp.put(e1,290000);
        mp.put(e2,610000);
        mp.put(e3,50000);
        mp.put(e4,580000);
        mp.put(e5,390000);

        for(Employee4 key:mp.keySet())
        {
            System.out.println(key+":"+mp.get(key));
        }
    }
}
