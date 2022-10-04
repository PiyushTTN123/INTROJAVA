package Java_9_17;
import java.util.*;
interface PrivateMethod{
    private String reverseString(String string){
        StringBuffer sb = new StringBuffer(string);
        return sb.reverse().toString();
    }
    static String toUpperCase(String s){
        return s.toUpperCase();
    }

    static String toLowerCase(String s){
        return s.toLowerCase();
    }
}
public class Example1 {
    public static void main(String[] args) {
        System.out.println(PrivateMethod.toLowerCase("My name is Piyush Kumar Gour"));
        System.out.println(PrivateMethod.toLowerCase("Hello All"));
    }
    
}
