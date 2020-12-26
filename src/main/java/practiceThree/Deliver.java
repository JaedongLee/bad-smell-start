package practiceThree;

public class Deliver {
    private int deliverNumber;

    private String size;
    private Double weight;

    private String buyerName;
    private String buyerPhoneNumber;
    private String buyerAddress;

    public Deliver(int deliverNumber, String size, Double weight, String buyerName, String buyerPhoneNumber, String buyerAddress) {
        this.deliverNumber = deliverNumber;
        this.size = size;
        this.weight = weight;
        this.buyerName = buyerName;
        this.buyerPhoneNumber = buyerPhoneNumber;
        this.buyerAddress = buyerAddress;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public String getBuyerPhoneNumber() {
        return buyerPhoneNumber;
    }

    public String getBuyerAddress() {
        return buyerAddress;
    }
}
