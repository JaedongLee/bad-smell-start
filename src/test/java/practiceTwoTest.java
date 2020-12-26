import org.junit.Test;
import practiceTwo.Address;
import practiceTwo.AirwayBill;
import practiceTwo.CustomerName;
import static org.junit.Assert.assertEquals;

public class practiceTwoTest {
    @Test
    public void should_show_target_customer_info(){
        Address address = new Address("BeiXinQiao", 1, "BeiJin", "", "10000");
        CustomerName customerName = new CustomerName("sir", "Zhu", "Yuanzhang");
        AirwayBill airwayBill = new AirwayBill();
        airwayBill.setToAddress(address);
        airwayBill.setToCustomerName(customerName);

        String expect = "Customer: " +
                "sir: Zhu Yuanzhang" +
                System.lineSeparator() +
                "Address: " +
                1 + " " +
                "BeiXinQiao" + ", " +
                "BeiJin" + ", " +
                "" + ", " +
                "10000";
        String targetCustomerInfo = airwayBill.showCustomerInfo(true);
        assertEquals(expect, targetCustomerInfo);
    }

    @Test
    public void should_show_source_customer_info(){
        Address address = new Address("BeiXinQiao", 1, "BeiJin", "", "10000");
        CustomerName customerName = new CustomerName("sir", "Zhu", "Yuanzhang");
        AirwayBill airwayBill = new AirwayBill();
        airwayBill.setFromAddress(address);
        airwayBill.setFromCustomerName(customerName);

        String expect = "Customer: " +
                "sir: Zhu Yuanzhang" +
                System.lineSeparator() +
                "Address: " +
                1 + " " +
                "BeiXinQiao" + ", " +
                "BeiJin" + ", " +
                "" + ", " +
                "10000";
        String sourceCustomerInfo = airwayBill.showCustomerInfo(false);
        assertEquals(expect, sourceCustomerInfo);
    }
}
