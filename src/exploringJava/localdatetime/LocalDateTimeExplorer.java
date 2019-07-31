package exploringJava.localdatetime;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.TemporalField;

public class LocalDateTimeExplorer {
    public static void main(String[] args) {
        exploreLocalDate();
        exploreLocalTime();
    }

    private static void exploreLocalDate() {
//        LocalDate ldate = new LocalDate(2019, 07, 31);
            // Error:(7, 27) java: LocalDate(int,int,int) has private access in java.time.LocalDate
            // so this doesn't work
        LocalDate ldate = LocalDate.of(2019, 7, 31);
        System.out.println(ldate); // 2019-07-31
        LocalDate maxdate = LocalDate.MAX; // Maximum possible localdate
        System.out.println(maxdate); // +999999999-12-31
        System.out.println(LocalDate.MIN); // -999999999-01-01

        System.out.println("ldate.getEra() : " + ldate.getEra()); // CE
        System.out.println("ldate.getDayOfYear() : " + ldate.getDayOfYear()); // 212
        System.out.println(ldate.hashCode()); // 4135391
        System.out.println(ldate.plusWeeks(42)); // 2020-05-20

//        System.out.println(LocalDate.of(2019, 01, 33));
            // java.time.DateTimeException: Invalid value for DayOfMonth (valid values 1 - 28/31): 33

    }

    private static void exploreLocalTime() {
        LocalTime ltime = LocalTime.of(16, 20);
        System.out.println(ltime);
        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println(now.equals(ltime));
        System.out.println(now.getNano());

    }

}
