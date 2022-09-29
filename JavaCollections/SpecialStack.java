package JavaCollections;
import java.util.*;
public class SpecialStack {
    int[] stack = new int[10];
    int minValue;
    int top=0;
    public void push(int value){
        if(top == 0){
            minValue=value;
        }else if(value<minValue){
            minValue = value;
        }
        top++;
        stack[top]=value;
        System.out.println(stack[top]);
    }
    public void getMin(){
        System.out.println("Minimun value is:"+minValue);
    }
    public int pop(){
        if(top==0){
            System.out.println("Stack UnderFlow!!");
            return -1;
        }else{
            int x=stack[top];
            top--;
            return x;
        }
    }
    public void isEmpty(){
        if(top==0){
            System.out.println("Stack is Empty");
        }else{
            System.out.println("Not Empty");
        }
    }
    public void isFull(){
        if(top==stack.length){
            System.out.println("Stack is full");
        }else{
            System.out.println("Not full");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SpecialStack st = new SpecialStack();
        st.isEmpty();
        st.push(1);
        st.isEmpty();
        st.push(20);
        st.push(16);
        st.push(6);
        System.out.println(st.pop());
        st.getMin();
    }

}
    
