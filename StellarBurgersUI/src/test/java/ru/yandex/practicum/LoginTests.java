package ru.yandex.practicum;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.practicum.model.LoginData;
import ru.yandex.practicum.model.RegistrationData;
import ru.yandex.practicum.pages.LoginPage;
import ru.yandex.practicum.pages.MainPage;
import ru.yandex.practicum.pages.RegistrationPage;
import java.util.concurrent.TimeUnit;
import static ru.yandex.practicum.util.Randomizer.*;

public class LoginTests {

    WebDriver webDriver;
    String email;
    String password;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        RegistrationPage registrationPage = new RegistrationPage(webDriver);
        RegistrationData registrationData = new RegistrationData(getRandomName(),
                                                                    getRandomEmail(),
                                                                    getRandomPassword(8));
        registrationPage.getRegistrationPage(webDriver);
        registrationPage.fillRegistrationForm(registrationData);
        registrationPage.submitRegistration();
        email = registrationData.getEmail();
        password = registrationData.getPassword();
    }

    @Test
    public void loginFromRegistrationPage() {
        RegistrationPage registrationPage = new RegistrationPage(webDriver);
        LoginPage loginPage = new LoginPage(webDriver);
        MainPage mainPage = new MainPage(webDriver);

        registrationPage.getRegistrationPage(webDriver);
        registrationPage.initLogin();
        loginPage.fillLoginForm(new LoginData(email, password));
        loginPage.submitLogin();

        mainPage.checkPage();
    }

    @After
    public void tearDown() {
        webDriver.quit();
    }
}
