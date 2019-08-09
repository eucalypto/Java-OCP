package challenges._07_31;

import java.time.*;
import java.util.ArrayList;
import java.util.List;

public class B2 {
    public static void main(String[] args) {
        //4.8 | 11.08. | 18.08. | 25.08.
        getSundaysOfMonth(Month.AUGUST);
    }

    /**
     * 4.8 | 11.08. | 18.08. | 25.08.
     * @param month
     */
    public static void getSundaysOfMonth(Month month) {
        // LocalDate tmpdate = LocalDate.now().withDayOfMonth(1).withMonth(month.getValue());
        // LocalDate x2 = Year.now().atMonthDay(MonthDay.of(month, 1));
        LocalDate x = Year.now().atMonth(month).atDay(1);

        List<LocalDate> sundays = new ArrayList<>();
        while (x.getMonth().equals(month)) {
            if (x.getDayOfWeek() == DayOfWeek.SUNDAY)
                sundays.add(x);

            x = x.plusDays(1);
        }

        for (LocalDate sunday : sundays) System.out.println(sunday);
    }
}
