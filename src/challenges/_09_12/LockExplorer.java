package challenges._09_12;

import java.util.concurrent.locks.ReentrantLock;

public class LockExplorer {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();

        class Target implements Runnable {

            @Override
            public void run() {
                lock.lock();
                System.out.println(lock.getHoldCount());
                sub_run();

                lock.unlock();
            }

            public void sub_run() {
                lock.lock();
                // Here we need (another) lock
                System.out.println("Do something that needs a lock.");
                System.out.println(lock.getHoldCount());
                // What other methods does lock have?
                lock.lock();
                lock.unlock();
                lock.getQueueLength();
                // lock.getWaitQueueLength();
                // lock.hasWaiters()
                lock.isLocked(); // for monitoring
                lock.unlock();
            }

        }

        Target target = new Target();
        Thread thread1 = new Thread(target);

        thread1.start();
        new Thread(target).run();

    }

}
