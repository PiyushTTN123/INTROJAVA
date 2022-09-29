package JavaCollections;
import java.util.Objects;

public class Employee4 {
    String name;
    int age;
    String designation;

    public Employee4(String name, int age, String designation)
    {
        this.name= name;
        this.age= age;
        this.designation= designation;
    }

    @Override
    public String toString() {
        return "Employee4{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", designation='" + designation + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee4 employee = (Employee4) o;
        return age == employee.age && Objects.equals(name, employee.name) && Objects.equals(designation, employee.designation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, designation);
    }
    
}
