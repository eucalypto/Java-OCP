package challenges._07_12;

public abstract class Konto {
    private int kontoNummer;
    private Kunde kunde;


    public Konto(Kunde kunde, int kontoNummer) {
        this.kunde = kunde;
        this.kontoNummer = kontoNummer;
    }

    public Kunde getKunde() {
        return kunde;
    }
}
