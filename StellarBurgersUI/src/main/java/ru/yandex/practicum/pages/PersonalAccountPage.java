package ru.yandex.practicum.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PersonalAccountPage extends PageBase {

    public PersonalAccountPage(WebDriver webDriver) {
        super(webDriver);
    }

    private final String URL_PERSONAL_ACCOUNT_PAGE = "https://stellarburgers.nomoreparties.site/account/profile";

    private final By CHANGE_NAME_FIELD = By.xpath(".//li/div/div/div");
    private final By CHANGE_EMAIL_FIELD = By.xpath(".//li[2]/div/div/div");
    private final By CHANGE_PASSWORD_FIELD = By.xpath(".//li[3]/div/div/div");

    private final By PERSONAL_ACCOUNT_INFO = By.linkText("В этом разделе вы можете изменить свои персональные данные");
}
