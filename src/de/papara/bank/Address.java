package de.papara.bank;

public class Address {
    private String addrLine1;
    private String addrLine2;
    private String zip;
    private String city;

    public Address(String addrLine1, String addrLine2, String zip, String city) {
        this.addrLine1 = addrLine1;
        this.addrLine2 = addrLine2;
        this.zip = zip;
        this.city = city;
    }

    // Getters and Setters

    public String getAddrLine1() {
        return addrLine1;
    }

    public void setAddrLine1(String addrLine1) {
        this.addrLine1 = addrLine1;
    }

    public String getAddrLine2() {
        return addrLine2;
    }

    public void setAddrLine2(String addrLine2) {
        this.addrLine2 = addrLine2;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
