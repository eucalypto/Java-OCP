package challenges._07_25;

// This example looks when the constructor of an enum is executed

public class EnumProbing {
    public static void main(String[] args) {

    }
}

enum WEEKDAYS {
    MON, TUE, WED, THU, FRI, SAT, SUN;

    WEEKDAYS() {System.out.println("This is the constructor of WEEKDAYS"); }
}
