package daily._09_16;

import java.util.concurrent.atomic.AtomicInteger;

public class Misc {
    AtomicInteger aint;

    public static void main(String[] args) {
        // aint.set(); // not atomic
        // aint.compareAndSet(); // atomic
    }
}
