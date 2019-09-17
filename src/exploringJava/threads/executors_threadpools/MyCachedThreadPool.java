package exploringJava.threads.executors_threadpools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyCachedThreadPool {
    public static void main(String[] args) {
        // withRunnable();
        withMyCallable();
    }

    private static void withMyCallable() {
        ExecutorService executorService = Executors.newCachedThreadPool();

        // executorService.execute(new MyRunnable());
        // void execute(Runnable command)
        // This is the only version of this method, there are no other overloaded ones

        executorService.submit(new MyCallable());
        //  Overloaded variants:
        //  Future<Object> submit(Callable<Object>)
        //  Future<Object> submit(Runnable, Object)
        //  Future<?> submit(Runnable)

        executorService.shutdown();
    }


    private static void withRunnable() {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new MyRunnable());
        executorService.submit(new MyRunnable());
        executorService.shutdown();
    }
}
