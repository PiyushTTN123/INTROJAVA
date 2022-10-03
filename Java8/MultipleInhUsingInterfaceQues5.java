//Question 5
package Java8;
public class MultipleInhUsingInterfaceQues5 implements Person,Emp {
    public static void main(String[] args) {
        Person p = () ->System.out.println("Show method's definition by lambda function");
        MultipleInhUsingInterfaceQues5 m = new MultipleInhUsingInterfaceQues5();
        p.Println();
        p.PrintDetails();
        m.Show();
        m.PrintDetails();
        m.Println();
    }
    @Override
    public void Println() {
        System.out.println("Println from Class");
        
    }
    @Override
    public void PrintDetails() {
        System.out.println("PrintDetails from class");
    }
}
@FunctionalInterface
interface Person{
    default void PrintDetails(){
        System.out.println("Interface default Method");
    }
    void Println();
}
interface Emp{
     default void Show(){
        System.out.println("Show from interface");
     }
}

