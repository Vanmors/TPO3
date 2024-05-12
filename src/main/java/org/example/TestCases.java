package org.example;

import org.openqa.selenium.*;

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
        //todo button - не нужен для firefox
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

    public void waitForAlert(WebDriver driver) {
        int i = 0;
        while (i++ < 5) {
            try {
                driver.switchTo().alert();
                break;
            } catch (NoAlertPresentException e) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
    }

    public void deleteItemFromCert() {
        addItemInCert();
        WebElement deleteItemButton = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/div/div/div[2]/div/div[1]/div[2]/div[2]/div[2]/div[2]/button"));
        deleteItemButton.click();
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
}
