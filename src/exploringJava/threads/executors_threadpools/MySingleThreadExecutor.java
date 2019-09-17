package exploringJava.threads.executors_threadpools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MySingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        executorService.submit(new MyRunnable());
        executorService.submit(new MyRunnable());

        executorService.shutdown();
    }
}
