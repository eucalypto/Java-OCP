package challenges._09_09;

import org.jetbrains.annotations.NotNull;

public class Scheduler {
    public static void main(String[] args) {
        MyThread bob = new MyThread("Bob");
        MyThread alice = new MyThread("Alice");
        // bob.setPriority(5);
        // alice.setPriority(1);

        bob.start();
        alice.start();

    }
}

class MyThread extends Thread {
    public MyThread() {
    }

    public MyThread(@NotNull String name) {
        super(name);
    }

    @Override
    public void run() {
        super.run();
        System.out.println(this.getPriority());
        for (int i = 0; i < 10; i++) {
            System.out.println("This is " + this.getName());
            // try {
            //     Thread.sleep(500);
            // } catch (InterruptedException e) {
            //     e.printStackTrace();
            // }
        }
    }
}
