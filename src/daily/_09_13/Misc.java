package daily._09_13;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Misc {
    public static void main(String[] args) {
        AutoCloseable ac = new AutoCloseable() {
            @Override
            public void close() {

            }
        };
        ReentrantLock lock = new ReentrantLock();
        Condition cond = lock.newCondition();
        try {
            cond.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cond.signal();
    }
}
