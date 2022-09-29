package JavaCollections;

public class Employee2 {
    Double age;
    Double salary;
    String name;
    public Employee2(Double age, Double salary,String name)
    {
        this.age=age;
        this.salary=salary;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "age=" + age +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
    
}
