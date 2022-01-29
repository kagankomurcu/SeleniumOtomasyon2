package com.kitapyurdu.page;

import com.kitapyurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;


public class ProductPage {
    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);

    public ProductPage(){

        methods = new Methods();
    }


    public void scrollAndSelect(){

        methods.tikla(By.id("search-input"));
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("search-input"),"Oyuncak");
        methods.waitBySeconds(1);
        methods.tikla(By.xpath("//*[@id=\"search\"]/span"));
        methods.waitBySeconds(1);
        methods.scrollWithAction(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[3]/div[4]/div[2]/div[7]/div[1]/div[1]/div[1]/a[1]/img[1]"));
        methods.waitBySeconds(2);
        methods.findElement(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[3]/div[4]/div[2]/div[7]/div[2]/div[4]/a[4]/i[1]")).click();
        methods.waitBySeconds(2);
        methods.findElement(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[3]/div[4]/div[2]/div[6]/div[2]/div[4]/a[4]/i[1]")).click();
        methods.waitBySeconds(2);
        methods.findElement(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[3]/div[4]/div[2]/div[8]/div[2]/div[4]/a[4]/i[1]")).click();
        methods.waitBySeconds(2);
        methods.tikla(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/a[1]/img[1]"));
        methods.waitBySeconds(2);

    }

  /*  public void attributeTest(){
        String attribute = methods.getAttribute(By.cssSelector(".logo-text>a>img"),"title");
        System.out.println("Alınan text: " + attribute);
        logger.info("Alınan text: " + attribute);
        methods.waitBySeconds(3);

    }

   /* public void textControlTest(){
        String text = methods.getText(By.cssSelector(".common-sprite"));
        System.out.println("Alınan text: " + text);
        logger.info("Alınan text: " + text);
        methods.waitBySeconds(3);
    }

  /*  public void valueControlTest(){
        methods.sendKeys(By.id("search-input"),"testinium");
        String value = methods.getValue(By.id("search-input"));
        System.out.println("Alınan text: " + value);
        logger.info("Alınan text: " + value);
        Assert.assertEquals("testinium", value);
        methods.waitBySeconds(5);
    } */





}
