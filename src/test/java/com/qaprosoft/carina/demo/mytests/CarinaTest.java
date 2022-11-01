package com.qaprosoft.carina.demo.mytests;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.demo.mobile.gui.pages.carinaapplication.common.CarinaHomePageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.carinaapplication.common.ContentFramePageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.carinaapplication.common.RegirtrationPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.carinaapplication.common.UserAccountPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.ContactUsPageBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CarinaTest extends AbstractTest {

    @Test
    public void testLogIn(){
        CarinaHomePageBase carinaHomePage =initPage(getDriver(), CarinaHomePageBase.class);
        Assert.assertTrue(carinaHomePage.isPageOpened(),"Page not found ERROR");
        RegirtrationPageBase regirtrationPageBase = carinaHomePage.clickNextBtn();
        UserAccountPageBase userAccountPageBase =regirtrationPageBase.logIn("Gigi","gigi1234","Male");
        Assert.assertTrue(userAccountPageBase.isPageOpened(),"Page not Found ERROR");

    }

    @Test
    public void testGithubLink(){
//        CarinaHomePageBase carinaHomePage =initPage(getDriver(), CarinaHomePageBase.class);
//        Assert.assertTrue(carinaHomePage.isPageOpened(),"Page not found ERROR");
//        RegirtrationPageBase regirtrationPageBase = carinaHomePage.clickNextBtn();
//        UserAccountPageBase userAccountPageBase =regirtrationPageBase.logIn("Gigi","gigi1234","Male");
//        Assert.assertTrue(userAccountPageBase.isPageOpened(),"Page not Found ERROR");
//        ContentFramePageBase contentFramePageBase =userAccountPageBase.clickContentFrame();
    }
}
