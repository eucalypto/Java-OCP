package daily._09_12;


public class SynchronizingBlock {
    public static void main(String[] args) {
        StringBuffer mybuffer = new StringBuffer().append('A');
        MyThread thread1 = new MyThread(mybuffer);
        MyThread thread2 = new MyThread(mybuffer);
        MyThread thread3 = new MyThread(mybuffer);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}


class MyThread extends Thread {
    private StringBuffer buffer;

    public MyThread(StringBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        synchronized (buffer) {
            for (int i = 0; i < 100; i++) {
                System.out.println(buffer + " : " + Thread.currentThread().getName());
                char tmpChar = buffer.charAt(0);
                tmpChar++;
                buffer.setCharAt(0, tmpChar);
            }
        }
    }
}
