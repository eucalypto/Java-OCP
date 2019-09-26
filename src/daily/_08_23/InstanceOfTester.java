package daily._08_23;

import java.util.ArrayList;
import java.util.List;

public class InstanceOfTester {

    public static void main(String[] args) {
        List<String> str_list = new ArrayList<>();
        System.out.println(str_list instanceof ArrayList);
        System.out.println(str_list instanceof List);
    }
}
