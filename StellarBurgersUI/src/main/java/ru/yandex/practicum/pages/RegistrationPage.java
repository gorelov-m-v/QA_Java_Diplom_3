package ru.yandex.practicum.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.yandex.practicum.model.RegistrationData;

public class RegistrationPage extends PageBase{

    public RegistrationPage(WebDriver webDriver) {
        super(webDriver);
    }

    public static final String URL_REGISTRATION_PAGE = "https://stellarburgers.nomoreparties.site/register";
    private final By REGISTRATION_HEADER = By.linkText("Регистрация");
    private final By WRONG_PASSWORD_MESSAGE = By.xpath("//*[@id='root']/div/main/div/form/fieldset[3]/div/p");

    private final By INPUT_NAME_FIELD = By.xpath(".//fieldset/div/div/input");
    private final By INPUT_EMAIL_FIELD = By.xpath(".//fieldset[2]/div/div/input");
    private final By INPUT_PASSWORD_FIELD = By.xpath(".//fieldset[3]/div/div/input");

    private final By SUBMIT_REGISTRATION_BUTTON = By.xpath(".//button");
    private final By SING_IN_LINK = By.linkText("Войти");

    public void fillRegistrationForm(RegistrationData registrationData) {
        type(INPUT_NAME_FIELD, registrationData.getName());
        type(INPUT_EMAIL_FIELD, registrationData.getEmail());
        type(INPUT_PASSWORD_FIELD, registrationData.getPassword());
    }

    public void submitRegistration() {
        click(SUBMIT_REGISTRATION_BUTTON);
    }

    public void checkWrongPasswordMessage() {
        checkLocator(WRONG_PASSWORD_MESSAGE);
    }

    public void getRegistrationPage() {
        getPage(URL_REGISTRATION_PAGE);
    }

    public void initLogin() {
        click(SING_IN_LINK);
    }

    public void createUser(RegistrationData registrationData) {
        fillRegistrationForm(registrationData);
        submitRegistration();
    }
}
