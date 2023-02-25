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

    private final By PERSONAL_ACCOUNT_INFO = By.xpath(".//li/a[@href='/account/profile']");
    private final By STELLAR_BURGERS_LOGO = By.className("AppHeader_header__logo__2D0X2");
    private  final By CONSTRUCTOR_LINK = By.xpath(".//a[@href='/']");
    public void checkPage() {
        checkLocator(PERSONAL_ACCOUNT_INFO);
    }

    public void initTransitionToMainPageByLogo() {
        click(STELLAR_BURGERS_LOGO);
    }

    public void initTransitionToMainPageByConstructorLink() {
        click(CONSTRUCTOR_LINK);
    }
}
