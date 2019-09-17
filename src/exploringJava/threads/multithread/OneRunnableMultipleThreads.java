package exploringJava.threads.multithread;

public class OneRunnableMultipleThreads {
    public static void main(String[] args) {
        // simple();
        less_simple();
    }

    private static void simple() {
        Runnable run = () -> {
            System.out.println("This is the start of runnable");
            System.out.println(Thread.currentThread().getName() + " is executing this.");
        };

        Thread bob = new Thread(run, "Bob");
        Thread alice = new Thread(run, "Alice");
        Thread eve = new Thread(run, "Eve");

        bob.start();
        alice.start();
        eve.start();
    }

    private static void less_simple() {
        Runnable run = new Runnable() {
            int counter = 0;

            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("This is the run method of runnable");
                    System.out.println("It is executed by " + Thread.currentThread().getName());
                    System.out.println("Let's see what counter is: " + counter);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    counter++;
                }
                System.out.println(this.counter);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(this.counter);
            }
        };

        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        Thread t3 = new Thread(run);

        t1.start();
        t2.start();
        t3.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t1.getState() + " " + t1.getId());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t1.getState());
        System.out.println(t2.getState() + " " + t2.getId());

    }
}


