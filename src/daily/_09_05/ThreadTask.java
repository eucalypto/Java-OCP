package daily._09_05;

public class ThreadTask {
    public static void main(String[] args) {
        System.out.println("main() start");

        Thread alice = new MyThread();
        alice.setName("Alice");
        alice.start();

        System.out.println("main() end");
    }
}


class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread started. I am alive!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (this) {
            System.out.println(this.getState());
        }

        System.out.println("I feel weak, I will probably die soon. Here is my legacy: " + this + this.getState());
    }
}
