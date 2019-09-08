package de.papara.bank.client;

public class BusinessClient extends Client {
    private String businessName;
    private BusinessRepresentative businessRepresentative;


    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public BusinessRepresentative getBusinessRepresentative() {
        return businessRepresentative;
    }

    public void setBusinessRepresentative(BusinessRepresentative businessRepresentative) {
        this.businessRepresentative = businessRepresentative;
    }
}
