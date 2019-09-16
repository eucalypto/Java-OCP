package exploringJava.threads.executors_threadpools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyFixedThreadPool {
    public static void main(String[] args) {
        int cpus = Runtime.getRuntime().availableProcessors();
        ExecutorService executorService = Executors.newFixedThreadPool(cpus);

        Runnable run = new Task();
        executorService.execute(run);

        executorService.shutdown();
    }
}
