package ru.yandex.practicum;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.practicum.pages.LoginPage;
import ru.yandex.practicum.pages.MainPage;
import ru.yandex.practicum.pages.RegistrationPage;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver webDriver = new ChromeDriver();
    RegistrationPage registrationPage = new RegistrationPage(webDriver);
    LoginPage loginPage = new LoginPage(webDriver);
    MainPage mainPage = new MainPage(webDriver);

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
    @After
    public void tearDown() {
        close();
    }
}
