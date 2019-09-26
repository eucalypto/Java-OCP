package challenges._09_25;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Concurrent Collections:
 * - Iterator is fail-safe
 * <p>
 * Traditonal Collections:
 * - Iterator is fast-fail
 */
public class HashMap_vs_ConcurrentHashMap {
    private ConcurrentHashMap<String, Integer> weight_c = new ConcurrentHashMap<>();
    private HashMap<String, Integer> weight = new HashMap<>();

    {
        weight_c.put("Gandalf", 71);
        weight_c.put("Aragorn", 81);
        weight_c.put("Legolas", 65);
        weight_c.put("Gimili", 69);
        weight_c.put("Frodo", 35);

        weight.putAll(weight_c);
    }

    public static void main(String[] args) {
        new HashMap_vs_ConcurrentHashMap().main();
    }

    void main() {
        System.out.println(weight);
        System.out.println(weight_c);

        fail_fast(weight);
        // fail_fast(weight_c);
    }

    void fail_fast(Map<String, Integer> weights) {
        new Thread(() -> {
            // weights.keySet();
            // weights.entrySet();


            Iterator<Integer> myIterator = weights.values().iterator();
            while (myIterator.hasNext()) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(myIterator.next());
            }
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            weights.put("Pipin", 37);

        }).start();


    }
}
