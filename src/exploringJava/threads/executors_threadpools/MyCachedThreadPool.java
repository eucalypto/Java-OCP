package exploringJava.threads.executors_threadpools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyCachedThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new MyRunnable());
        executorService.submit(new MyRunnable());
        executorService.shutdown();
    }
}
