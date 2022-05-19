package com.testinium.page;

import methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class MyAccountPage {
    Methods methods;
    Logger logger = LogManager.getLogger(MyAccountPage.class);

    public MyAccountPage() {
        methods = new Methods();
    }

    public void loginCheck(){
        String text = methods.getText(By.cssSelector(".login .common-sprite"));
        logger.info("Alinan text: " +text);
        logger.info("Login islemi basarili");
    }
}

