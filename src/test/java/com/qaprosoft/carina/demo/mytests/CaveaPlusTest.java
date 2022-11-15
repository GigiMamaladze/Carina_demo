package com.qaprosoft.carina.demo.mytests;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.core.foundation.utils.tag.Priority;
import com.qaprosoft.carina.core.foundation.utils.tag.TestPriority;
import com.qaprosoft.carina.demo.gui.mytests.caveaplus.components.enums.Genres;
import com.qaprosoft.carina.demo.gui.mytests.caveaplus.components.enums.Languages;
import com.qaprosoft.carina.demo.gui.mytests.caveaplus.pages.*;
import com.qaprosoft.carina.demo.mobile.gui.pages.carinaapplication.models.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CaveaPlusTest extends AbstractTest {
    private static final Logger LOGGER = LogManager.getLogger(CaveaPlusTest.class);

    //----------------------------------------------Main Page---------------------------------------------

    @Test(priority = 1)
    @MethodOwner(owner = "Gigi")
    public void testChangingLanguage(){
        CaveaPlusHomePage caveaPlusHomePage = new CaveaPlusHomePage(getDriver());
        caveaPlusHomePage.open();
        Assert.assertTrue(caveaPlusHomePage.isPageOpened(),"Page is Not Opened");
        caveaPlusHomePage.changeLanguage(Languages.ENGLISH);
    }

    @Test(priority = 2)
    @MethodOwner(owner = "Gigi")
    public void testSwiper() throws InterruptedException {
        CaveaPlusHomePage caveaPlusHomePage = new CaveaPlusHomePage(getDriver());
        caveaPlusHomePage.open();
        Assert.assertTrue(caveaPlusHomePage.isPageOpened(),"Page is Not Opened");
        caveaPlusHomePage.swipeMovies();
    }

    @Test(priority = 3)
    @MethodOwner(owner = "Gigi")
    public void testBannerPages(){
        CaveaPlusHomePage caveaPlusHomePage = new CaveaPlusHomePage(getDriver());
        caveaPlusHomePage.open();
        Assert.assertTrue(caveaPlusHomePage.isPageOpened(),"Page is Not Opened");
        caveaPlusHomePage.switchBannerPage();
    }


//-----------------------------------------Other Pages------------------------------------------------------
// In Working Process (Not Full)
    @Test(priority = 6)
    @MethodOwner(owner = "Gigi")
    public void testMoviePage(){
        CaveaPlusHomePage caveaPlusHomePage = new CaveaPlusHomePage(getDriver());
        caveaPlusHomePage.open();
        Assert.assertTrue(caveaPlusHomePage.isPageOpened(),"Page is Not Opened");
        caveaPlusHomePage.changeLanguage(Languages.ENGLISH);
        MoviesPage moviesPage = caveaPlusHomePage.getMainMenu().clickMovie();
        Assert.assertTrue(moviesPage.isPageOpened(),"Page is not Opened");
        moviesPage.getMovAndSerialFilter().chooseGenre(Genres.ADULT_ANIMATION);
    }

    @Test(priority = 7)
    @MethodOwner(owner = "Gigi")
    public void testTwShowsPage(){
        CaveaPlusHomePage caveaPlusHomePage = new CaveaPlusHomePage(getDriver());
        caveaPlusHomePage.open();
        Assert.assertTrue(caveaPlusHomePage.isPageOpened(),"Page is Not Opened");
        TwShowsPage twShowsPage = caveaPlusHomePage.getMainMenu().clickTwShows();
    }

//--------------------------------------------Process-----------------------------------------------------
    @Test(priority = 4)
    @MethodOwner(owner = "Gigi")
    public void testLogInProcess(){
         CaveaPlusHomePage caveaPlusHomePage = new CaveaPlusHomePage(getDriver());
         caveaPlusHomePage.open();
         Assert.assertTrue(caveaPlusHomePage.isPageOpened(),"Page is Not Opened");
         LogInPage logInPage = caveaPlusHomePage.clickLogInBtn();
    }

    @Test(priority = 5)
    @MethodOwner(owner = "Gigi")
    public void testRegistrationProcess(){
        CaveaPlusHomePage caveaPlusHomePage = new CaveaPlusHomePage(getDriver());
        caveaPlusHomePage.open();
        Assert.assertTrue(caveaPlusHomePage.isPageOpened(),"Page is Not Opened");
        RegistrationPage registrationPage = caveaPlusHomePage.clickRegistrationBtn();
        Assert.assertTrue(registrationPage.isPageOpened(),"Page is Not Opened");
    }
}
