package ru.yandex.practicum;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.practicum.model.RegistrationData;
import ru.yandex.practicum.pages.*;

import java.util.concurrent.TimeUnit;

import static ru.yandex.practicum.util.Randomizer.*;

public class TestBase {

    WebDriver webDriver = new ChromeDriver();
    RegistrationPage registrationPage = new RegistrationPage(webDriver);
    LoginPage loginPage = new LoginPage(webDriver);
    MainPage mainPage = new MainPage(webDriver);
    PasswordRecoveryPage passwordRecoveryPage = new PasswordRecoveryPage(webDriver);
    PersonalAccountPage personalAccountPage = new PersonalAccountPage(webDriver);
    RegistrationData validRegistrationData = new RegistrationData(getRandomName(),
                                                                  getRandomEmail(),
                                                                  getRandomPassword(8));
    String email;
    String password;

    public void init(String page) {
        WebDriverManager.chromedriver().setup();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        if (page.equals("RegistrationPage")) {
            registrationPage.getRegistrationPage();
        } else if (page.equals("LoginPage")) {
        }
    }

    public void close() {
        webDriver.quit();
    }

    public void getRegistrationData(RegistrationData registrationData) {
        email = registrationData.getEmail();
        password = registrationData.getPassword();
    }
    @After
    public void tearDown() {
        close();
    }
}
