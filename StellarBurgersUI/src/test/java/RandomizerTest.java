import org.junit.Test;

import static ru.yandex.practicum.util.Menu.*;
import static ru.yandex.practicum.util.Randomizer.*;


public class RandomizerTest {

    @Test
    public void printRandomListOfSouses() {
        System.out.println(getRandomListOfSouses(SOUSES_ARRAY));
        System.out.println(getRandomListOfToppings(TOPPINGS_ARRAY));
        System.out.println(getRandomBun(BUNS_ARRAY));
        System.out.println(getRandomName());
        System.out.println(getRandomEmail());
        System.out.println(getRandomPassword(8));
    }
}
