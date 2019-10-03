package daily._10_03;

import java.time.DayOfWeek;
import java.time.Month;
import java.util.function.*;

/**
 * For every generic functional interface, there are several spezialized versions
 * dealing with 3 primitive types: int, long, double
 * <p>
 * Let's see what Interfaces we have for int:
 */
public class FunctionalInterfaces {
    public static void main(String[] args) {

        // int -> void
        IntConsumer printInt = num -> System.out.println(num);
        printInt.accept(42);

        // void -> int
        IntSupplier get42 = () -> 137;
        System.out.println(
                get42.getAsInt()
        );

        // Object -> int
        ToIntFunction<DayOfWeek> daynumber = day -> day.getValue();
        System.out.println(
                daynumber.applyAsInt(DayOfWeek.MONDAY)
        );

        // int -> Object
        IntFunction<DayOfWeek> dayOfNumber = number -> DayOfWeek.of(number);
        System.out.println(
                dayOfNumber.apply(2)
        );

        // int -> int
        IntUnaryOperator addTwo = integer -> integer + 2;
        System.out.println(
                addTwo.applyAsInt(3)
        );

        // Object, Object -> int
        ToIntBiFunction<DayOfWeek, Month> addMonthAndDay = (day, month) -> day.getValue() + month.getValue();
        System.out.println(
                addMonthAndDay.applyAsInt(DayOfWeek.WEDNESDAY, Month.MARCH)
        );

        // int, int -> int
        IntBinaryOperator addition = (a, b) -> a + b;
        System.out.println(
                addition.applyAsInt(3, 4)
        );


        // Object, int -> void
        ObjIntConsumer<DayOfWeek> print = (day, num) -> System.out.println("" + day + num);
        print.accept(DayOfWeek.TUESDAY, 42);

    }
}
