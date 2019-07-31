package challenges._07_31;

/*
 * What Class is best suited to represent a birthday.
 */

import java.time.*;
import java.util.ArrayList;
import java.util.List;

public class DateHelper {
    public static void main(String[] args) {
        // birthday();
        // lastSaturdayTester();
        // getLengthsOfMonthsTester();
        // getSundaysOfMonthTester();
        // isFridayThe13thTester();
        getAllFirstSaturdaysOfThisYear();
    }

    private static void birthday() {
        LocalDate birthday = LocalDate.of(1988, 07, 31);
        LocalDateTime birthDay = birthday.atTime(13, 15);
        System.out.println(birthDay + " ; " + birthDay.getNano());
    }


    public static void lastSaturdayTester() {
        LocalDate today = LocalDate.now();
        LocalDate lastsaturday = lastSaturday(today);
        System.out.println("Today is " + today + " and last Saturday was the " + lastsaturday);
    }

    public static LocalDate lastSaturday(LocalDate currentDate) {
        LocalDate returnDate = currentDate;

        while (returnDate.getDayOfWeek() != DayOfWeek.SATURDAY) {
            returnDate = returnDate.minusDays(1);
        }

        assert (returnDate.getDayOfWeek() == DayOfWeek.SATURDAY) : "The return day should be Saturday";
        return returnDate;
    }


    public static ZonedDateTime zoneIDToZonedDatetime(ZoneId zoneid) {
        return null;
    }


    private static void getLengthsOfMonthsTester() {
        getLengthsOfMonths(2019);
        getLengthsOfMonths(2000);
        getLengthsOfMonths(2004);
    }

    public static void getLengthsOfMonths(int year) {
        System.out.println("The year is " + year);
        for (Month month : Month.values()) {
            LocalDate tmpdate = LocalDate.of(year, month,1);
            System.out.println(month + " has days: " + tmpdate.lengthOfMonth());
        }
    }

    private static void getSundaysOfMonthTester() {
        getSundaysOfMonth(6);
        getSundaysOfMonth(7);
        getSundaysOfMonth(8);
    }

    public static void getSundaysOfMonth(int month) {
        LocalDate tmpdate = LocalDate.now().withDayOfMonth(1).withMonth(month);
        List<LocalDate> sundays = new ArrayList<>();
        while (tmpdate.getMonth().getValue() == month) {
            if (tmpdate.getDayOfWeek() == DayOfWeek.SUNDAY)
                sundays.add(tmpdate);

            tmpdate = tmpdate.plusDays(1);
        }

        for (LocalDate sunday : sundays) System.out.println(sunday);
    }

    private static void isFridayThe13thTester() {
        LocalDate tmpday = LocalDate.now();
        for (int i = 0; i < 90; i++) {
            System.out.println(tmpday + ", is it a friday the 13th? : " + isFridayThe13th(tmpday));
            tmpday = tmpday.plusDays(1);
        }
    }

    public static boolean isFridayThe13th(LocalDate day) {
        if (day.getDayOfWeek() == DayOfWeek.FRIDAY && day.getDayOfMonth() == 13) return true;
        else return false;
    }




    public static void getAllFirstSaturdaysOfThisYear() {
        LocalDate firstOfThisYear = LocalDate.now().withDayOfYear(1);

        for (Month month : Month.values()) {
            LocalDate firstOfTheMonth = firstOfThisYear.withMonth(month.getValue());
            System.out.println("The first saturday of " + month + " is " + getFirstDayOfMonth(DayOfWeek.SATURDAY, firstOfTheMonth));
        }


    }
    public static LocalDate getFirstDayOfMonth(DayOfWeek weekday, LocalDate firstOfMonth) {
        LocalDate tmpdate = firstOfMonth;
        for (int i = 0; i < 7; i++) {
            if (tmpdate.getDayOfWeek() == weekday) return tmpdate;
            tmpdate = tmpdate.plusDays(1);
        }
        assert (false) : "This code should never be reached";
        return null;
    }
}
