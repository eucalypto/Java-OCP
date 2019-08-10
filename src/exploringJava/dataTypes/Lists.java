package exploringJava.dataTypes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        // exploreArrays();
        exploreLists();
    }


    public static void exploreArrays() {
        int[] array = new int[10];
        System.out.println("array = " + array[3]);
        // 0 This means arrays are instanciated
        // with default values for fields.

        System.out.println(array.length);

    }

    public static void exploreLists() {
        List<Integer> integerlist = new ArrayList<>();
        integerlist.add(1);
        integerlist.add(2);
        integerlist.remove(1);
        Collections.sort(integerlist);

        integerlist.add(1, 4);


        List lst = new ArrayList(1);
        lst.add(1);
        lst.add("Abe");
        lst.add(new Integer(3));
        lst.add(new int[1]);

        System.out.println("lst = " + lst);
        for (Object o : lst) System.out.println(o.getClass());


    }
}
