package exploringJava.threads.multithread;

public class ThreadExplorer {
    public static void main(String[] args) throws InterruptedException {
        Runnable run = () -> {
            System.out.println("This is a very important task");
            for (int i = Integer.MIN_VALUE; i < Integer.MAX_VALUE; i++) {
                double do1 = 234183442348.239;
                double do2 = 2348174834885382.13;
                double lo3 = do1*do2*do1*do2;
            }
            System.out.println(Thread.currentThread().getName());
        };
        Thread thread = new Thread(run);

        System.out.println(thread.isAlive());
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.isAlive());
        System.out.println(thread.getState());
        thread.interrupt();
        System.out.println(thread.isAlive());
        System.out.println(thread.getState());
        Thread.sleep(1000);
        System.out.println(thread.isAlive());
        System.out.println(thread.getState());
        System.out.println(Thread.currentThread().getName());
    }
}
