package com.qaprosoft.carina.demo.mytests;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.demo.mobile.gui.pages.google.android.GoogleHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleAppTest extends AbstractTest {

    @Test
    public void typeSomething(){
        GoogleHomePage googleHomePage =initPage(getDriver(), GoogleHomePage.class);
        Assert.assertTrue(googleHomePage.isSearchBoxExsit(),"Not");
        googleHomePage.tapSomething("Hello");
    }
}
