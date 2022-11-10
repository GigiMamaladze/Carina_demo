package com.qaprosoft.carina.demo.mytests;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.gui.mytests.caveaplus.components.enums.Languages;
import com.qaprosoft.carina.demo.gui.mytests.caveaplus.pages.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CaveaPlusTest extends AbstractTest {
    private static final Logger LOGGER = LogManager.getLogger(CaveaPlusTest.class);

    //----------------------------------------------Main Page---------------------------------------------

    @Test
    @MethodOwner(owner = "Gigi")
    public void testChangingLanguage(){
        CaveaPlusHomePage caveaPlusHomePage = new CaveaPlusHomePage(getDriver());
        caveaPlusHomePage.open();
        Assert.assertTrue(caveaPlusHomePage.isPageOpened(),"Page is Not Opened");
        caveaPlusHomePage.changeLanguage(Languages.ENGLISH);
    }

    @Test
    @MethodOwner(owner = "Gigi")
    public void testSwiper(){
        CaveaPlusHomePage caveaPlusHomePage = new CaveaPlusHomePage(getDriver());
        caveaPlusHomePage.open();
        Assert.assertTrue(caveaPlusHomePage.isPageOpened(),"Page is Not Opened");
        caveaPlusHomePage.swipeMovies();
    }

    @Test
    @MethodOwner(owner = "Gigi")
    public void testBannerPages(){
        CaveaPlusHomePage caveaPlusHomePage = new CaveaPlusHomePage(getDriver());
        caveaPlusHomePage.open();
        Assert.assertTrue(caveaPlusHomePage.isPageOpened(),"Page is Not Opened");
        caveaPlusHomePage.switchBannerPage();
    }


//-----------------------------------------Other Pages------------------------------------------------------
// In Working Process (Not Full)
    @Test
    @MethodOwner(owner = "Gigi")
    public void testMoviePage(){
        CaveaPlusHomePage caveaPlusHomePage = new CaveaPlusHomePage(getDriver());
        caveaPlusHomePage.open();
        Assert.assertTrue(caveaPlusHomePage.isPageOpened(),"Page is Not Opened");
        MoviesPage moviesPage = caveaPlusHomePage.clickMovie();
        Assert.assertTrue(moviesPage.isPageOpened(),"Page is not Opened");
    }

    @Test
    @MethodOwner(owner = "Gigi")
    public void testTwShowsPage(){
        CaveaPlusHomePage caveaPlusHomePage = new CaveaPlusHomePage(getDriver());
        caveaPlusHomePage.open();
        Assert.assertTrue(caveaPlusHomePage.isPageOpened(),"Page is Not Opened");
        TwShowsPage twShowsPage = caveaPlusHomePage.clickTwShows();
    }

//--------------------------------------------Process-----------------------------------------------------
    @Test
    @MethodOwner(owner = "Gigi")
    public void testLogInProcess(){
         CaveaPlusHomePage caveaPlusHomePage = new CaveaPlusHomePage(getDriver());
         caveaPlusHomePage.open();
         Assert.assertTrue(caveaPlusHomePage.isPageOpened(),"Page is Not Opened");
         LogInPage logInPage = caveaPlusHomePage.clickLogInBtn();
    }

    @Test
    @MethodOwner(owner = "Gigi")
    public void testRegistrationProcess(){
        CaveaPlusHomePage caveaPlusHomePage = new CaveaPlusHomePage(getDriver());
        caveaPlusHomePage.open();
        Assert.assertTrue(caveaPlusHomePage.isPageOpened(),"Page is Not Opened");
        RegistrationPage registrationPage = caveaPlusHomePage.clickRegistrationBtn();
        Assert.assertTrue(registrationPage.isPageOpened(),"Page is Not Opened");
    }
}
