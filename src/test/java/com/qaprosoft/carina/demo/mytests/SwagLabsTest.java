package com.qaprosoft.carina.demo.mytests;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.mobile_components.swaglabapp.Services;
import com.qaprosoft.carina.demo.mobile_components.swaglabapp.utils.AutoLogInUtil;
import com.zebrunner.carina.utils.R;
import com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common.*;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwagLabsTest extends Services implements IAbstractTest {

    @Test
    public void loginTest() {
        SwagLabsLogInScreenBase swagLabsLogInScreen = initPage(getDriver(), SwagLabsLogInScreenBase.class);
        Assert.assertTrue(swagLabsLogInScreen.isOpened(), "Login screen is not opened");
        swagLabsLogInScreen.typeUserName(R.TESTDATA.get("appUser"));
        swagLabsLogInScreen.typePassword(R.TESTDATA.get("appPassword"));
        CatalogScreenBase productsScreen = swagLabsLogInScreen.clickLogInBtn();
        Assert.assertTrue(productsScreen.isOpened(), "Products page is not opened");
    }

    @Test
    public void addToCartTest() {
        CatalogScreenBase productsScreen = autoLogInUtil.logIn();
        String product = "Sauce Labs Backpack";
        Assert.assertTrue(productsScreen.isOpened(), "Products screen is not opened");
        productsScreen.clickAddToCartBtn(product);
        CartScreenBase cartScreen = initPage(TopBarMenuBase.class).clickCartIconBtn();
        Assert.assertTrue(cartScreen.isOpened(), "Cart screen is not opened");
        Assert.assertTrue(cartScreen.isProductPresent(product), "Product is not added on cart");
    }

    @Test
    public void removeFromCartTest() {
        CatalogScreenBase productsScreen = autoLogInUtil.logIn();
        String product = "Sauce Labs Backpack";
        Assert.assertTrue(productsScreen.isOpened(), "Products screen is not opened");
        productsScreen.clickAddToCartBtn(product);
        CartScreenBase cartScreen = initPage(TopBarMenuBase.class).clickCartIconBtn();
        Assert.assertTrue(cartScreen.isOpened(), "Cart screen is not opened");
        Assert.assertTrue(cartScreen.isProductPresent(product), "Product is not added on cart");
        cartScreen.removeProduct(product);
        Assert.assertFalse(cartScreen.isProductPresent(product), "Product is not removed from cart");

    }

    @Test
    public void checkProductOrder() {
        CatalogScreenBase productsScreen = autoLogInUtil.logIn();
        String product = "Sauce Labs Backpack";
        Assert.assertTrue(productsScreen.isOpened(), "Products screen is not opened");
        productsScreen.clickAddToCartBtn(product);
        CartScreenBase cartScreen = initPage(TopBarMenuBase.class).clickCartIconBtn();
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
        Assert.assertTrue(swagLabsLogInScreen.isOpened(), "Login screen is not opened");
        swagLabsLogInScreen.typeUserName(R.TESTDATA.get("appUser"));
        swagLabsLogInScreen.typePassword(R.TESTDATA.get("appPassword"));
        CatalogScreenBase productsScreen = swagLabsLogInScreen.clickLogInBtn();
        Assert.assertTrue(productsScreen.isOpened(), "Products page is not opened");
        TopLeftMenuBase topLeftMenu = initPage(TopBarMenuBase.class).clickTopLeftMenuBtn();
        swagLabsLogInScreen = topLeftMenu.clickLogoutBtn();
        Assert.assertTrue(swagLabsLogInScreen.isOpened(), "Login screen is not opened");
    }
    //-----------------------------------------------


    @Test
    public void productScreenTest() {
        CatalogScreenBase productsScreen = autoLogInUtil.logIn();
        String product = "Sauce Labs Backpack";
        ProductScreenBase productInformationScreen = productsScreen.clickOnProduct(product);
        Assert.assertTrue(productInformationScreen.isProductPresent(product), "Product is not founded");
    }

    @Test
    public void webviewScreenTest() {
        CatalogScreenBase productsScreen = autoLogInUtil.logIn();
        TopLeftMenuBase topLeftMenu = initPage(TopBarMenuBase.class).clickTopLeftMenuBtn();
        WebviewScreenBase webviewScreen = topLeftMenu.clickWebviewBtn();
        Assert.assertTrue(webviewScreen.isOpened(), "WebView screen is not opened");
        String url = "www.youtube.com";
        webviewScreen.typeUrl(url);
        webviewScreen.clickGoToSiteBtn();
        Assert.assertFalse(webviewScreen.isOpened(), "Url page is not opened");
    }

    @Test
    public void qrCodeScreenTest() {
        CatalogScreenBase productsScreen = autoLogInUtil.logIn();
        TopLeftMenuBase topLeftMenu = initPage(TopBarMenuBase.class).clickTopLeftMenuBtn();
        QrCodeScreenBase qrCodeScreen = topLeftMenu.clickQrCodeScannerBtn();
        AllertScreenBase allertScreen = initPage(AllertScreenBase.class);
        if (allertScreen.isAllertPresent()) allertScreen.clickAllowBtn();
        Assert.assertTrue(qrCodeScreen.isOpened(), "QrCodeScanner screen is not opened");
    }

    @Test
    public void drawScreenTest() {
        CatalogScreenBase productsScreen = autoLogInUtil.logIn();
        TopLeftMenuBase topLeftMenu = initPage(TopBarMenuBase.class).clickTopLeftMenuBtn();
        DrawingScreenBase drawingScreen = topLeftMenu.clickDrawingBtn();
        Assert.assertTrue(drawingScreen.isOpened(), "Screen is not opened");
        Assert.assertTrue(drawingScreen.drawLine(IMobileUtils.Direction.UP, 2000));
        Assert.assertTrue(drawingScreen.isOpened(), "Screen is not opened");
    }

    @Test
    public void aboutScreenTest() {
        CatalogScreenBase productsScreen = autoLogInUtil.logIn();
        TopLeftMenuBase topLeftMenu = initPage(TopBarMenuBase.class).clickTopLeftMenuBtn();
        AboutWebScreenBase aboutWebScreen = topLeftMenu.clickAboutBtn();
        Assert.assertTrue(aboutWebScreen.isOpened(), "SauceLabs web screen is not opened");
    }

    @Test
    public void lockOutUserLogInTest() {
        SwagLabsLogInScreenBase swagLabsLogInScreen = initPage(getDriver(), SwagLabsLogInScreenBase.class);
        Assert.assertTrue(swagLabsLogInScreen.isOpened(), "Login screen is not opened");
        swagLabsLogInScreen.typeUserName(R.TESTDATA.get("lockUser"));
        swagLabsLogInScreen.typePassword(R.TESTDATA.get("appPassword"));
        CatalogScreenBase productsScreen = swagLabsLogInScreen.clickLogInBtn();
        Assert.assertFalse(productsScreen.isOpened(), "It not lock user account");
        Assert.assertTrue(swagLabsLogInScreen.isLockOutMessagePresent(), "User is not locked out");
    }

    @Test(groups = "Problem_User")
    public void puAddToCartTest() {
        CatalogScreenBase productsScreen = autoLogInUtil.problemUserLogIn();
        String product1 = "Sauce Labs Backpack";
        String product2 = "Sauce Labs Bike Light";
        productsScreen.clickAddToCartBtn(product1);
        productsScreen.clickAddToCartBtn(product2);
        CartScreenBase cartScreen = initPage(TopBarMenuBase.class).clickCartIconBtn();
        Assert.assertTrue(cartScreen.isOpened(), "Cart screen is not opened");
        Assert.assertTrue(cartScreen.isProductPresent(product1), "Product is not added on cart");
        Assert.assertFalse(cartScreen.isProductPresent(product2), "Product is added on cart");
    }

    @Test(groups = "Problem_User", description = "Delete From Product screen")
    public void puRemoveProductTest() {
        CatalogScreenBase productsScreen = autoLogInUtil.problemUserLogIn();
        String product = "Sauce Labs Backpack";
        productsScreen.clickAddToCartBtn(product);
        productsScreen.clickRemoveBtn(product);
        Assert.assertFalse(productsScreen.isAddToCartBtnPresent(product));
    }

    @Test(groups = "Problem_User")
    public void puProductScreenTest() {
        CatalogScreenBase productsScreen = autoLogInUtil.problemUserLogIn();
        String product = "Sauce Labs Backpack";
        ProductScreenBase productInformationScreen = productsScreen.clickOnProduct(product);
        Assert.assertFalse(productInformationScreen.isProductPresent(product), "Product is present");
    }

    @Test(groups = "Problem_User", description = "Add to cart from Product  Screen")
    public void addToCartFromProductScreen() {
        CatalogScreenBase productsScreen = autoLogInUtil.problemUserLogIn();
        String product = "Sauce Labs Backpack";
        ProductScreenBase productInformationScreen = productsScreen.clickOnProduct(product);
        productInformationScreen.clickAddToCart();
        CartScreenBase cartScreen = initPage(TopBarMenuBase.class).clickCartIconBtn();
        Assert.assertTrue(cartScreen.isOpened(), "Cart screen is not opened");
        Assert.assertFalse(cartScreen.isProductPresent(product), "Product is added on cart");

    }


}
