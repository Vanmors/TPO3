package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCases {
    protected WebDriver driver;

    public TestCases(WebDriver webDriver) {
        this.driver = webDriver;
    }

    public void searchProduct() {
        WebElement input = driver.findElement(By.xpath("//input[@placeholder='Искать товары']"));//name locator for text box
        input.sendKeys("утюг");
        input.sendKeys(Keys.ENTER);
    }
}
