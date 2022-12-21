package com.qaprosoft.carina.demo.mytests;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.demo.gui.netflix.NetflixHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NetflixTest extends AbstractTest {

    @Test
    public void testSomething() {
        NetflixHomePage netflixHomePage = new NetflixHomePage(getDriver());
        netflixHomePage.open();
        Assert.assertTrue(netflixHomePage.isPageOpened(), "Page is not Opened");
        netflixHomePage.getAllQuestions();
    }
}
