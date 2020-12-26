import org.junit.Test;
import practiceFive.Baby;
import practiceFive.HumanAble;

import static org.junit.Assert.assertEquals;

public class practiceFiveTest {
    @Test
    public void should_like_a_human_given_a_baby(){
            HumanAble baby = new Baby();
            baby.cry();
            baby.drink();
            baby.cry();
            baby.eat();
            baby.cry();
            baby.snore();
            baby.cry();
            baby.drink();
            baby.drink();
            baby.eat();

            long cryTimes = ((Baby) baby).getTimes("CRY");
            long eatTimes = ((Baby) baby).getTimes("EAT");
            long drinkTimes = ((Baby) baby).getTimes("DRINK");
            long snoreTimes = ((Baby) baby).getTimes("SNORE");
            assertEquals(4, cryTimes);
            assertEquals(3, drinkTimes);
            assertEquals(2, eatTimes);
            assertEquals(1, snoreTimes);
    }

}
