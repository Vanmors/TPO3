package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    private final static String PATH_FIREFOX_WEBDRIVER = "drivers/geckodriver.exe";
    private final static String FIREFOX_WEBDRIVER_NAME = "webdriver.gecko.driver";
    //private static final String PATH_OF_GOOGLE_DRIVER = "drivers/chromedriver-mac-arm64/chromedriver";
    private static final String PATH_OF_GOOGLE_DRIVER = "drivers/chromedriver.exe";
    private final static String GOOGLE_WEBDRIVER_NAME = "webdriver.chrome.driver";

    public static void main(String[] args) {
        //System.setProperty(FIREFOX_WEBDRIVER_NAME, PATH_FIREFOX_WEBDRIVER);
        System.setProperty(GOOGLE_WEBDRIVER_NAME, PATH_OF_GOOGLE_DRIVER);
        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new FirefoxDriver();
        driver.get("https://megamarket.ru");
//        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        TestCases testCases = new TestCases(driver);
        //testCases.searchProduct();
        //testCases.changeAddress();
        //testCases.addAddress();
        testCases.addItemInCert();
    }
}