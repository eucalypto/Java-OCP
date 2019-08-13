package challenges._08_13;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class FileExplorer {
    public static void main(String[] args) {
        File photos = new File("Photos");
        System.out.println(photos.exists());
        photos.mkdir();
           // create a folder named "Photos" at current working directory
        File summer19 = new File(photos, "Summer 2019");
        summer19.mkdir();

        File readme = new File(summer19, "readme.txt");
        try { readme.createNewFile(); }
            catch (IOException e) { e.printStackTrace(); }


        // Now everything in the user home folder:
        // Properties userproperties = System.getProperties();
        // System.out.println(userproperties.getProperty("user.dir"));
        // userproperties.list(System.out);

        File home = new File(System.getProperty("user.home"));
        System.out.println(home.exists());
        new File(home.getPath() + File.separator + readme.getPath()).mkdirs();


    }
}
