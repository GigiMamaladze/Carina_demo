package com.qaprosoft.carina.demo.mytests;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.demo.gui.mytests.automation_excercise.components.AddedProductPopup;
import com.qaprosoft.carina.demo.gui.mytests.automation_excercise.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AutomationExerciseTest extends AbstractTest {


    @Test
    public void LogInTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Page is not opened");
        SingUpLogInPage singUpLogInPage = homePage.getMenu().clickSingUpLogInBtn();
        Assert.assertTrue(singUpLogInPage.isPageOpened(), "Page is not opened");
        singUpLogInPage.typeEmail(R.TESTDATA.get("email"));
        singUpLogInPage.typePassword(R.TESTDATA.get("password"));
        singUpLogInPage.clickLogInBtn();
        Assert.assertTrue(homePage.getMenu().isAccountDisplayed(R.TESTDATA.get("userName")), "Account is not displayed");
    }

    @Test
    public void addToCardTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Page is not opened");
        ProductsPage productsPage = homePage.getMenu().clickProductsBtn();
        Assert.assertTrue(productsPage.isPageOpened(), "Page is not opened");
        String product = "Blue Top";
        productsPage.getProducts().scrollToItem(product);
        Assert.assertTrue(productsPage.getProducts().isItemPresent(product), "item is not exist");
        productsPage.getProducts().hoverItem(product);
        AddedProductPopup addedProductPopup = productsPage.getProducts().addToCard(product);
        Assert.assertTrue(addedProductPopup.isPageOpened(), "Page is not opened");
        addedProductPopup.clickContinueShoppingBtn();
        CartPage cartPage = productsPage.getMenu().clickToCartBtn();
        Assert.assertTrue(cartPage.isItemPresent(), "Item is not exist");
    }

    @Test
    public void removeProductTest() {
        /* To remove product from the cart, first we need to add produ
         */
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Page is not opened");
        String product = "Blue Top";
        Assert.assertTrue(homePage.getProducts().isItemPresent(product), "item is not exist");
        homePage.getProducts().scrollToItem(product);
        homePage.getProducts().hoverItem(product);
        AddedProductPopup addedProductPopup = homePage.getProducts().addToCard(product);
        Assert.assertTrue(addedProductPopup.isPageOpened(), "Page is not opened");
        addedProductPopup.clickContinueShoppingBtn();
        CartPage cartPage = homePage.getMenu().clickToCartBtn();
        Assert.assertTrue(cartPage.isItemPresent(), "Item is not exist");
        cartPage.clickXbtn();
        Assert.assertTrue(cartPage.isCartEmpty(), "Cart is not empty");
    }

    @Test
    public void checkSwiperTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Page is not opened");
        homePage.clickRightSwiper();
        Assert.assertTrue(homePage.isSecondBannerVisible(), "Second Banner is not visible");
        homePage.clickLeftSwiper();
        Assert.assertTrue(homePage.isFirstBannerVisible(), "First banner is not visible");
    }


    @Test(enabled = false)
    public void checkContactUsTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Page is not opened");
        ContactUsPage contactUsPage = homePage.getMenu().clickToContactUsBtn();
        Assert.assertTrue(contactUsPage.isPageOpened(), "Page is not opened");
        contactUsPage.typeName("Gigi");
        contactUsPage.typeEmail("Gigi@sd");
        contactUsPage.typeSubject("Ads");
        contactUsPage.typeMessage("Hello world");
        contactUsPage.uploadFile("/Users/gigimamaladze/Desktop/Screenshot 2022-12-15 at 11.21.05.png");
        contactUsPage.clickSubmitBtn();
        pause(5);
        contactUsPage.getDriver().switchTo().alert().accept();

    }


}
