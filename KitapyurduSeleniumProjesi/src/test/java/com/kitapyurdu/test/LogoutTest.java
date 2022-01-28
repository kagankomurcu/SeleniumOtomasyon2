package com.kitapyurdu.test;

import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.page.LoginPage;
import com.kitapyurdu.page.LogoutPage;
import org.junit.Test;

public class LogoutTest extends BaseTest {
    @Test
    public void logoutTest(){
        LogoutPage logoutPage = new LogoutPage();

        logoutPage.logout();
    }
}
