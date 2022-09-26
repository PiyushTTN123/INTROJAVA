import java.util.*;
import java.util.Scanner;
public class program3 {
    public static double Area(int radius){
        return Math.PI*radius*radius;
    }
    public static double Circumference(int radius){
        return Math.PI*radius*2;
    }
    public static void main(String []args) {
        int radius;
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle:");
        radius = sc.nextInt();
        System.out.println("Enter choice:");
        choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println(Area(radius));
                break;
            case 2:
                System.out.println(Circumference(radius));
                break;
            default:
                break;
        }
    }
}
