package daily._09_11;

public class ThreadPuttingToSleep {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}

class MyThread extends Thread implements Runnable {
    @Override
    public void run() {
        int counter = 0;
        for (int i = 1; i <= 100; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignored) { }
            counter++;
            if (counter % 10 == 0) System.out.println("counted to " + counter);
        }
    }
}
