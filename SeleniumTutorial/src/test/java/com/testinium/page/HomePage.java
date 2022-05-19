package com.testinium.page;

import methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HomePage {
    Methods methods;

    public HomePage(){
        methods = new Methods();

    }
    public void homePage(){
        methods.waitBySeconds(3);
        Assert.assertTrue(methods.isElementVisible(By.xpath("//div[@class='logo-icon']")));

    }

    public void goToFavouritePage(){
        methods.hoverWithMouse(By.cssSelector(".my-list .common-sprite"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".menu.my-list.top > ul div >ul > li:nth-of-type(1) > a"));
        methods.waitBySeconds(2);

    }


}
