package ru.yandex.practicum.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends PageBase{

    public RegistrationPage(WebDriver webDriver) {
        super(webDriver);
    }

    private final String URL_REGISTRATION_PAGE = "https://stellarburgers.nomoreparties.site/register";
    private final By REGISTRATION_HEADER = By.linkText("Регистрация");

    private final By INPUT_NAME_FIELD = By.xpath(".//fieldset/div/div/input");
    private final By INPUT_EMAIL_FIELD = By.xpath(".//fieldset[2]/div/div/input");
    private final By INPUT_PASSWORD_FIELD = By.xpath(".//fieldset[3]/div/div/input");

    private final By SUBMIT_REGISTRATION_BUTTON = By.linkText("Зарегистрироваться");
    private final By SING_IN_LINK = By.linkText("Войти");

}
