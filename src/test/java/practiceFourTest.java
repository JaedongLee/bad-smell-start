import org.junit.Test;
import practiceFour.*;

import static org.junit.Assert.assertEquals;

public class practiceFourTest {
    @Test
    public void should_get_an_egg_given_animal_is_chicken(){
        Animal chicken = new Chicken();
        assertEquals("Get an egg.", chicken.layEgg());
    }

    @Test
    public void should_get_milk_given_animal_is_cow(){
        Animal cow = new Cow();
        assertEquals("Get milk.", cow.milk());
    }

    @Test
    public void should_get_an_egg_given_animal_is_duck(){
        Animal duck = new Duck();
        assertEquals("Get an egg.", duck.layEgg());
    }

    @Test
    public void should_get_milk_given_animal_is_goat(){
        Animal goat = new Goat();
        assertEquals("Get milk.", goat.milk());
    }
}
