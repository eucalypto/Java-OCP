package exploringJava.threads.executors_threadpools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MySingleThreadExecutor {
    public static void main(String[] args) {
        withMyRunnable();
    }

    private static void withMyRunnable() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        executorService.submit(new MyRunnable());
        executorService.submit(new MyRunnable());
        executorService.submit(new MyRunnable());
        // Output from the last 3 lines:
        // Printing out random times by pool-1-thread-1
        // 1 Mississippi.
        // 2 Mississippi.
        // 3 Mississippi.
        // 4 Mississippi.
        // 5 Mississippi.
        // 6 Mississippi.
        // 7 Mississippi.
        // 8 Mississippi.
        // 9 Mississippi.
        // Printing out random times by pool-1-thread-1
        // 1 Mississippi.
        // 2 Mississippi.
        // Printing out random times by pool-1-thread-1
        // 1 Mississippi.
        // 2 Mississippi.
        //
        // ------
        // This means that the single thread runs and completes a single task before doing another.
        // So this ExecutorService does not act like a thread scheduler.

        executorService.shutdown();
    }
}
