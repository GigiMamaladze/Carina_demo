package com.qaprosoft.carina.demo.mytests;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.demo.gui.mypages.HomePage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class HomePageTest extends AbstractTest {
    @Test
    public void checkHomePage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        assertTrue(homePage.isChromeDriverBtnPresent(), "Home page isn't opened");
    }
}
