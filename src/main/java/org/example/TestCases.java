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

    public void changeAddress() {
        WebElement buttonCookie = driver.findElement(By.xpath("//button[@class='cookie__button c-button c-button_theme_primary c-button_size_small']"));
        buttonCookie.click();
        WebElement button = driver.findElement(By.xpath("//button[@class='btn-bordered header-region-selector-view__footer-cancel xs']"));
        button.click();
        WebElement input = driver.findElement(By.xpath("//input[@placeholder='Регион или город']"));
        input.sendKeys(" Санкт-Петербург");
        input.click();
        WebElement submitRegion = driver.findElement(By.xpath("//button[@class='header-region-selector-change__form-submit btn']"));
        WebElement inputRegion = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div/div/div/div/div/div/div/form/div/div/div[2]/ul/li"));
        inputRegion.click();
        submitRegion.click();
    }

    public void addAddress() {
        changeAddress();
        WebElement buttonRegion = driver.findElement(By.xpath("//*[@id=\"page-header\"]/div[1]/div[2]/div/div/div/div[1]"));
        buttonRegion.click();
        WebElement buttonAddress = driver.findElement(By.xpath("//button[@class='header-region-selector-view__address-block-button btn-bordered btn-block']"));
        buttonAddress.click();
        WebElement addressInput = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div/div[2]/div[1]/div/div/form/div/input"));
        addressInput.sendKeys("Санкт-Петербург, Кронверкский проспект, 49");
        WebElement chooseAddress = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div/div[2]/div[1]/div/div/form/div[2]/ul/li/a"));
        chooseAddress.click();
        WebElement buttonSubmitAddress = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div/div[2]/div[3]/button"));
        buttonSubmitAddress.click();

        WebElement buttonClose = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div/button"));
        buttonClose.click();

    }
}
