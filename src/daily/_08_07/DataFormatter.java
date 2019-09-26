package daily._08_07;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class DataFormatter {
    public static void main(String[] args) {
        DateTimeFormatter dtformat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        LocalDateTime dtnow = LocalDateTime.now();
        System.out.println("dtnow = " + dtnow);
        System.out.println(dtnow.format(dtformat));
        System.out.println(dtnow.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));

        ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.of(LocalDate.of(1970, 1,1), LocalTime.of(22,47)), ZoneId.of("US/Pacific"));

        System.out.println("zdt = " + zdt);
        ZonedDateTime zdt2 = zdt.withZoneSameInstant(ZoneId.of("Europe/Berlin"));
        System.out.println("zdt2 = " + zdt2);

        System.out.println(Instant.now());
        System.out.println(Instant.now().atZone(ZoneId.of("US/Pacific")));
        System.out.println(Instant.now().atZone(ZoneId.of("Europe/Berlin")));

        ZonedDateTime zd3 = zdt.toInstant().atZone(ZoneId.of("Europe/Berlin"));
        System.out.println(zdt.minus(4, ChronoUnit.DAYS));
        // TemporalAdjusters


        DateTimeFormatter df = DateTimeFormatter.ISO_DATE_TIME;
        LocalDateTime now = LocalDateTime.now();
        System.out.println(df.format(now));
        System.out.println(now.format(df));

        System.out.println(now.format(DateTimeFormatter.ofPattern("hh:mm a")));

    }
}
