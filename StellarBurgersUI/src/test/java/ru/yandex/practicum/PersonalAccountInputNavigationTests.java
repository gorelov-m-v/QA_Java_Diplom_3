package ru.yandex.practicum;

import org.junit.Before;
import org.junit.Test;
import ru.yandex.practicum.model.LoginData;

public class PersonalAccountInputNavigationTests extends TestBase{

    @Before
    public void setUp() {
        init("RegistrationPage");
        registrationPage.createUser(validRegistrationData);
        getRegistrationData(validRegistrationData);
    }

    @Test
    public void enterToPersonalAccountByAuthorizedUserFromMainPage() {
        loginPage.getLoginPage();
        loginPage.loginByUser(new LoginData(email, password));
        mainPage.checkPage();
        mainPage.initEnterToPersonalAccount();
        personalAccountPage.checkPage();
    }

    @Test
    public void enterToPersonalAccountByUnauthorizedUserFromMainPage() {
        mainPage.getMainPage();
        mainPage.initEnterToPersonalAccount();
        loginPage.checkPage();
    }

}
