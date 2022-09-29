package JavaCollections;
import java.util.*;

public class ArrayListFloat {
    public static void main(String[] args) {
        ArrayList<Float> fList = new ArrayList<Float>();
        for(int i=0;i<5;i++){
            System.out.println("Enter floating point integer:");
            Scanner sc = new Scanner(System.in);
            float f = sc.nextFloat();
            fList.add(f);
        }
        float sum = 0;
        for(int i=0;i<5;i++){
            sum+=fList.get(i);
        }
        System.out.println("Sum of Floats:"+sum);
    }
    
}
