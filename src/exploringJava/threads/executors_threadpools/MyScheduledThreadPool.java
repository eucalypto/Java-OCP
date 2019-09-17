package exploringJava.threads.executors_threadpools;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MyScheduledThreadPool {
    public static void main(String[] args) {
        int cpuNumber = Runtime.getRuntime().availableProcessors();
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(cpuNumber);

        scheduledExecutorService.schedule(new MyRunnable(), 10, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleAtFixedRate(new MyRunnable(), 0, 10, TimeUnit.SECONDS);


        try {
            Thread.sleep(30 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        scheduledExecutorService.shutdown();
    }
}
