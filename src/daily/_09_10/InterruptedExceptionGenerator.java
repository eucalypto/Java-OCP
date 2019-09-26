package daily._09_10;

public class InterruptedExceptionGenerator {
    public static void main(String[] args) {
        // normal_case();
        interrupted_case();
    }
    static void normal_case() {
        Object monitor = new Object();

        Thread wait = new Thread(() -> {
            synchronized (monitor) {
                try {
                    monitor.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"Waiting");

        Thread interrupt = new Thread("Interrupt"){
            public void run() {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                wait.interrupt();
                // this.interrupt();
            }
        };

        wait.start();
        interrupt.start();
    }
    static void interrupted_case() {
        Thread idle = new Thread("idle") {
            public void run() {
                while (true) {
                    long lo = 7*77*77;
                }
            }
        };

        idle.start();
        try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }

        idle.interrupt();

    }
}
