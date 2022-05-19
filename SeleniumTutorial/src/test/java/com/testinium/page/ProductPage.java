package com.testinium.page;

import methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static com.testinium.driver.BaseTest.driver;

public class ProductPage {

    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);

    public ProductPage() {
        methods = new Methods();
    }

    public void Search(String key) {
        methods.sendKeys(By.id("search-input"), key);
        methods.waitBySeconds(1);
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitBySeconds(1);

    }

    public void search() {
        methods.sendKeys(By.id("search-input"), "Oyuncak");
        methods.click(By.cssSelector(".button-search"));
    }

    public void scrollToSeventh() {
        methods.scrollWithAction(By.cssSelector("div:nth-of-type(7) > .grid_7.omega"));
        methods.waitBySeconds(3);
    }

    public void addFavourites() {
        methods.addFavourites(By.cssSelector("a[class='add-to-favorites']"));
        methods.waitBySeconds(3);
    }

}







