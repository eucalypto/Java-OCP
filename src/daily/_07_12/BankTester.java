package daily._07_12;

public class BankTester {
    public static void main(String[] args) {
        Kunde kunde1 = new Kunde("Gandalf the Grey", 03413445);
        System.out.println(kunde1);

        Girokonto giro1 = new Girokonto(kunde1, 75842734, "DE023740239484", "BYAISL8");
        System.out.println(giro1);
    }
}
