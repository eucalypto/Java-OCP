package exploringJava.classes;

public class Casting {
    public static void main(String[] args) {
        int[] intarray = new int[]{1, 3, 4, 5};
        Object obj = (Object) intarray;
        String str = (String) (Object) (Number) obj;
    }
}
