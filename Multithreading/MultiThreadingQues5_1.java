package Multithreading;

//deadlock case
import java.util.concurrent.*;
import java.util.*;
class Thread15 extends Thread
{
    /* (non-Javadoc)
     * @see java.lang.Thread#run()
     */
    public void run()
    {
        synchronized(MultiThreadingQues5_1.resource1)
        {
            System.out.println("Desktop "+" locked:"+MultiThreadingQues5_1.resource1);
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {

            }
        }

        System.out.println("Desktop "+"waiting for "+MultiThreadingQues5_1.resource2+"...............");
        synchronized(MultiThreadingQues5_1.resource2)
        {
            System.out.println("Desktop "+"Locked"+MultiThreadingQues5_1.resource2);
        }
    }
}

class Thread25 extends Thread
{
    public void run()
    {
        synchronized(MultiThreadingQues5_1.resource2)
        {
            System.out.println("Desktop "+" locked:"+MultiThreadingQues5_1.resource2);
            try
            {
                Thread.sleep(100);
            }
            catch(Exception e)
            {

            }
        }

        System.out.println("Desktop "+"waiting for "+MultiThreadingQues5_1.resource1+"...............");
        synchronized(MultiThreadingQues5_1.resource1)
        {
            System.out.println("Desktop "+"Locked"+MultiThreadingQues5_1.resource1);
        }
    }
}

public class MultiThreadingQues5_1
{
    public static String resource1= "printer";
    public static String resource2= "scanner";
    public static void main(String[] args) {
        Thread15 th1= new Thread15();
        Thread25 th2= new Thread25();
        th1.start();
        th2.start();
    }
}