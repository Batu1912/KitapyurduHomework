package com.testinium.page;

import javafx.scene.web.WebEngine;
import methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class FavouritesPage extends Methods{

    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);
    public FavouritesPage(){
        methods = new Methods();
    }

    public void clickToFavouritesPage(){
        methods.hoverWithMouse(By.cssSelector(".my-list .common-sprite"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".menu.my-list.top > ul div >ul > li:nth-of-type(1) > a"));
        methods.waitBySeconds(2);
    }

    public void checkTheFavourites(){
        clickToFavouritesPage();
        methods.waitBySeconds(3);
        String str = methods.getText(By.cssSelector("span[class='favorite-tag active']>span"));
        logger.info("Ürün sayisi: " +str);
        Assert.assertEquals("4",str);
    }
    public void deleteFavourite(){
        String attribute = methods.getAttribute(By.xpath("//*[@class='product-cr'][3]"),"id");
        logger.info("id: " + attribute);
        WebElement element = methods.findElement(By.cssSelector("a[onclick='removeFromFavorites("+attribute.substring(8)+");']"));
        jsdriver.executeScript("arguments[0].click();",element);
       // methods.click(By.cssSelector("a[onclick='removeFromFavorites("+attribute.substring(8)+");']"));
        methods.waitBySeconds(3);

    }



}
