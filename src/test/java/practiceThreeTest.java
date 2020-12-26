import org.junit.Test;
import practiceThree.Deliver;
import practiceThree.Order;

import static org.junit.Assert.assertTrue;

public class practiceThreeTest {
    @Test
    public void should_return_true_given_same_buyer(){
        String buyer = "buyer";
        String buyerPhoneNumber = "13131313131";
        String buyerAddress = "BeiJin";
        Order order = new Order(buyer, buyerPhoneNumber, buyerAddress);
        Deliver deliver = new Deliver(12345, "120", 60d, buyer, buyerPhoneNumber, buyerAddress);

        assertTrue(order.sameBuyer(deliver.getBuyerName(), deliver.getBuyerPhoneNumber(), deliver.getBuyerAddress()));
    }
}
