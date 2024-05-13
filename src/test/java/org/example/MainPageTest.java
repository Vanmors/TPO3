package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainPageTest {
    @BeforeAll
    public static void prepareDrivers() {
        Main.prepareDrivers();
    }

    @Test
    void changeAddressTest() {
        List<WebDriver> drivers = Main.getDrivers("chrome");
        drivers.parallelStream().forEach(webDriver -> {
            webDriver.get("https://megamarket.ru");
            webDriver.manage().deleteAllCookies();
            webDriver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
            webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            MainPage mainPage = new MainPage(webDriver);
            mainPage.changeAddress();
        });
        drivers.forEach(WebDriver::quit);
    }

    @Test
    void addAddressTest() {
        List<WebDriver> drivers = Main.getDrivers("chrome");
        drivers.parallelStream().forEach(webDriver -> {
            webDriver.get("https://megamarket.ru");
            webDriver.manage().deleteAllCookies();
            webDriver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
            webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            MainPage mainPage = new MainPage(webDriver);
            mainPage.addAddress();
        });
        drivers.forEach(WebDriver::quit);
    }
}
