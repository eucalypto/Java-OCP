package daily._09_29;

public class Multithread {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            foo("Thread 1 is running");
        });

        Thread t2 = new Thread(() -> {
            foo("Thread 2 is running");
        });

        t1.start();
        t2.start();
    }

    public static void foo(String string) {
        for (int i = 1; i <= 10_000; i++)
            System.out.println(string);
    }
}
