package exploringJava.API.LocalDateTime;

import java.time.LocalTime;

public class LocalTimeExplorer {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();

        LocalTime happyHour = LocalTime.of(16, 20, 00, 123);
        System.out.println(happyHour);
        LocalTime happyHour2 = LocalTime.of(16, 20, 00, 123000);
        System.out.println("happyHour2 = " + happyHour2);
        LocalTime happyHour3 = LocalTime.of(16, 20, 00, 123000000);
        System.out.println("happyHour3 = " + happyHour3);


    }
}
