package ru.yandex.practicum;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.practicum.model.RegistrationData;
import ru.yandex.practicum.pages.LoginPage;
import ru.yandex.practicum.pages.RegistrationPage;
import java.util.concurrent.TimeUnit;
import static ru.yandex.practicum.util.Randomizer.*;

public class RegistrationTests {

    WebDriver webDriver;


    @Before
    public void setUp() {
        RegistrationPage registrationPage = new RegistrationPage(webDriver);
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        registrationPage.getRegistrationPage(webDriver);
    }

    @Test
    public void positiveRegistrationTest() {
        RegistrationPage registrationPage = new RegistrationPage(webDriver);
        LoginPage loginPage = new LoginPage(webDriver);

        registrationPage.fillRegistrationForm(new RegistrationData(getRandomName(),
                                                                   getRandomEmail(),
                                                                   getRandomPassword(8)));
        registrationPage.submitRegistration();

        loginPage.checkPage();
    }

    @Test
    public void negativeRegistrationTest() {
        RegistrationPage registrationPage = new RegistrationPage(webDriver);

        registrationPage.fillRegistrationForm(new RegistrationData(getRandomName(),
                                                                   getRandomEmail(),
                                                                   getRandomPassword(5)));
        registrationPage.submitRegistration();

        registrationPage.checkWrongPasswordMessage();
    }

        @After
    public void tearDown() {
        webDriver.quit();
    }
}
