package ru.yandex.practicum;

import org.junit.Before;
import org.junit.Test;
import ru.yandex.practicum.model.LoginData;
import ru.yandex.practicum.model.RegistrationData;

import static ru.yandex.practicum.util.Randomizer.*;

public class LoginTests extends TestBase{

    @Before
    public void setUp() {
        init("RegistrationPage");
        RegistrationData registrationData = new RegistrationData(getRandomName(),
                                                                 getRandomEmail(),
                                                                 getRandomPassword(8));
        registrationPage.createUser(registrationData);
        getRegistrationData(registrationData);
    }

    @Test
    public void loginFromRegistrationPage() {
        registrationPage.getRegistrationPage();
        registrationPage.initLogin();
        loginPage.loginByUser(new LoginData(email, password));
        mainPage.checkPage();
    }
}
