package daily._09_11;

import java.util.concurrent.atomic.AtomicLong;

public class BoxImproved {
    public static void main(String[] args) {

    }
}


class Box {
    AtomicLong value = new AtomicLong(0L);
    // Using the AtomicLong class does help in making the methods well-behaved
    // But it does not help when calling the get() function.
    // You are not guaranteed that value is not updated between calling get()
    // and getting the value returned.
    // you still need to synchronize all methods.
    // but then you don't need AtomicLong at all.

    public long get() {
        return value.get();
    }
    public long getInc() {
        return value.incrementAndGet();
    }
    public long m(long x) {
        // value += x;
        // return value;
        return value.addAndGet(x);
    }
    public long f(long x) {
        // long temp = value;
        // value += x;
        // return temp;
        return value.getAndAdd(x);
    }
    public long g(long x) {
        // long temp = value;
        // value -= x;
        // return temp;
        return value.getAndAdd(-x);
    }

    public void h(long x) {
        // value += x;
        value.getAndAdd(x);
    }
}
