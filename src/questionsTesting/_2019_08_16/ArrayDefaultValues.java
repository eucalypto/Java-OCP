package questionsTesting._2019_08_16;

/**
 * This program looks at default values of arrays. Arrays are set to their instance default values.
 * I thought that they need to be changed before usage, but apparently not. They are just default values
 * and Java is happy to use them.
 */
public class ArrayDefaultValues {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i : array) System.out.println("i = " + i);

        String[] sarray = new String[10];
        for (String str : sarray) System.out.println("str = " + str);

        int[][] array2d = new int[3][];

        array2d[1] = new int[]{1, 3, 4};

        for (int[] iarray : array2d) System.out.println("iarray = " + iarray);

    }
}
