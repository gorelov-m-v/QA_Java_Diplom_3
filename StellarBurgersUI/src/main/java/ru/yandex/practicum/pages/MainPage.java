package ru.yandex.practicum.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends PageBase {

    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    private final String URL_MAIN_PAGE = "https://stellarburgers.nomoreparties.site/";

    private final By PERSONAL_ACCOUNT_LINK = By.xpath(".//a[contains(@href, '/account')]");
    private final By BUNS_LINK = By.xpath(".//div[@id='root']/div/main/section/div/div/span");
    private final By SOUSES_LINK = By.xpath(".//div[@id='root']/div/main/section/div/div[2]/span");
    private final By TOPPINGS_LINK = By.xpath(".//div[@id='root']/div/main/section/div/div[3]/span");


    private final By ENTER_TO_ACCOUNT_BUTTON = By.xpath(".//div[@id='root']/div/main/section[2]/div/button");
    private final By ACTIVE_SECTION = By.xpath(".//div[@class='tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']");
    private final By SUBMIT_ORDER = By.xpath(".//button");

    public void checkPage() {
        checkLocator(SUBMIT_ORDER);
    }
    public void getMainPage() {
        getPage(URL_MAIN_PAGE);
    }
    public void initLogin() {
        click(ENTER_TO_ACCOUNT_BUTTON);
    }

    public void initEnterToPersonalAccount() {
        click(PERSONAL_ACCOUNT_LINK);
    }

    public void moveToBunsSection() {
        click(BUNS_LINK);
    }

    public void moveToToppingsSection() {
        click(TOPPINGS_LINK);
    }

    public void moveToSousesSection() {
        click(SOUSES_LINK);
    }

    public void checkActiveSection(String section) {
        Assert.assertEquals(section, getText(ACTIVE_SECTION));
    }
}
