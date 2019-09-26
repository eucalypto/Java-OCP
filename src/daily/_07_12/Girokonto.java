package daily._07_12;

public class Girokonto extends Konto {
    private String iban;
    private String bic;
    //private double dispo;
    //private double kontostand;
    //private double zins;

    public Girokonto(Kunde kunde, int kontonummer, String iban, String bic) {
        super(kunde, kontonummer);
        this.iban = iban;
        this.bic = bic;
    }

    public String toString() {
        return "[kunde: " + getKunde() + ", iban: " + iban + ", bic: " + bic + "]";
    }
}
