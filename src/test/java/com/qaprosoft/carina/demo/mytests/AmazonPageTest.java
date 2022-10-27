package com.qaprosoft.carina.demo.mytests;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.demo.gui.mypages.AmazonPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class AmazonPageTest extends AbstractTest {

    @Test
    public void checkHomePage() {
        AmazonPage homePage = new AmazonPage(getDriver());
        homePage.open();
        assertTrue(homePage.isTodayBtnPresent(), "Home page isn't opened");

    }

}

