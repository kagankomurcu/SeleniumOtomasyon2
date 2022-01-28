package com.kitapyurdu.test;

import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.page.HomePage;
import com.kitapyurdu.page.KartPage;
import org.junit.Test;

public class KartTest extends BaseTest {
    @Test
    public void kartTest(){
        KartPage kartPage = new KartPage();

        kartPage.kart();
    }
}
