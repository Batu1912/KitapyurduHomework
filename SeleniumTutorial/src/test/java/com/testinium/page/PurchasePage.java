package com.testinium.page;

import methods.Methods;
import org.openqa.selenium.By;

public class PurchasePage {
    Methods methods;

    public PurchasePage(){
        methods = new Methods();
    }
        public void getPurchasePage(){
            methods.click(By.cssSelector(".right > .button.red"));
        }
        public void registerAddress(){
            methods.sendKeys(By.id("address-firstname-companyname"),"Batuhan");
            methods.sendKeys(By.id("address-lastname-title"),"Aci");
            methods.selectItemFromDropBox(By.id("adress-zone-id"),"İstanbul");
            methods.waitBySeconds(3);
            methods.selectItemFromDropBox(By.id("/html//select[@id='address-country-id']"),"KARTAL");
            methods.waitBySeconds(3);
            methods.sendKeys(By.id("address-address-text"),"Soganlık yeni mah. Pamukkale sok. No:11");
            methods.sendKeys(By.id("address-telephone"),"1234567");
            methods.sendKeys(By.id("address-mobile-telephone"),"5386664494");
            methods.waitBySeconds(3);
            methods.click(By.id("button-checkout-continue"));
            methods.waitBySeconds(3);
            methods.click(By.id("button-checkout-continue"));
        }
        public void paymentStep(){
            methods.sendKeys(By.id("credit-card-owner"),"Bob Marley Faruk");
            methods.sendKeys(By.id("credit-card-number_1"),"1912");
            methods.sendKeys(By.id("credit-card-number_2"),"1912");
            methods.sendKeys(By.id("credit-card-number_3"),"1912");
            methods.sendKeys(By.id("credit-card-number_4"),"1912");
            methods.selectItemFromDropBox(By.id("credit-card-expire-date-month"),"11");
            methods.selectItemFromDropBox(By.id("credit-card-expire-date-year"),"2042");
            methods.sendKeys(By.id("credit-card-security-code"),"1912");
            methods.waitBySeconds(3);

    }
}
