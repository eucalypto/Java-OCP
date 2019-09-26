package daily._09_24;

import org.jetbrains.annotations.NotNull;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class Misc {
    public static void main(String[] args) {

    }
}

class MyDelay implements Delayed {

    @Override
    public long getDelay(@NotNull TimeUnit unit) {
        return 0;
    }

    @Override
    public int compareTo(@NotNull Delayed o) {
        return 0;
    }
}
