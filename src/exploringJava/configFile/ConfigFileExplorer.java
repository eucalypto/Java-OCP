package exploringJava.configFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileExplorer {
    public static void main(String[] args) {
        Properties sysProperties = System.getProperties();
        // sysProperties.list(System.out);

        Properties userProperties = new Properties();
        try (FileInputStream fis = new FileInputStream("src/exploringJava/configFile/user.properties")) {
            userProperties.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        userProperties.list(System.out);

        System.out.println(userProperties.getProperty("mass"));

    }
}
