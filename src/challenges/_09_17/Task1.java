package challenges._09_17;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;

public class Task1 {
    public static void main(String[] args) {
        Runnable myRunnable = () -> {
            int randomInt = ThreadLocalRandom.current().nextInt(1, 11);
            for (int i = 1; i <= randomInt; i++) {
                System.out.println(Thread.currentThread().getName()
                        + ": " + i + " mississippi");

                try {
                    Thread.sleep(333);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println(Thread.currentThread().getName() + ": I'm finished!");
        };

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 5; i++)
            executorService.submit(myRunnable);

        executorService.shutdown();
    }
}


