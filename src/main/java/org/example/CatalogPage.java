package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CatalogPage extends Page {
    private String itemProduct =  "Apple Macbook Air";
    private String searchProduct = "утюг";

    private By inputLinePath = By.xpath("//input[@placeholder='Искать товары']");
    private By buttonCookieElementPath = By.xpath("//button[@class='cookie__button c-button c-button_theme_primary c-button_size_small']");
    private By firstMacbookPath = By.xpath("//div[@class=\"catalog-items-list\"]/div[1]/div/a");
    private By buyButtonPath = By.xpath("//div[@class=\"catalog-buy-button catalog-buy-button_default catalog-buy-button_orientation-vertical catalog-buy-button_width-full\"]/button");
    private By favouriteItemButtonPath = By.xpath("//div[@class=\"catalog-items-list\"]/div[1]/div[1]/div[1]/div[1]");
    private By allFavouritesButtonPath = By.xpath("//a[@href=\"/personal/favorites/\"]");

    private By openFilterPath = By.xpath("//*[@class=\"floating-element__element\"]/div/button[2]");
    private By filterOnPath = By.xpath("//*[@class=\"pui-toggle-control pui-toggle-control\"]");
    private By submitPath = By.xpath("//*[@class=\"filter-footer\"]/button");
    public CatalogPage(WebDriver driver) {
        super(driver);
    }

    public void searchProduct() {
        WebElement input = driver.findElement(inputLinePath);
        input.sendKeys(searchProduct);
        input.sendKeys(Keys.ENTER);
    }

    private void clickOnMacBook(){
        WebElement buttonCookie = driver.findElement(buttonCookieElementPath);
        buttonCookie.click();
        WebElement input = driver.findElement(inputLinePath);
        input.sendKeys(itemProduct);
        input.sendKeys(Keys.ENTER);
    }

    public void addItemInCert() {
        clickOnMacBook();
        WebElement firstMacBook = driver.findElement(firstMacbookPath);
        firstMacBook.click();
        WebElement buyButton = driver.findElement(buyButtonPath);
        buyButton.click();
    }

    public void favourites() {
        clickOnMacBook();
        WebElement favouriteItemButton = driver.findElement(favouriteItemButtonPath);
        favouriteItemButton.click();
        WebElement favouritesButton = driver.findElement(allFavouritesButtonPath);
        favouritesButton.click();
    }

    public void filters() {
        searchProduct();
        WebElement openFilterButton = driver.findElement(openFilterPath);
        openFilterButton.click();
        WebElement filterOnButton = driver.findElement(filterOnPath);
        filterOnButton.click();
        WebElement submitButton = driver.findElement(submitPath);
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
