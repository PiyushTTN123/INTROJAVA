import java.util.*;
public class program4 {
    
    public static void main(String[] args) {
        int [][] arr ={{1,2,3},{11,22,33},{10,20,30}};
        /*for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){

            }
        }
        */
        
        
        for(int row=0;row<3;row++){
            int sumOfRow=0;
            int sumOfCol=0;
            int n=1;
            for(int col=0;col<3;col++){
                sumOfRow+=arr[row][col];
                sumOfCol+=arr[col][row];
            }
            System.out.println("sum of row:"+sumOfRow);
            System.out.println("sum of col:" +sumOfCol);
        }
    }
    
}
