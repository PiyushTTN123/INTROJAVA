package Multithreading;

import java.util.concurrent.locks.ReentrantLock;

//Using reentrant lock to avoid deadlock

class Thread16 extends Thread
{
    final ReentrantLock lockA= new ReentrantLock();
    final ReentrantLock lockB= new ReentrantLock();

    public void run()
    {
        if(lockA.tryLock())
        {
            System.out.println("Desktop "+": acquired locked on"+MultiThreadingQues5_2.resource1);
        }
        try
        {
            Thread.sleep(1000);
        }
        catch(Exception e)
        {

        }

        if(lockB.tryLock())
        {
            System.out.println("Desktop "+": Waiting for "+MultiThreadingQues5_2.resource2+".....");
            System.out.println("Desktop "+": acquired locked on"+MultiThreadingQues5_2.resource2);
        }
    }
}

class Thread26 extends Thread
{
    final ReentrantLock lockA= new ReentrantLock();
    final ReentrantLock lockB= new ReentrantLock();

    public void run()
    {
        if(lockA.tryLock())
        {
            System.out.println("Desktop "+": acquired locked on"+MultiThreadingQues5_2.resource2);
        }
        try
        {
            Thread.sleep(1000);
        }
        catch(Exception e)
        {

        }

        if(lockB.tryLock())
        {
            System.out.println("Desktop "+": Waiting for "+MultiThreadingQues5_2.resource1+".....");
            System.out.println("Desktop "+": acquired locked on"+MultiThreadingQues5_2.resource1);
        }
    }
}

public class MultiThreadingQues5_2 {
    public static String resource1= "printer";
    public static String resource2= "scanner";
    public static void main(String[] args) {
        Thread16 th1= new Thread16();
        Thread26 th2= new Thread26();
        th1.start();
        th2.start();
    }
}