package exploringJava.finnal;


/**
 * This class explores when final variables need to be assigned. They can only be assigned
 * once and never again after that. But apparently, they don't have to be assigned right
 * at the declaration.
 */
public class FinalFields {
    static int staticInt;
    final static int finalStaticInt;
    final static Double finalStaticDouble = 3.14;
    static {
        staticInt = 3;
        finalStaticInt = 4;
            // This is fine. Apparently the compiler is happy if a final static variable is
            // assigned a value somewhere in a static block.

        // Do more static stuff....

        staticInt = 5;
        // finalStaticInt = 6;
            // Error:(11, 9) java: variable finalStaticInt might already have been assigned
            // You can't re-assign a final variable again.
    }

    int instanceInt;
    final int instanceFinalInt;

    {
        instanceInt = 10;
        // instanceFinalInt = 11;
    }

    FinalFields(){
        instanceInt = 13;
        instanceFinalInt = 14;
    }


    public static void main(String[] args) {
        System.out.println("maint fucntion");
    }
}
