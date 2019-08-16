package challenges._08_14.serialize;

import java.io.Serializable;

public class Girokonto implements Serializable {
    private String iban;
    private String bic;
    private double kontostand;


    public Girokonto(String iban, String bic, double kontostand) {
        this.iban = iban;
        this.bic = bic;
        this.kontostand = kontostand;
    }

    @Override
    public String toString() {
        return "Girokonto{" +
                "iban='" + iban + '\'' +
                ", bic='" + bic + '\'' +
                ", kontostand=" + kontostand +
                '}';
    }

    // Getters and setters
    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public double getKontostand() {
        return kontostand;
    }

    public void setKontostand(double kontostand) {
        this.kontostand = kontostand;
    }
}
