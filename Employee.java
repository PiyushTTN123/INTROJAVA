public class Employee {
    String FirstName;
    String LastName;
    String Designation;
    int Age;
    public Employee(){
    }
    public Employee(String FirstName,String LastName,String Designation,int Age){
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.Designation=Designation;
        this.Age=Age;
    }
    public void setFirstName(String FirstName){
        this.FirstName=FirstName;
    }
    public void setLastName(String LastName){
        this.LastName=LastName;
    }
    public void setAge(int Age){
        this.Age=Age;
    }
    public void setDesignation(String Designation){
        this.Designation=Designation;
    }
    public String toString(){
        return FirstName+" "+LastName+" "+"is "+Age+" "+"old and designation is "+Designation;
    }
    public static void main(String[] args) {
        Employee emp=new Employee("Piyush","Gour","Software Engineer",23);
        System.out.println(emp.toString());
    }
    
}
