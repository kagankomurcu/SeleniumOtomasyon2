package com.kitapyurdu.page;

import com.kitapyurdu.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage {
    Methods methods;

    public LoginPage(){

        methods = new Methods();
    }

    public void login() {
        methods.tikla(By.xpath("//div[@class='menu-top-button login']"));
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("login-email"),"kagantest123@outlook.com");
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("login-password"),"1q2w3e4r5t");
        methods.waitBySeconds(2);
        methods.tikla(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        methods.waitBySeconds(2);
        Assert.assertTrue(methods.isElementVisible(By.xpath("//*[@id=\"header-top\"]/div/div[1]/div[1]/ul/li/a")));
        methods.waitBySeconds(2);








         /*
        List<WebElement> dizi = null;
        dizi.add(methods.findElement(By.cssSelector("a[class='add-to-favorites']")));
        System.out.println("dizi: "+dizi.get(0));
        for(int i=0 ; i<4 ; i++){

          // x.click();
        }


        methods.waitBySeconds(5);

        ArrayList<WebElement> dizi = new ArrayList();
        if(dizi.get(i) != dizi.get(i-1)){
            dizi.add(methods.findElement(By.cssSelector("[class='fa fa-heart']")));
        }
        System.out.println(dizi);
        Random rnd = new Random();
        int i = rnd.nextInt(dizi.size());
        dizi.get(i).click();
        //methods.click(By.dizi.get(i));

         */


    }



}
