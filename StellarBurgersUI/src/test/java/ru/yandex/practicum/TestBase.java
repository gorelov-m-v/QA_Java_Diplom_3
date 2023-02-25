package ru.yandex.practicum;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.practicum.model.RegistrationData;
import ru.yandex.practicum.pages.LoginPage;
import ru.yandex.practicum.pages.MainPage;
import ru.yandex.practicum.pages.PageBase;
import ru.yandex.practicum.pages.RegistrationPage;

import java.util.concurrent.TimeUnit;

public class TestBase {

    WebDriver webDriver = new ChromeDriver();
    RegistrationPage registrationPage = new RegistrationPage(webDriver);
    LoginPage loginPage = new LoginPage(webDriver);
    MainPage mainPage = new MainPage(webDriver);
    PageBase pageBase = new PageBase(webDriver);
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
