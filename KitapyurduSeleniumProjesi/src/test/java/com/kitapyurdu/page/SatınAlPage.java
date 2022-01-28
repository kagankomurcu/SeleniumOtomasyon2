package com.kitapyurdu.page;

import com.kitapyurdu.methods.Methods;
import org.openqa.selenium.By;

public class SatınAlPage {
    Methods methods;

    public SatınAlPage(){

        methods = new Methods();
    }

    public void satınAlPage(){

        methods.tikla(By.cssSelector("div[class='right'] a[class='button red']"));
    }
}