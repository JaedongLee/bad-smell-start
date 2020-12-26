/* 以下代码有什么坏味道？ */

package practiceTwo;

public class AirwayBill { // 快递单
    private CustomerName toCustomerName;
    private CustomerName fromCustomerName;
    private Address toAddress;
    private Address fromAddress;

    public String to() {
        return "Customer: " +
                toCustomerName.getTitle() + ": " + toCustomerName.getFirstName() + " " + toCustomerName.getLastName() +
                System.lineSeparator() +
                "Address: " +
                toAddress.getHouseNumber() + " " +
                toAddress.getStreetAddress() + ", " +
                toAddress.getCity() + ", " +
                toAddress.getProvince() + ", " +
                toAddress.getZipCode();
    }

    public String from() {
        return "Customer: " +
                fromCustomerName.getTitle() + ": " + fromCustomerName.getFirstName() + " " + fromCustomerName.getLastName() +
                System.lineSeparator() +
                "Address: " +
                fromAddress.getHouseNumber() + " " +
                fromAddress.getStreetAddress() + ", " +
                fromAddress.getCity() + ", " +
                fromAddress.getProvince() + ", " +
                fromAddress.getZipCode();
    }

    public void setToAddress(Address address) {
        this.toAddress = address;
    }


    public void setToCustomerName(CustomerName customerName) {
        this.toCustomerName = customerName;
    }

    public void setFromAddress(Address address) {
        this.fromAddress = address;
    }

    public void setFromCustomerName(CustomerName customerName) {
        this.fromCustomerName = customerName;
    }
}
