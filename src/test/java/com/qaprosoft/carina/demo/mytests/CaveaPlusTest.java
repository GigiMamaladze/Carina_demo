package com.qaprosoft.carina.demo.mytests;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.demo.gui.mytests.caveaplus.components.enums.filter.Countries;
import com.qaprosoft.carina.demo.gui.mytests.caveaplus.components.enums.filter.Dubbing;
import com.qaprosoft.carina.demo.gui.mytests.caveaplus.components.enums.filter.Genres;
import com.qaprosoft.carina.demo.gui.mytests.caveaplus.components.enums.Languages;
import com.qaprosoft.carina.demo.gui.mytests.caveaplus.components.enums.regitration.Day;
import com.qaprosoft.carina.demo.gui.mytests.caveaplus.components.enums.regitration.Gender;
import com.qaprosoft.carina.demo.gui.mytests.caveaplus.components.enums.regitration.Month;
import com.qaprosoft.carina.demo.gui.mytests.caveaplus.components.enums.regitration.Year;
import com.qaprosoft.carina.demo.gui.mytests.caveaplus.components.models.registration.CaveaPlusUser;
import com.qaprosoft.carina.demo.gui.mytests.caveaplus.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CaveaPlusTest extends AbstractTest {


    //----------------------------------------------Main Page---------------------------------------------

    @Test(priority = 1,groups = "Home_page")
    public void testChangingLanguage(){
        CaveaPlusHomePage caveaPlusHomePage = new CaveaPlusHomePage(getDriver());
        caveaPlusHomePage.open();
        Assert.assertTrue(caveaPlusHomePage.isPageOpened(),"Page is Not Opened");
        caveaPlusHomePage.changeLanguage(Languages.GEORGIA);
    }

    @Test(priority = 2,groups = "Home_page")
    public void testSwiper(){
        CaveaPlusHomePage caveaPlusHomePage = new CaveaPlusHomePage(getDriver());
        caveaPlusHomePage.open();
        Assert.assertTrue(caveaPlusHomePage.isPageOpened(),"Page is Not Opened");
        caveaPlusHomePage.swipeMovies();
    }

    @Test(priority = 3,groups = "Home_page")
    public void testBannerPages(){
        CaveaPlusHomePage caveaPlusHomePage = new CaveaPlusHomePage(getDriver());
        caveaPlusHomePage.open();
        Assert.assertTrue(caveaPlusHomePage.isPageOpened(),"Page is Not Opened");
        caveaPlusHomePage.switchBannerPage();
    }


//-----------------------------------------Other Pages------------------------------------------------------
// In Working Process (Not Full)
    @Test(priority = 6)
    public void testMoviePage(){
        CaveaPlusHomePage caveaPlusHomePage = new CaveaPlusHomePage(getDriver());
        caveaPlusHomePage.open();
        Assert.assertTrue(caveaPlusHomePage.isPageOpened(),"Page is Not Opened");
        MoviesPage moviesPage = caveaPlusHomePage.getMainMenu().clickMovie();
        Assert.assertTrue(moviesPage.isPageOpened(),"Page is not Opened");
        moviesPage.getMovAndSerialFilter().chooseGenre(Genres.ADULT_ANIMATION);
        moviesPage.getMovAndSerialFilter().chooseDubbing(Dubbing.ENGLISH);
        moviesPage.getMovAndSerialFilter().chooseCountry(Countries.BELGIUM);
        moviesPage.getMovAndSerialFilter().clickCheckBoxFree();
        moviesPage.getMovAndSerialFilter().clickCheckBoxPremium();
        moviesPage.getMovAndSerialFilter().chooseYearRealised();
    }

    @Test(priority = 7)
    public void testTwShowsPage(){
        CaveaPlusHomePage caveaPlusHomePage = new CaveaPlusHomePage(getDriver());
        caveaPlusHomePage.open();
        Assert.assertTrue(caveaPlusHomePage.isPageOpened(),"Page is Not Opened");
        TwShowsPage twShowsPage = caveaPlusHomePage.getMainMenu().clickTwShows();
        twShowsPage.getMovAndSerialFilter().chooseGenre(Genres.ADULT_ANIMATION);
        twShowsPage.getMovAndSerialFilter().chooseDubbing(Dubbing.ENGLISH);
        twShowsPage.getMovAndSerialFilter().chooseCountry(Countries.BELGIUM);
        twShowsPage.getMovAndSerialFilter().clickCheckBoxFree();
        twShowsPage.getMovAndSerialFilter().clickCheckBoxPremium();
        twShowsPage.getMovAndSerialFilter().chooseYearRealised();


    }

//--------------------------------------------Process-----------------------------------------------------
    @Test(priority = 4,groups = "Login_in")
    public void testLogInProcess(){
         CaveaPlusHomePage caveaPlusHomePage = new CaveaPlusHomePage(getDriver());
         caveaPlusHomePage.open();
         Assert.assertTrue(caveaPlusHomePage.isPageOpened(),"Page is Not Opened");
         LogInPage logInPage = caveaPlusHomePage.clickLogInBtn();
    }

    @Test(priority = 5,groups ="Login_in")
    public void testRegistrationProcess(){
        CaveaPlusHomePage caveaPlusHomePage = new CaveaPlusHomePage(getDriver());
        caveaPlusHomePage.open();
        Assert.assertTrue(caveaPlusHomePage.isPageOpened(),"Page is Not Opened");
        RegistrationPage registrationPage = caveaPlusHomePage.clickRegistrationBtn();
        Assert.assertTrue(registrationPage.isPageOpened(),"Page is Not Opened");
        CaveaPlusUser caveaPlusUser = new CaveaPlusUser("Salome","Turmanidze",Day.FOUR,Month.JANUARY,Year.Y2000,Gender.MELA,"555","Salome@","Saloome");
        registrationPage.inputUserInformation(caveaPlusUser);
    }

}
