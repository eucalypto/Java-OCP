package exploringJava.classes.generictype;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

public class GenericTypeClassExplorer {
    public static void main(String[] args) {
        First first1 = new First();
        Second second1 = new Second();
        Third<First> third1 = new Third<>();

    }
}


class First {}

class Second {}

class Third<T> implements Comparable<String>, Comparator<T> {

    // private T smething = new T();
    @Override
    public int compareTo(@NotNull String o) {
        return 0;
    }

    @Override
    public int compare(T o1, T o2) {
        return 0;
    }
}
