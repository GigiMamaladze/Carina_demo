package com.qaprosoft.carina.demo.mytests;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.demo.gui.mytests.automation_excercise.components.AddedPopUpPage;
import com.qaprosoft.carina.demo.gui.mytests.automation_excercise.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AutomationExerciseTest extends AbstractTest {


    @Test
    public void checkLogIn(){
        HomePage homePage =new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(),"Page is not opened");
        SingUpLogInPage singUpLogInPage = homePage.getMenu().clickSingUpLogInBtn();
        Assert.assertTrue(singUpLogInPage.isPageOpened(),"Page is not opened");
        singUpLogInPage.typeEmail("Gigi@solvd.com");
        singUpLogInPage.typePassword("Gigi");
        singUpLogInPage.clickLogInBtn();
    }

    @Test
    public void addToCard(){
        HomePage homePage =new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(),"Page is not opened");
        ProductsPage productsPage = homePage.getMenu().clickProductsBtn();
        AddedPopUpPage addedPopUpPage = productsPage.addToCard();
        Assert.assertTrue(addedPopUpPage.isPageOpened(),"Page is not opened");
        addedPopUpPage.clickContinueShoppingBtn();
    }

    @Test
    public void removeProduct(){
        /* To remove product from the cart, first we need to add product
         */
        addToCard();
        ProductsPage productsPage = new ProductsPage(getDriver());
        CartPage cartPage =productsPage.getMenu().clickToCartBtn();
        cartPage.clickXbtn();
        pause(1);
    }

    @Test
    public void checkSwiper(){
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(),"Page is not opened");
        homePage.clickSwiper();
    }


    @Test
    public void checkContactUs(){
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(),"Page is not opened");
        ContactUsPage contactUsPage = homePage.getMenu().clickToContactUsBtn();
        Assert.assertTrue(contactUsPage.isPageOpened(),"Page is not opened");
        contactUsPage.typeName("Gigi");
        contactUsPage.typeEmail("Gigi@sd");
        contactUsPage.typeSubject("Ads");
        contactUsPage.typeMessage("Hello world");
        contactUsPage.clickSubmitBtn();
    }



}
