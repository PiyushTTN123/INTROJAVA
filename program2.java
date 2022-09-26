import java.lang.*;
import java.util.Scanner;
public class program2 {
    public static void main(String []args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String input;
        do{
            System.out.println("Enter a text:");
            input = sc.nextLine();
            sb.append(input);
        }while(!input.equals("XDONE"));
        System.out.println(sb);
    }
}
