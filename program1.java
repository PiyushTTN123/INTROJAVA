import java.lang.*;
import java.util.Scanner;
class program1{
    public static void printDetails(String FirstName,String LastName, int age){
        System.out.println(FirstName+" "+LastName+" "+" is "+age+" "+"old");
    }
    static String FirstName = "Piyush";
    static String LastName = "Gour";
    static int age = 23;
    public static void main(String []args){
        printDetails(FirstName,LastName,age);
        int arr[][]= new int[2][3];
    System.out.println(arr.length);
    System.out.println(arr[0].length);
}
}