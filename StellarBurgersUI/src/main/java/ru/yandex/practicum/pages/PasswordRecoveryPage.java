package ru.yandex.practicum.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PasswordRecoveryPage extends PageBase{

    public PasswordRecoveryPage(WebDriver webDriver) {
        super(webDriver);
    }

    private final String URL_PASSWORD_RECOVERY_PAGE = "https://stellarburgers.nomoreparties.site/forgot-password";
    private final By ENTER_LINK = By.linkText("Войти");


    public void getPasswordRecoveryPage() {
        getPage(URL_PASSWORD_RECOVERY_PAGE);
    }

    public void initLogin() {
        click(ENTER_LINK);
    }
}
