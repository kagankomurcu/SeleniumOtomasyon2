package com.kitapyurdu.page;

import com.kitapyurdu.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class KartPage {
    Methods methods;

    public KartPage(){

        methods = new Methods();
    }

    public void kart(){
        methods.waitBySeconds(7);
        methods.findElement(By.xpath("//input[@id='credit-card-owner']")).sendKeys("Test Example Name");
        methods.waitBySeconds(1);
        methods.findElement(By.xpath("//input[@id='credit_card_number_1']")).sendKeys("5890");
        methods.waitBySeconds(1);
        methods.findElement(By.xpath("//input[@id='credit_card_number_2']")).sendKeys("0400");
        methods.waitBySeconds(1);
        methods.findElement(By.xpath("//input[@id='credit_card_number_3']")).sendKeys("0000");
        methods.waitBySeconds(1);
        methods.findElement(By.xpath("//input[@id='credit_card_number_4']")).sendKeys("0016");
        methods.waitBySeconds(1);
        methods.tikla(By.cssSelector("#credit-card-expire-date-month"));
        methods.waitBySeconds(1);
        methods.tikla(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[7]/td[1]/select[1]/option[5]"));

        methods.waitBySeconds(1);
        methods.tikla(By.xpath("//select[@id='credit-card-expire-date-year']"));
        methods.waitBySeconds(1);
        methods.tikla(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[7]/td[1]/select[2]/option[16]"));
        methods.findElement(By.xpath("//input[@id='credit-card-security-code']")).sendKeys("036");
        methods.waitBySeconds(1);
        methods.tikla(By.xpath("//label[@id='credit-card-is-3ds-label']"));
        methods.waitBySeconds(1);
        methods.tikla(By.xpath("//label[@id='register-credit-card-label']"));
        methods.waitBySeconds(1);
        methods.findElement(By.xpath("//button[@id='button-checkout-continue']")).click();
        methods.waitBySeconds(1);
        methods.tikla(By.cssSelector("input[value='1'][name='agree']"));
        methods.waitBySeconds(1);
        methods.findElement(By.cssSelector("input[value='Siparişi Onaylayın']")).click();
        methods.waitBySeconds(15);

    }
}
