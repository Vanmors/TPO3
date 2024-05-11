package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver-mac-arm64/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://sbermegamarket.ru/");

    }
}