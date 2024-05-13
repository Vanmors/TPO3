package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CertPage extends Page {

    public CertPage(WebDriver driver) {
        super(driver);
    }

    public void deleteItemFromCert() {
        new CatalogPage(driver).addItemInCert();
        WebElement deleteItemButton = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/div/div/div[2]/div/div[1]/div[2]/div[2]/div[2]/div[2]/button"));
        deleteItemButton.click();
    }
}
