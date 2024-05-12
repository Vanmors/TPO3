package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    private static final String Path_of_Firefox_Driver = "drivers/geckodriver";
    private static final String Path_of_Google_Driver = "drivers/chromedriver-mac-arm64/chromedriver";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Path_of_Google_Driver);
        WebDriver driver = new ChromeDriver(); //Creating an object of FirefoxDriver
        driver.get("https://megamarket.ru");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        TestCases testCases = new TestCases(driver);
        testCases.searchProduct();
    }
}