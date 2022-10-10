package Multithreading;
import java.util.*;

class Thread11 extends Thread
{
    Table t;
    Thread11(Table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.printTable(3);
    }
}

class Thread22 extends Thread
{
    Table t;
    Thread22(Table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.printTable(4);
    }
}
 
class Table
{
    void printTable(int n)
    {
        synchronized(this)  //synchronized block
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println(n*i);
                try
                {
                    Thread.sleep(30);
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
        }
    }
}
public class MultiThreadingQues3_2 {
    public static void main(String[] args) {
        Table ob1 = new Table();
        Thread11 t1= new Thread11(ob1);
        Thread t2= new Thread22(ob1);
        t1.start();
        t2.start();
    }
    
}
