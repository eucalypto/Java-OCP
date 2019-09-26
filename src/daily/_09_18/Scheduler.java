package daily._09_18;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Scheduler {
    public static void main(String[] args) {
        ScheduledExecutorService schex = Executors.newScheduledThreadPool(8);

        Runnable myRunnable = () -> {
            System.out.println("I am alive!");
        };

        schex.scheduleAtFixedRate(myRunnable, 10, 32, TimeUnit.SECONDS);
        // executes the Runnable task every 32 seconds. If the task takes longer, the next one is not started
        // so that only one task is running at a time.

        schex.scheduleWithFixedDelay(myRunnable, 10, 32, TimeUnit.SECONDS);
        // executes a Runnable task 32 seconds AFTER the last task TERMINATED. "delay"

    }
}
