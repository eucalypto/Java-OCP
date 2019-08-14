package challenges._07_12;

public class Kunde {
    private String name;
    private int kundenNummer;


    public Kunde(String name, int kundenNummer) {
        // Possible checks for name
        this.name = name;

        // Possible checks for kontonummer
        this.kundenNummer = kundenNummer;
    }

    public String toString() {
        return "[name: " + name + ", Kundennummer: " + kundenNummer + "]";
    }
}
