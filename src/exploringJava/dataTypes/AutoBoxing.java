package exploringJava.dataTypes;

public class AutoBoxing {
    public static void main(String[] args) {
        long shrt = new Byte((byte) 5);
        shrt = new Integer(5);
        System.out.println(shrt);

        Integer lo = 4;
        int in;
        // in = new Long(4);

        // short by;
        long by = new Integer(4);


        Integer int1 = new Integer("132");
        Boolean boo1 = new Boolean("true");

        // Character chr = new Character("c"); // Does not work!
        Character chr = new Character('c'); // There is only one constructor that takes a char!
    }
}
