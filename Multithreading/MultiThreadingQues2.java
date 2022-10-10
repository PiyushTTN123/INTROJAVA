// 2).Use a singleThreadExecutor, newCachedThreadPool() and newFixedThreadPool() to submit a list of tasks and wait for completion of all tasks.
package Multithreading;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

class Task implements Runnable {
    private String name;

    public Task(String s) {
        name = s;
    }

    public void run() {

        for (int i = 0; i <= 5; i++) {
            Date d = new Date();
            SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
            if (i == 0) {
                System.out.println("Start time for " + name + " == " + ft.format(d));
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (i == 5) {
                System.out.println(name + " completed at " + ft.format(d));
            }
        }

    }
}

public class MultiThreadingQues2 {
    public static void main(String[] args) {
        Runnable r1 = new Task("Task 1");
        Runnable r2 = new Task("Task 2");
        Runnable r3 = new Task("Task 3");
        Runnable r4 = new Task("Task 4");
        Runnable r5 = new Task("Task 5");

        ExecutorService pool = Executors.newFixedThreadPool(2);

        pool.execute(r1);
        pool.execute(r2);
        pool.execute(r3);
        pool.execute(r4);
        pool.execute(r5);

        pool.shutdown();

        ExecutorService executor = Executors.newCachedThreadPool();
        ThreadPoolExecutor mypool = (ThreadPoolExecutor) executor;
        System.out.println("size of my pool : " + mypool.getPoolSize());
        executor.submit(r1);
        executor.submit(r2);
        executor.submit(r3);
        executor.submit(r4);
        executor.submit(r5);
        System.out.println("No. of threads scheduled : " + mypool.getTaskCount());
        executor.shutdown();

        ExecutorService executor2 = Executors.newSingleThreadExecutor();
        executor2.submit(r1);
        executor2.submit(r2);
        executor2.submit(r3);
        executor2.submit(r4);
        executor2.submit(r5);

    }
}