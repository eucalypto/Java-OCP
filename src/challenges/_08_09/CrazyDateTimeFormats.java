package challenges._08_09;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;

public class CrazyDateTimeFormats {
    public static void main(String[] args) {
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println("zdt = " + zdt);
        System.out.println(zdt.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));

        // System.out.println(zdt.format(DateTimeFormatter.ofPattern("")));

        System.out.println(zdt.format(DateTimeFormatter.ofPattern(
                "dd.MM.yyyy"))); // 09.08.2019
        System.out.println(zdt.format(DateTimeFormatter.ofPattern(
                "yyyy-'W'w-e"))); // 2019-W32-5
        System.out.println(zdt.format(DateTimeFormatter.ISO_WEEK_DATE));
        // 2019-W32-5+02:00


        System.out.println(zdt.format(DateTimeFormatter.ofPattern(
                "yyyy-MM-dd"))); // 2019-08-09

        System.out.println(zdt.format(DateTimeFormatter.ofPattern(
                "dd-MMM-yyyy"))); // 09-Aug-2019
        System.out.println(zdt.minusMonths(3).format(DateTimeFormatter.ofPattern(
                "dd-MMM-yyyy", Locale.GERMANY)));
        System.out.println(zdt.minusMonths(3).format(DateTimeFormatter.ofPattern(
                "dd-MMM-yyyy", Locale.US)));

        System.out.println(zdt.format(DateTimeFormatter.ofPattern(
                "dd/MM/yyyy"))); // 09/08/2019

        System.out.println(zdt.format(DateTimeFormatter.ofPattern(
                "eee, MMM dd yyyy", Locale.US)));
        // Fri, Aug 09 2019

        System.out.println(zdt.format(DateTimeFormatter.ofPattern(
                "eeee, MMM dd, yyyy hh:mm:ss a", Locale.US)));
        // Friday, Aug 09, 2019 11:19:51 AM

        System.out.println(zdt.format(DateTimeFormatter.ofPattern(
                "yyyy-MM-dd'T'HH:mm:ss xxx")));
        // 2019-08-09T11:26:12 +02:00

        System.out.println(zdt.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));


        DateTimeFormatterBuilder fbuilder = new DateTimeFormatterBuilder();
        fbuilder.appendOffset("+HH", "").appendLiteral(".");
        fbuilder.appendOffset("+HH", "");
        System.out.println(zdt.format(fbuilder.toFormatter())); // +02.+02


    }
}
