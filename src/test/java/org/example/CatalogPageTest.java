package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CatalogPageTest {
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
            CatalogPage catalogPage = new CatalogPage(webDriver);
            catalogPage.searchProduct();
        });
        //drivers.forEach(WebDriver::quit);
    }

    @Test
    void addItemInCertTest() {
        List<WebDriver> drivers = Main.getDrivers("both");
        drivers.parallelStream().forEach(webDriver -> {
            webDriver.get("https://megamarket.ru");
            webDriver.manage().deleteAllCookies();
            webDriver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
            webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            CatalogPage catalogPage = new CatalogPage(webDriver);
            catalogPage.addItemInCert();
        });
        //drivers.forEach(WebDriver::quit);
    }

    @Test
    void addToFavoritesTest() {
        List<WebDriver> drivers = Main.getDrivers("both");
        drivers.parallelStream().forEach(webDriver -> {
            webDriver.get("https://megamarket.ru");
            webDriver.manage().deleteAllCookies();
            webDriver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
            webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            CatalogPage catalogPage = new CatalogPage(webDriver);
            catalogPage.favourites();
        });
        //drivers.forEach(WebDriver::quit);
    }

    @Test
    void checkFiltersTest() {
        List<WebDriver> drivers = Main.getDrivers("both");
        drivers.parallelStream().forEach(webDriver -> {
            webDriver.get("https://megamarket.ru");
            webDriver.manage().deleteAllCookies();
            webDriver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
            webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            CatalogPage catalogPage = new CatalogPage(webDriver);
            catalogPage.filters();
        });
        //drivers.forEach(WebDriver::quit);
    }

    @Test
    void compareTest() {
        List<WebDriver> drivers = Main.getDrivers("both");
        drivers.parallelStream().forEach(webDriver -> {
            webDriver.get("https://megamarket.ru");
            webDriver.manage().deleteAllCookies();
            webDriver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
            webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            CatalogPage catalogPage = new CatalogPage(webDriver);
            catalogPage.compare();
        });
        //drivers.forEach(WebDriver::quit);
    }
}
