package com.qaprosoft.carina.demo.mytests;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.zebrunner.carina.utils.R;
import com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwagLabsTest extends AbstractTest {

    @Test
    public void loginTest() {
        SwagLabsLogInScreenBase swagLabsLogInScreen = initPage(getDriver(), SwagLabsLogInScreenBase.class);
        Assert.assertTrue(swagLabsLogInScreen.isOpened(), "Login page is not opened");
        swagLabsLogInScreen.typeUserName(R.TESTDATA.get("appUser"));
        swagLabsLogInScreen.typePassword(R.TESTDATA.get("appPassword"));
        ProductsScreenBase productsScreen = swagLabsLogInScreen.clickLogInBtn();
        Assert.assertTrue(productsScreen.isOpened(), "Products page is not opened");
    }

    @Test
    public void addToCartTest() {
        SwagLabsLogInScreenBase swagLabsLogInScreen = initPage(getDriver(), SwagLabsLogInScreenBase.class);
        Assert.assertTrue(swagLabsLogInScreen.isOpened(), "Login page is not opened");
        swagLabsLogInScreen.typeUserName(R.TESTDATA.get("appUser"));
        swagLabsLogInScreen.typePassword(R.TESTDATA.get("appPassword"));
        ProductsScreenBase productsScreen = swagLabsLogInScreen.clickLogInBtn();
        String product = "Sauce Labs Backpack";
        Assert.assertTrue(productsScreen.isOpened(), "Products screen is not opened");
        productsScreen.clickAddToCartBtn(product);
        TopBarMenuBase topBarMenu = initPage(TopBarMenuBase.class);
        CartScreenBase cartScreen = topBarMenu.clickCartIconBtn();
        Assert.assertTrue(cartScreen.isOpened(), "Cart screen is not opened");
        Assert.assertTrue(cartScreen.isProductPresent(product), "Product is not added on cart");
    }

    @Test
    public void removeFromCartTest() {
        SwagLabsLogInScreenBase swagLabsLogInScreen = initPage(getDriver(), SwagLabsLogInScreenBase.class);
        Assert.assertTrue(swagLabsLogInScreen.isOpened(), "Login page is not opened");
        swagLabsLogInScreen.typeUserName(R.TESTDATA.get("appUser"));
        swagLabsLogInScreen.typePassword(R.TESTDATA.get("appPassword"));
        ProductsScreenBase productsScreen = swagLabsLogInScreen.clickLogInBtn();
        String product = "Sauce Labs Backpack";
        Assert.assertTrue(productsScreen.isOpened(), "Products screen is not opened");
        productsScreen.clickAddToCartBtn(product);
        TopBarMenuBase topBarMenu = initPage(TopBarMenuBase.class);
        CartScreenBase cartScreen = topBarMenu.clickCartIconBtn();
        Assert.assertTrue(cartScreen.isOpened(), "Cart screen is not opened");
        Assert.assertTrue(cartScreen.isProductPresent(product), "Product is not added on cart");
        cartScreen.removeProduct(product);
        Assert.assertFalse(cartScreen.isProductPresent(product), "Product is not removed from cart");

    }

    @Test
    public void checkProductOrder() {
        SwagLabsLogInScreenBase swagLabsLogInScreen = initPage(getDriver(), SwagLabsLogInScreenBase.class);
        Assert.assertTrue(swagLabsLogInScreen.isOpened(), "Login page is not opened");
        swagLabsLogInScreen.typeUserName(R.TESTDATA.get("appUser"));
        swagLabsLogInScreen.typePassword(R.TESTDATA.get("appPassword"));
        ProductsScreenBase productsScreen = swagLabsLogInScreen.clickLogInBtn();
        String product = "Sauce Labs Backpack";
        Assert.assertTrue(productsScreen.isOpened(), "Products screen is not opened");
        productsScreen.clickAddToCartBtn(product);
        TopBarMenuBase topBarMenu = initPage(TopBarMenuBase.class);
        CartScreenBase cartScreen = topBarMenu.clickCartIconBtn();
        Assert.assertTrue(cartScreen.isOpened(), "Cart screen is not opened");
        Assert.assertTrue(cartScreen.isProductPresent(product), "Product is not added on cart");
        CheckoutScreenBase checkoutScreen = cartScreen.clickCheckoutBtn();
        Assert.assertTrue(checkoutScreen.isOpened(), "Check out  screen is not opened");
        checkoutScreen.typeFirstName(R.TESTDATA.get("firstName"));
        checkoutScreen.typeLastName(R.TESTDATA.get("lastName"));
        checkoutScreen.typeZipcode(R.TESTDATA.get("zipCode"));
        CheckoutOverviewScreenBase overviewScreen = checkoutScreen.clickContinueBtn();
        Assert.assertTrue(overviewScreen.isOpened(), "OverView screen is not opened");
        Assert.assertTrue(overviewScreen.isProductPresent(product), "Product is not present");
        CompleteScreenBase completeScreen = overviewScreen.clickFinishBtn();
        Assert.assertTrue(completeScreen.isOpened(), "Complete screen is not opened");
    }

    @Test
    public void logoutTest() {
        SwagLabsLogInScreenBase swagLabsLogInScreen = initPage(getDriver(), SwagLabsLogInScreenBase.class);
        Assert.assertTrue(swagLabsLogInScreen.isOpened(), "Login page is not opened");
        swagLabsLogInScreen.typeUserName(R.TESTDATA.get("appUser"));
        swagLabsLogInScreen.typePassword(R.TESTDATA.get("appPassword"));
        ProductsScreenBase productsScreen = swagLabsLogInScreen.clickLogInBtn();
        Assert.assertTrue(productsScreen.isOpened(), "Products page is not opened");
        TopBarMenuBase topBarMenu = initPage(TopBarMenuBase.class);
        TopLeftMenuBase topLeftMenu = topBarMenu.clickTopLeftMenuBtn();
        swagLabsLogInScreen = topLeftMenu.clickLogoutBtn();
        Assert.assertTrue(swagLabsLogInScreen.isOpened(), "Login page is not opened");
    }

    @Test
    public void productViewInformationTest() {
        SwagLabsLogInScreenBase swagLabsLogInScreen = initPage(getDriver(), SwagLabsLogInScreenBase.class);
        Assert.assertTrue(swagLabsLogInScreen.isOpened(), "Login page is not opened");
        swagLabsLogInScreen.typeUserName(R.TESTDATA.get("appUser"));
        swagLabsLogInScreen.typePassword(R.TESTDATA.get("appPassword"));
        ProductsScreenBase productsScreen = swagLabsLogInScreen.clickLogInBtn();
        Assert.assertTrue(productsScreen.isOpened(), "Products page is not opened");
        String product = "Sauce Labs Backpack";
        ProductInformationScreenBase productInformationScreen = productsScreen.clickOnProduct(product);
        Assert.assertTrue(productInformationScreen.isOpened(), "Product is not founded");

    }
}
