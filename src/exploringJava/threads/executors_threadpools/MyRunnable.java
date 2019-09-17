package exploringJava.threads.executors_threadpools;

import java.util.concurrent.ThreadLocalRandom;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Printing out random times by " + Thread.currentThread().getName());
        int end = ThreadLocalRandom.current().nextInt(1, 11);
        for (int i = 1; i <= end; i++) System.out.println(i + " Mississippi.");
    }
}
