/* 以下代码有什么坏味道？ */

package practiceTwo;

public class AirwayBill { // 快递单
    private CustomerName toCustomerName;
    private CustomerName fromCustomerName;
    private Address toAddress;
    private Address fromAddress;

    public String showCustomerInfo(boolean toOrFrom) {
        if (toOrFrom) {
            return toCustomerName.toString() +
                    System.lineSeparator() +
                    toAddress.toString();
        } else {
            return fromCustomerName.toString() +
                    System.lineSeparator() +
                    fromAddress.toString();
        }
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
