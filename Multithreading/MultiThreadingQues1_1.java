package Multithreading;
// Create and Run a Thread using Runnable Interface and Thread class and show 
// usage of sleep and join methods in the created threads.
class Thread1 extends Thread
{
    public void run()
    {
        System.out.println("Thread1 running....");
    }
}


class Thread2 extends Thread
{
    public void run()
    {
        System.out.println("Thread2 running....");
    }
}

class Thread3 extends Thread
{
    public void run()
    {
        System.out.println("Thread3 running....");
    }
}

public class MultiThreadingQues1_1 {
    public static void main(String[] args) throws InterruptedException {
        Thread1 obj1 = new Thread1();
        Thread2 obj2 = new Thread2();
        Thread3 obj3 = new Thread3();
        obj1.start();
        obj1.join();
        //until thread1 will not finish it's operation thread2 will wait.
        obj2.start();
        obj2.join();
        Thread.sleep(2000);
        obj3.start();
    }
}
