package bankProject.test;

import bankProject.Address;
import org.junit.jupiter.api.Test;

class AddressTest {
    @Test
    void constructorThatTakesFourArguments() {
        Address address = new Address("Address-line 1", "Address-line 2", "78924", "Berlin");
    }

    private String addrLine1 = "742 Evergreen Terrace";
    private String addrLine2 = "Second door from the left";
    private String zip = "12345";
    private String city = "Springfield";
    Address address = new Address(addrLine1, addrLine2, zip, city);

    @Test
    void getAddrLine1() {


    }

    @Test
    void setAddrLine1() {
    }

}
