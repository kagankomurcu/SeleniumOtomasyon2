package com.kitapyurdu.page;

import com.kitapyurdu.methods.Methods;
import org.openqa.selenium.By;

public class AdresPage {
    Methods methods;

    public AdresPage(){

        methods = new Methods();
    }

    public void adresPage(){

        methods.waitBySeconds(2);
        methods.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[2]")).click();
        methods.waitBySeconds(2);

        methods.findElement(By.xpath("//input[@id='address-firstname-companyname']")).sendKeys("Sir");
        methods.tikla(By.xpath("//input[@checked='true']"));
        methods.waitBySeconds(1);

        methods.tikla(By.cssSelector("#address-lastname-title"));
        methods.sendKeys(By.cssSelector("#address-lastname-title") , "Papua");

        methods.waitBySeconds(1);
        methods.tikla(By.cssSelector("#address-country-id"));
        methods.waitBySeconds(1);
        methods.tikla(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/select[1]/option[233]"));
        methods.waitBySeconds(2);
        methods.tikla(By.cssSelector("#address-zone-id"));
        methods.waitBySeconds(2);
        methods.tikla(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/table[1]/tbody[1]/tr[5]/td[2]/select[1]/option[25]"));
        methods.waitBySeconds(2);
        methods.tikla(By.cssSelector("#address-county-id"));
        methods.waitBySeconds(2);
        methods.tikla(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/table[1]/tbody[1]/tr[6]/td[2]/select[1]/option[5]"));
        methods.waitBySeconds(2);
        methods.findElement(By.xpath("//input[@id='district']")).sendKeys("example adress");
        methods.waitBySeconds(2);
        methods.findElement(By.xpath("//textarea[@id='address-address-text']")).sendKeys("example adress");
        methods.waitBySeconds(2);
        methods.findElement(By.xpath("//input[@id='address-postcode']")).sendKeys("00000");
        methods.waitBySeconds(2);
        methods.findElement(By.xpath("//input[@id='address-telephone']")).sendKeys("2165554433");
        methods.waitBySeconds(2);
        methods.findElement(By.xpath("//input[@id='address-mobile-telephone']")).sendKeys("5355552211");
        methods.waitBySeconds(2);
        methods.findElement(By.xpath("//input[@id='address-tax-id']")).sendKeys("62110440312");
        methods.waitBySeconds(2);
        methods.tikla(By.xpath("//button[@id='button-checkout-continue']"));
        methods.waitBySeconds(2);
        methods.tikla(By.xpath("//button[@id='button-checkout-continue']"));
        methods.waitBySeconds(2);


    }
}