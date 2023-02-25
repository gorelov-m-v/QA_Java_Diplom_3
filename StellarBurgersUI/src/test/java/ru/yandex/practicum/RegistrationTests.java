package ru.yandex.practicum;

import org.junit.Before;
import org.junit.Test;
import ru.yandex.practicum.model.RegistrationData;
import static ru.yandex.practicum.util.Randomizer.*;

public class RegistrationTests extends TestBase {

    @Override
    @Before
    public void setUp() {
        init("RegistrationPage");
    }
    @Test
    public void positiveRegistrationTest() {
        registrationPage.createUser(new RegistrationData(getRandomName(),
                                                         getRandomEmail(),
                                                         getRandomPassword(8)));
        loginPage.checkPage();
    }

    @Test
    public void negativeRegistrationTest() {
        registrationPage.createUser(new RegistrationData(getRandomName(),
                                                         getRandomEmail(),
                                                         getRandomPassword(5)));
        registrationPage.checkWrongPasswordMessage();
    }
}
