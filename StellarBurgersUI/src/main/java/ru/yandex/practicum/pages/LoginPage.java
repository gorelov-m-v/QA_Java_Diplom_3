package ru.yandex.practicum.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.yandex.practicum.model.LoginData;

public class LoginPage extends PageBase{

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    private final String URL_LOGIN_PAGE = "https://stellarburgers.nomoreparties.site/login";

    private final By INPUT_EMAIL_FIELD = By.xpath(".//fieldset/div/div/input");
    private final By INPUT_PASSWORD_FIELD = By.xpath(".//input[@name='Пароль']");

    private final By SUBMIT_LOGIN_BUTTON = By.xpath(".//button");
    private final By REGISTRATION_LINK = By.linkText("Зарегистрироваться");
    private final By RECOVER_PASSWORD_LINK = By.linkText("Восстановить пароль");

    private final By ENTER_HEADER = By.xpath("//h2");

    public void fillRegistrationForm(LoginData loginData) {
        type(INPUT_EMAIL_FIELD, loginData.getEmail());
        type(INPUT_PASSWORD_FIELD, loginData.getPassword());
    }

    public void checkPage() {
        checkLocator(ENTER_HEADER);
    }

    public void getLoginPage(WebDriver webDriver) {
        webDriver.get(URL_LOGIN_PAGE);
    }

    public void fillLoginForm(LoginData loginData) {
        type(INPUT_EMAIL_FIELD, loginData.getEmail());
        type(INPUT_PASSWORD_FIELD, loginData.getPassword());
    }

    public void submitLogin() {
        click(SUBMIT_LOGIN_BUTTON);
    }

}
