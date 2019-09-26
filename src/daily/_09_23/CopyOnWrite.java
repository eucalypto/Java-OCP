package daily._09_23;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWrite {
    public static void main(String[] args) {
        List<Integer> cowList = new CopyOnWriteArrayList<>();

        cowList.add(4);
        cowList.add(2);
        cowList.add(137);
        cowList.add(1337);
        cowList.add(1001);

        cowList.remove(new Integer(2));
        cowList.remove(2);


        System.out.println("cowList = " + cowList);
    }
}
