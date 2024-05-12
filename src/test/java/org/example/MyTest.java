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
    //okay
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

    @Test
    void changeAddressTest() {
        List<WebDriver> drivers = Main.getDrivers("firefox");
        drivers.parallelStream().forEach(webDriver -> {
            webDriver.get("https://megamarket.ru");
            webDriver.manage().deleteAllCookies();
            webDriver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
            webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            TestCases testCases = new TestCases();
            try {
                testCases.changeAddress(webDriver);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        });
        //drivers.forEach(WebDriver::quit);
    }

    @Test
    void addAddressTest() {
        List<WebDriver> drivers = Main.getDrivers("both");
        drivers.parallelStream().forEach(webDriver -> {
            webDriver.get("https://megamarket.ru");
            webDriver.manage().deleteAllCookies();
            webDriver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
            webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            TestCases testCases = new TestCases();
            testCases.addAddress(webDriver);
        });
        drivers.forEach(WebDriver::quit);
    }

    @Test
    void addItemInCertTest() {
        List<WebDriver> drivers = Main.getDrivers("both");
        drivers.parallelStream().forEach(webDriver -> {
            webDriver.get("https://megamarket.ru");
            webDriver.manage().deleteAllCookies();
            webDriver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
            webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            TestCases testCases = new TestCases();
            testCases.addItemInCert(webDriver);
        });
        drivers.forEach(WebDriver::quit);
    }

    @Test
    void deleteItemFromCertTest() {
        List<WebDriver> drivers = Main.getDrivers("both");
        drivers.parallelStream().forEach(webDriver -> {
            webDriver.get("https://megamarket.ru");
            webDriver.manage().deleteAllCookies();
            webDriver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
            webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            TestCases testCases = new TestCases();
            testCases.deleteItemFromCert(webDriver);
        });
        drivers.forEach(WebDriver::quit);
    }

    @Test
    void favouritesTest() {
        List<WebDriver> drivers = Main.getDrivers("both");
        drivers.parallelStream().forEach(webDriver -> {
            webDriver.get("https://megamarket.ru");
            webDriver.manage().deleteAllCookies();
            webDriver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
            webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            TestCases testCases = new TestCases();
            testCases.favourites(webDriver);
        });
        drivers.forEach(WebDriver::quit);
    }
}