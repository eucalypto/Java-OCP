package daily._09_25;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Important methods: putIfAbsent(), remove(), replace()
 */
public class MyConHashMap {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> heights = new ConcurrentHashMap<>();
        heights.put("Gandalf", 183);
        System.out.println(heights.put("Gimli", 161));

        System.out.println(heights.putIfAbsent("Gandalf", 184));

        heights.remove("Gimli");
        // removes the key-value pair from Map if key is already present
        // also: this action is made atomically
        heights.remove("Gimli", 123);
        // does the same as remove(key) but first checks if the value is the same as the stored one


        heights.replace("Gandalf", 184, 185);
        heights.replace("Gandalf", 123);
        // heights.put()
        // heights.remove();
    }
}

