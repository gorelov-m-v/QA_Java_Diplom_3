package ru.yandex.practicum;

import org.junit.Before;
import org.junit.Test;

public class ConstructorMovingTests extends TestBase {

    @Override
    @Before
    public void setUp() {
        init("MainPage");
    }

    @Test
    public void movingToBunsSection() {
        mainPage.moveToSousesSection();
        mainPage.moveToBunsSection();
        mainPage.checkActiveSection("Булки");
    }

    @Test
    public void movingToSousesSection() {
        mainPage.moveToSousesSection();
        mainPage.checkActiveSection("Соусы");
    }

    @Test
    public void movingToToppingsSection() {
        mainPage.moveToToppingsSection();
        mainPage.checkActiveSection("Начинки");
    }
}
