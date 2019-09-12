package challenges._09_10;

public class NullpointerExceptionGenerator {
    public static void main(String[] args) {
        String str = null;
        try {
            str.concat(" world");
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
