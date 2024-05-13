package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CatalogPage extends Page {

    public CatalogPage(WebDriver driver) {
        super(driver);
    }

    public void searchProduct() {
        WebElement input = driver.findElement(By.xpath("//input[@placeholder='Искать товары']"));
        input.sendKeys("утюг");
        input.sendKeys(Keys.ENTER);
    }

    public void addItemInCert() {
        WebElement buttonCookie = driver.findElement(By.xpath("//button[@class='cookie__button c-button c-button_theme_primary c-button_size_small']"));
        buttonCookie.click();
        WebElement input = driver.findElement(By.xpath("//input[@placeholder='Искать товары']"));
        input.sendKeys("Apple Macbook Air");
        input.sendKeys(Keys.ENTER);
        WebElement firstMacBook = driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div/div[1]/div[2]/div/div[2]/div[2]/div[2]/div[3]/div/div[1]/div[1]/a/div/img"));
        firstMacBook.click();

        WebElement buyButton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div/div[1]/div[10]/div[2]/button"));
        buyButton.click();
        WebElement continueBuyHref = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div/div/div/div[1]/div/div/div[2]/a[1]/span"));
        continueBuyHref.click();
    }

    public void favourites() {
        WebElement buttonCookie = driver.findElement(By.xpath("//button[@class='cookie__button c-button c-button_theme_primary c-button_size_small']"));
        buttonCookie.click();
        WebElement input = driver.findElement(By.xpath("//input[@placeholder='Искать товары']"));
        input.sendKeys("Apple Macbook Air");
        input.sendKeys(Keys.ENTER);
        WebElement favouriteItemButton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div/div[1]/div[2]/div/div[2]/div[2]/div[2]/div[3]/div/div[1]/div[1]/div/div[1]"));
        favouriteItemButton.click();
        WebElement favouritesButton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[1]/div[1]/div/div/div/div/div[6]/div/a"));
        favouritesButton.click();
    }

    public void filters() {
        searchProduct();
        WebElement openFilterButton = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div[1]/div[3]/div/div[2]/div[2]/div[2]/div[1]/div/div/div/button[2]"));
        openFilterButton.click();
        WebElement filterOnButton = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div[1]/div[3]/div/div[2]/div[2]/div[1]/div/div/div[2]/div[2]/div[1]/div[3]/div[7]/div/div/div/div/div[1]/div"));
        filterOnButton.click();
        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div[1]/div[3]/div/div[2]/div[2]/div[1]/div/div/div[2]/div[3]/button"));
        submitButton.click();
    }

    public void compare() {
        searchProduct();
        WebElement addFirstElement = driver.findElement(By.xpath("//*[@id=\"100023592821_60344\"]/div[1]/div[2]/div[2]/div/div"));
        addFirstElement.click();
        WebElement addSecondElement = driver.findElement(By.xpath("//*[@id=\"100028453185_84608\"]/div[1]/div/div[2]/div/div"));
        addSecondElement.click();
        WebElement compareButton = driver.findElement(By.xpath("//*[@id=\"compare\"]/div[2]/a/div"));
        compareButton.click();
    }
}
