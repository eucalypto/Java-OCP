package exploringJava.dataTypes;

public class StringBuilderExplorer {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        // 16

        StringBuilder sb2 = new StringBuilder("hello");
        System.out.println(sb2.capacity());

        StringBuilder sb3 = new StringBuilder(9);
        System.out.println(sb3.capacity());

        // sb3.append()
        StringBuilder sb4 = new StringBuilder("Hello");
        sb4.setLength(3);
        System.out.println("sb4 = " + sb4);
        sb4.setLength(10);
        System.out.println("sb4 = " + sb4);
        System.out.println(sb4.length());
        System.out.println(sb4.charAt(8));
        System.out.println(sb4.charAt(88));

    }
}
