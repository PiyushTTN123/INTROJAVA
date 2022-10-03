//Question 4
package Java8;
import java.util.*;

public class EmployeeQues4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream().filter(value -> value % 2 == 0).forEach(System.out::println);
    }
    
}
