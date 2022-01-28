package com.kitapyurdu.page;

import org.openqa.selenium.By;
import com.kitapyurdu.methods.Methods;

public class SepetimPage {
    Methods methods;

    public SepetimPage(){

        methods = new Methods();
    }

    public void sepetimPage(){
        methods.waitBySeconds(2);
        methods.tikla(By.id("cart"));
        methods.waitBySeconds(2);
        methods.tikla(By.id("js-cart"));
        methods.waitBySeconds(2);
        methods.findElement(By.xpath("//input[@name='quantity']")).clear();
        methods.waitBySeconds(1);
        methods.findElement(By.xpath("//input[@name='quantity']")).sendKeys("2");
        methods.waitBySeconds(2);
        methods.tikla(By.cssSelector("i[title='Güncelle']"));
        methods.waitBySeconds(2);


    }
}
