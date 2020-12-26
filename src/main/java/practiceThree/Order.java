package practiceThree;

public class Order {
    //other fields
    private String buyerName;
    private String buyerPhoneNumber;
    private String buyerAddress;

    public Order(String buyerName, String buyerPhoneNumber, String buyerAddress) {
        //other fields
        this.buyerName = buyerName;
        this.buyerPhoneNumber = buyerPhoneNumber;
        this.buyerAddress = buyerAddress;
    }

    public boolean sameBuyer(String buyerName, String buyerPhoneNumber, String buyerAddress) {
        return this.buyerAddress.equals(buyerAddress) && this.buyerName.equals(buyerName) && this.buyerPhoneNumber.equals(buyerPhoneNumber);
    }
}

