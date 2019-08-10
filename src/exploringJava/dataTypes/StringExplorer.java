package exploringJava.dataTypes;

public class StringExplorer {
    public static void main(String[] args) {
        String str1 = "Hello, World.";
        String str2 = "This is awesome";
        System.out.println(String.join("Not", str1, str2));
        System.out.println(String.join("-", "Hello", "This", "are", "strings"));

        String[] stringarray = new String[10];
        // System.out.println(stringarray.getClass());
        for (int i = 0; i < stringarray.length; i++) stringarray[i] = String.valueOf(i);

        System.out.println("stringarray = " + stringarray); // Not very pleasing
        System.out.println(String.join(", ", stringarray));
    }
}
