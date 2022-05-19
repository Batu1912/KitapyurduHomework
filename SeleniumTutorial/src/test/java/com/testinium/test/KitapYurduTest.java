package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.By;

public class KitapYurduTest extends BaseTest {
    Logger logger = LogManager.getLogger(ProductPage.class);

    @Test
    public void loginTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.Login();
        logger.info("Login islemi basarili.");
        MyAccountPage myAccountPage = new MyAccountPage();
        myAccountPage.loginCheck();
        ProductPage productPage = new ProductPage();
        productPage.search();
        FavouritesPage favouritesPage = new FavouritesPage();
        productPage.scrollToSeventh();
        productPage.addFavourites();
        PointCataloguePage pointCataloguePage = new PointCataloguePage();
        pointCataloguePage.getPointCataloguePage();
        pointCataloguePage.addRandomProductToBasket();
        favouritesPage.checkTheFavourites();
        favouritesPage.deleteFavourite();
        BasketPage basketPage = new BasketPage();
        basketPage.goToBasket();
        basketPage.raiseProductNumber(By.name("quantity"), "2");
        PurchasePage purchasePage = new PurchasePage();
        purchasePage.getPurchasePage();
        purchasePage.registerAddress();
        purchasePage.paymentStep();
        loginPage.Logout();

    }
}
