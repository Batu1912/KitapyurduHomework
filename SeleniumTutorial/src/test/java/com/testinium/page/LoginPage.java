package com.testinium.page;

import methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.testinium.driver.BaseTest.driver;

public class LoginPage {


    Methods methods;


    public LoginPage(){
        methods = new Methods();

    }

    public void Login(){

        methods.click(By.cssSelector(".login.menu-top-button"));
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("login-email"),"batuhan.aci@testinium.com");
        methods.waitBySeconds(1);
        methods.sendKeys(By.xpath("//input[@id='login-password']"),"abcd1234");
        methods.waitBySeconds(1);
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        methods.waitBySeconds(1);

    }
    public void Logout(){
        methods.hoverWithMouse(By.cssSelector(".login.menu.top"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector("a[href='https://www.kitapyurdu.com/index.php?route=account/logout']"));
        methods.waitBySeconds(2);


    }


}
