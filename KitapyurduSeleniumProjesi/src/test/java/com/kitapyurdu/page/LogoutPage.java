package com.kitapyurdu.page;

import com.kitapyurdu.methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LogoutPage {
    Methods methods;

    public LogoutPage(){
        methods = new Methods();
    }
    public void logout(){

        methods.waitBySeconds(5);
        methods.findElement(By.cssSelector("img[title='kitapyurdu.com']")).click();
        methods.waitBySeconds(5);
        methods.isElementVisible(By.xpath("//a[contains(text(),'Çıkış')]"));
        methods.waitBySeconds(1);

        methods.waitBySeconds(15);


    }
}
