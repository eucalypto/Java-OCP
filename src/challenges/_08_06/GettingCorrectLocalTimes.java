package challenges._08_06;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class GettingCorrectLocalTimes {
    public static void main(String[] args) {
        ZonedDateTime nowzoned = ZonedDateTime.now();
        System.out.println("nowzoned = " + nowzoned);
        System.out.println(nowzoned.getOffset()); // +02:00
        System.out.println(nowzoned.getZone()); // Europe/Berlin
        Instant nowzonedToInstant = nowzoned.toInstant();
        System.out.println("nowzonedToInstant = " + nowzonedToInstant);

        // nowzoned.format(DateTimeFormatter.)
    }
}
