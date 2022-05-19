package com.testinium.page;

import methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class BasketPage {
    Methods methods;

    public BasketPage(){
        methods = new Methods();

    }

    public void goToBasket(){
        methods.click(By.id("cart"));
        methods.waitBySeconds(3);
        methods.click(By.id("js-cart"));
    }

    public void raiseProductNumber(By by,String amount){
        methods.findElement(by).sendKeys(Keys.chord(Keys.CONTROL, "a",Keys.DELETE),amount);
        methods.click(By.cssSelector("[title='Güncelle']"));
        methods.waitBySeconds(2);
    }

}
