package ru.yandex.practicum.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageBase {
    WebDriver webDriver;

    public PageBase(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    protected void click(By locator) {
        webDriver.findElement(locator).click();
    }
    protected void type(By locator, String text) {
        webDriver.findElement(locator).sendKeys(text);
    }

    protected void checkLocator(By locator) {
        webDriver.findElement(locator).isEnabled();
    }
}
