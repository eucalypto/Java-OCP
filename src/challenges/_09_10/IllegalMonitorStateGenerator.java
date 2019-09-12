package challenges._09_10;

public class IllegalMonitorStateGenerator {
    public static void main(String[] args) {
        Object monitor = new Object();
        Thread thread = new Thread(() -> {

            try {
                // note we aren't in a monitor-locked context!
                monitor.notify();
            } catch (IllegalMonitorStateException e) {
                e.printStackTrace();
            }

        }, "Mythread");

        thread.start();

    }
}

