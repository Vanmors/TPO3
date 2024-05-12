package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MyTest {

    @BeforeAll
    public static void prepareDrivers() {
        Main.prepareDrivers();
    }

    @Test
    void searchProductTest() {
        List<WebDriver> drivers = Main.getDrivers("both");
        drivers.parallelStream().forEach(webDriver -> {
            webDriver.get("https://megamarket.ru");
            webDriver.manage().deleteAllCookies();
            webDriver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
            webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            TestCases testCases = new TestCases();
            testCases.searchProduct(webDriver);
        });
        drivers.forEach(WebDriver::quit);
    }
}