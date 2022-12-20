package com.qaprosoft.carina.demo.mytests;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.demo.mobile.gui.pages.swaglabapp.common.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwagLabsTest extends AbstractTest {

    @Test
    public void loginTest() {
        SwagLabsLogInScreenBase swagLabsLogInScreenBase = initPage(getDriver(), SwagLabsLogInScreenBase.class);
        Assert.assertTrue(swagLabsLogInScreenBase.isScreenOpened(), "Login page is not opened");
        swagLabsLogInScreenBase.typeUserName(R.TESTDATA.get("appUser"));
        swagLabsLogInScreenBase.typePassword(R.TESTDATA.get("appPassword"));
        ProductsScreenBase productsScreenBase = swagLabsLogInScreenBase.clickLogInBtn();
        Assert.assertTrue(productsScreenBase.isScreenOpened(), "Products page is not opened");
    }

    @Test
    public void addToCartTest() {
        SwagLabsLogInScreenBase swagLabsLogInScreenBase = initPage(getDriver(), SwagLabsLogInScreenBase.class);
        Assert.assertTrue(swagLabsLogInScreenBase.isScreenOpened(), "Login page is not opened");
        swagLabsLogInScreenBase.typeUserName(R.TESTDATA.get("appUser"));
        swagLabsLogInScreenBase.typePassword(R.TESTDATA.get("appPassword"));
        ProductsScreenBase productsScreenBase = swagLabsLogInScreenBase.clickLogInBtn();
        String product = "Sauce Labs Backpack";
        Assert.assertTrue(productsScreenBase.isScreenOpened(), "Products screen is not opened");
        productsScreenBase.clickOnAddToCartBtn(product);
        TopBarMenuBase topBarMenuBase = initPage(TopBarMenuBase.class);
        CartScreenBase cartScreenBase = topBarMenuBase.clickOnCartIconBtn();
        Assert.assertTrue(cartScreenBase.isScreenOpened(), "Cart screen is not opened");
        Assert.assertTrue(cartScreenBase.isProductPresentCart(product), "Product is not added on cart");
    }

    @Test
    public void removeFromCartTest() {
        SwagLabsLogInScreenBase swagLabsLogInScreenBase = initPage(getDriver(), SwagLabsLogInScreenBase.class);
        Assert.assertTrue(swagLabsLogInScreenBase.isScreenOpened(), "Login page is not opened");
        swagLabsLogInScreenBase.typeUserName(R.TESTDATA.get("appUser"));
        swagLabsLogInScreenBase.typePassword(R.TESTDATA.get("appPassword"));
        ProductsScreenBase productsScreenBase = swagLabsLogInScreenBase.clickLogInBtn();
        String product = "Sauce Labs Backpack";
        Assert.assertTrue(productsScreenBase.isScreenOpened(), "Products screen is not opened");
        productsScreenBase.clickOnAddToCartBtn(product);
        TopBarMenuBase topBarMenuBase = initPage(TopBarMenuBase.class);
        CartScreenBase cartScreenBase = topBarMenuBase.clickOnCartIconBtn();
        Assert.assertTrue(cartScreenBase.isScreenOpened(), "Cart screen is not opened");
        Assert.assertTrue(cartScreenBase.isProductPresentCart(product), "Product is not added on cart");
        cartScreenBase.removeProduct(product);
        Assert.assertFalse(cartScreenBase.isProductPresentCart(product), "Product is not removed from cart");

    }

    @Test
    public void checkProductOrder() {
        SwagLabsLogInScreenBase swagLabsLogInScreenBase = initPage(getDriver(), SwagLabsLogInScreenBase.class);
        Assert.assertTrue(swagLabsLogInScreenBase.isScreenOpened(), "Login page is not opened");
        swagLabsLogInScreenBase.typeUserName(R.TESTDATA.get("appUser"));
        swagLabsLogInScreenBase.typePassword(R.TESTDATA.get("appPassword"));
        ProductsScreenBase productsScreenBase = swagLabsLogInScreenBase.clickLogInBtn();
        String product = "Sauce Labs Backpack";
        Assert.assertTrue(productsScreenBase.isScreenOpened(), "Products screen is not opened");
        productsScreenBase.clickOnAddToCartBtn(product);
        TopBarMenuBase topBarMenuBase = initPage(TopBarMenuBase.class);
        CartScreenBase cartScreenBase = topBarMenuBase.clickOnCartIconBtn();
        Assert.assertTrue(cartScreenBase.isScreenOpened(), "Cart screen is not opened");
        Assert.assertTrue(cartScreenBase.isProductPresentCart(product), "Product is not added on cart");
        CheckoutScreenBase checkoutScreenBase = cartScreenBase.clickCheckoutBtn();
        Assert.assertTrue(checkoutScreenBase.isScreenOpened(), "Check out  screen is not opened");
        checkoutScreenBase.typeFirstName(R.TESTDATA.get("firstName"));
        checkoutScreenBase.typeLastName(R.TESTDATA.get("lastName"));
        checkoutScreenBase.typeZipcode(R.TESTDATA.get("zipCode"));
        OverviewScreenBase overviewScreenBase = checkoutScreenBase.clickContinueBtn();
        Assert.assertTrue(overviewScreenBase.isScreenOpened(), "OverView screen is not opened");
        Assert.assertTrue(overviewScreenBase.isProductPresentCart(product), "Product is not present");
        overviewScreenBase.scrollToFinishBtn();
        CompleteScreenBase completeScreenBase = overviewScreenBase.clickFinishBtn();
        Assert.assertTrue(completeScreenBase.isScreenOpened(), "Complete screen is not opened");
    }

    @Test
    public void logoutTest() {
        SwagLabsLogInScreenBase swagLabsLogInScreenBase = initPage(getDriver(), SwagLabsLogInScreenBase.class);
        Assert.assertTrue(swagLabsLogInScreenBase.isScreenOpened(), "Login page is not opened");
        swagLabsLogInScreenBase.typeUserName(R.TESTDATA.get("appUser"));
        swagLabsLogInScreenBase.typePassword(R.TESTDATA.get("appPassword"));
        ProductsScreenBase productsScreenBase = swagLabsLogInScreenBase.clickLogInBtn();
        Assert.assertTrue(productsScreenBase.isScreenOpened(), "Products page is not opened");
        TopBarMenuBase topBarMenuBase = initPage(TopBarMenuBase.class);
        TopLeftMenuBase topLeftMenuBase = topBarMenuBase.clickOnTopLeftMenuBtn();
        SwagLabsLogInScreenBase swagLabsLogInScreenBaseLogOut = topLeftMenuBase.clickLogoutBtn();
        Assert.assertTrue(swagLabsLogInScreenBaseLogOut.isScreenOpened(), "Login page is not opened");
    }
}
