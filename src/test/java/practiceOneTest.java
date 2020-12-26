import org.junit.Test;
import practiceOne.User;

import static org.junit.Assert.assertEquals;

public class practiceOneTest {
    @Test
    public void should_introduce_user_address_and_sex(){
        User user = new User("male", new String[]{"1", "2", "3"});
        user.setAd("BeiJin");

        String actual = user.introduce();
        assertEquals("address: BeiJin. sex: male", actual);
    }

    @Test
    public void should_show_all_car_number(){
        String[] carNumbers = {"1", "2", "3"};
        User user = new User("male", carNumbers);
        user.setAd("BeiJin");

        String actual = user.showCarNumber();
        String expect = "car number: 1\n" +
                "car number: 2\n" +
                "car number: 3\n";
        assertEquals(expect, actual);
    }
}
