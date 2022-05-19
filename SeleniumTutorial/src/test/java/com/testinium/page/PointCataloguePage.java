package com.testinium.page;

import methods.Methods;
import org.openqa.selenium.By;

public class PointCataloguePage {
    Methods methods;

    public PointCataloguePage(){
        methods = new Methods();
    }
    public void getPointCataloguePage(){
        methods.click(By.cssSelector(".logo-icon"));
        methods.waitBySeconds(3);
        methods.click(By.cssSelector(".lvl1catalog > .common-sprite"));
        methods.waitBySeconds(3);
        methods.click(By.cssSelector("img[title='Puan Kataloğundaki Türk Klasikleri']"));
        methods.waitBySeconds(3);
        methods.selectByText(By.xpath("//*[@class='sort']/select"),"Yüksek Oylama");
        methods.waitBySeconds(3);
        methods.hoverWithMouse(By.xpath("//*[@class='mn-strong common-sprite' and contains(text(), 'Tüm Kitaplar')]"));
        methods.waitBySeconds(5);
        methods.click(By.xpath("//div[@class='subCategories']//a[@href='kategori/kitap-hobi/1_212.html']"));
        methods.waitBySeconds(3);
    }
    public void addRandomProductToBasket(){
        methods.selectRandomProduct(By.cssSelector("a[class='add-to-cart']"));
        methods.waitBySeconds(3);
    }
}
