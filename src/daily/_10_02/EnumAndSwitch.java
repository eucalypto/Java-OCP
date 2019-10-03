package daily._10_02;

public class EnumAndSwitch {
    public static void main(String[] args) {
        final Holidays input = Holidays.Hanukkah;
        // PastafarianCelebrations input = PastafarianCelebrations.Ramendan;

        switch (input) {
            default:
            case ValentinesDay:
                System.out.println(1);
            case Thanksgiving:
                System.out.println(2);
        }

    }

    enum Holidays {
        Thanksgiving, Hanukkah, ValentinesDay, Ramadan
    }

    enum PastafarianCelebrations {
        Ramendan;
    }
}
