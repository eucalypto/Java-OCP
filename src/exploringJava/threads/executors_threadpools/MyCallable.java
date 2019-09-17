package exploringJava.threads.executors_threadpools;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

public class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int randomInt = ThreadLocalRandom.current().nextInt(1, 11);
        for (int i = 0; i < randomInt; i++)
            System.out.println(
                    (99 - i) + " bottles of beer on the wall, "
                            + (99 - i) + " bottles of beer -- "
                            + "Take one down, pass it around: "
                            + (98 - i) + " bottles of beer on the wall."
            );
        return 42;
    }
}
