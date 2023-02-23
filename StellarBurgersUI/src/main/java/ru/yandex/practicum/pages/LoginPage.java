package ru.yandex.practicum.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase{

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    private final String URL_LOGIN_PAGE = "https://stellarburgers.nomoreparties.site/login";

    private final By INPUT_EMAIL_FIELD = By.xpath(".//fieldset/div/div/input");
    private final By INPUT_PASSWORD_FIELD = By.xpath(".//fieldset[2]/div/div");

    private final By ENTER_BUTTON = By.linkText("Войти");
    private final By REGISTRATION_LINK = By.linkText("Зарегистрироваться");
    private final By RECOVER_PASSWORD_LINK = By.linkText("Восстановить пароль");

    private final By ENTER_HEADER = By.linkText("Вход");
}
