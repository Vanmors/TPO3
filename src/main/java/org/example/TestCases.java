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
        WebElement input = driver.findElement(By.xpath("//input[@placeholder='Искать товары']"));
        input.sendKeys("утюг");
        input.sendKeys(Keys.ENTER);
    }

    public void changeAdress() {
//        WebElement input = driver.findElement(By.xpath("//input[@class='svg-icon mobile-header-delivery-address__icon']"));

        WebElement buttonCookie = driver.findElement(By.xpath("//button[@class='cookie__button c-button c-button_theme_primary c-button_size_small']"));
        buttonCookie.click();
        WebElement button = driver.findElement(By.xpath("//button[@class='btn-bordered header-region-selector-view__footer-cancel xs']"));
        button.click();
        WebElement input = driver.findElement(By.xpath("//input[@placeholder='Регион или город']"));
        input.sendKeys(" Санкт-Петербург");
        WebElement submitRegion = driver.findElement(By.xpath("//button[@class='header-region-selector-change__form-submit btn']"));
        WebElement inputRegion = driver.findElement(By.xpath("//div[@class='select field opened filterable lg']/div[2]/ul/li[1]"));
        inputRegion.click();
        submitRegion.click();
    }
}
