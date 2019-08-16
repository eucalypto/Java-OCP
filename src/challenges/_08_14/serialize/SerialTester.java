package challenges._08_14.serialize;

import java.io.*;

public class SerialTester {
    static final String giro_file_location = "src/challenges/_08_14/serialize/girokonto";


    public static void main(String[] args) {
        // writeGiro();
        readGiro();
    }

    static void writeGiro() {
        Girokonto gk = new Girokonto("DE31 2344 3838 3482 3742", "DAE210381", 10_000_000);
        Girokonto gk2 = new Girokonto("DE31 2344 3838 3482 0000", "DSYLASUI", 100_000_000);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(giro_file_location))) {
            // System.out.println("We want to write this object: " + gk);
            oos.writeObject(gk);
            oos.writeObject(gk2);
            System.out.println("Objects written successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void readGiro() {
        Girokonto gk_clone = null;
        Girokonto gk2_clone = null;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(giro_file_location))) {
            gk_clone = (Girokonto) ois.readObject();
            gk2_clone = (Girokonto) ois.readObject();
            System.out.println("Object read successfully");
        } catch (FileNotFoundException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("gk_clone = " + gk_clone);
        System.out.println("gk2_clone = " + gk2_clone);
    }
}
