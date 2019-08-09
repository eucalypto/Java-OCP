package exploringJava.API.ZonedDateTime;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


/**
 * This program tries to find the next daylight savings date by being stupid.
 * And using the Java API. We use that ZonedDateTime automatically includes
 * daylight saving changes.
 * <p>
 * We start with today's date and add 24 hours and see if the hour has changed.
 * <p>
 * (When I use .addDays(1), ZonedDateTime doesn't change the hour. This makes sense:
 * a daily meeting at 15:00 before the change, should still be at 15:00 after the
 * change.)
 */
public class ZonedDateTimeExplorer {
    public static void main(String[] args) {
        getNextDaylightSavingsDate();
    }

    public static void getNextDaylightSavingsDate() {
        ZonedDateTime now = ZonedDateTime.now();
        int hour = now.getHour();
        while (true) {
            now = now.plusHours(24);
            if (hour == now.getHour())
                continue;
            else
                break;
        }
        System.out.println(now.format(DateTimeFormatter.ISO_LOCAL_DATE));
        // 2019-10-27
    }
}
