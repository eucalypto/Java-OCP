package daily._08_13;

import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public static void main(String[] args) {
        try (FileWriter fwriter = new FileWriter("bacon.txt")) {
        } catch (IOException e) { e.printStackTrace(); }


    }
}
