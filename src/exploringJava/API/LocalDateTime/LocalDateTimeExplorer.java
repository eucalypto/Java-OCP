package exploringJava.API.LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeExplorer {
    public static void main(String[] args) {
        LocalTime timeNow = LocalTime.now();
        System.out.println("timeNow = " + timeNow);

        LocalDate dateNow = LocalDate.now();
        System.out.println("dateNow = " + dateNow);

        LocalDateTime dateTimeNow = LocalDateTime.of(dateNow, timeNow);
        System.out.println("dateTimeNow = " + dateTimeNow);
        System.out.println(dateTimeNow.getClass());

        // LocalDateTime bacon = Local

        //

        // ZonedDateTime

    }
}
