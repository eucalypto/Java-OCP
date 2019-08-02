package exploringJava.dataTypes;

public class ObjectClass {
    public static void main(String[] args) {
        Object o = new Object();
        // What members does Object class have?
        o.equals(o);
        o.hashCode();
        o.toString();
        o.getClass();
        o.notify();
        o.notifyAll();
    }
}
