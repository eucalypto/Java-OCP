package challenges._09_12;

import java.util.concurrent.locks.ReentrantLock;

public class ExamWithThreads {
    public static void main(String[] args) {
        ReentrantLock examRoom = new ReentrantLock();

        new Thread(new Student(examRoom, "Alice")).start();
        new Thread(new Student(examRoom, "Bob")).start();
        new Thread(new Student(examRoom, "Eve")).start();
        new Thread(new Student(examRoom, "Alex")).start();
    }
}

class Student implements Runnable {
    private ReentrantLock examRoom;
    private String name;

    Student(ReentrantLock examRoom, String name) {
        this.examRoom = examRoom;
        this.name = name;
    }

    @Override
    public void run() {
        sign_up();
        while (!examRoom.tryLock()) {
            wait_and_learn();
        }
        take_exam();
        examRoom.unlock();
    }

    private void take_exam() {
        // make sure you really have the lock!
        examRoom.lock();
        System.out.println(name + ": taking the exam.");

        sleep_random(1000);
        System.out.println(name + " exam finished");
        examRoom.unlock();
    }

    private void wait_and_learn() {
        System.out.println(name + " has to wait and use the time for learning");

        sleep_random(500);
    }

    private void sign_up() {
        System.out.println(name + " signs up for exam at reception");

        sleep_random(200);
    }

    private void sleep_random(long maxTime) {
        // Random time between 0.5 and 1.0 times maxTime
        long time = (long) ((1.0 + Math.random()) / 2 * maxTime);
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
