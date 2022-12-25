package com.qaprosoft.carina.demo.mytests;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.zebrunner.carina.utils.R;
import com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common.*;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwagLabsTest extends AbstractTest {

    @Test
    public void loginTest() {
        SwagLabsLogInScreenBase swagLabsLogInScreen = initPage(getDriver(), SwagLabsLogInScreenBase.class);
        Assert.assertTrue(swagLabsLogInScreen.isOpened(), "Login screen is not opened");
        swagLabsLogInScreen.typeUserName(R.TESTDATA.get("appUser"));
        swagLabsLogInScreen.typePassword(R.TESTDATA.get("appPassword"));
        ItemsScreenBase productsScreen = swagLabsLogInScreen.clickLogInBtn();
        Assert.assertTrue(productsScreen.isOpened(), "Products page is not opened");
    }

    @Test
    public void addToCartTest() {
        SwagLabsLogInScreenBase swagLabsLogInScreen = initPage(getDriver(), SwagLabsLogInScreenBase.class);
        Assert.assertTrue(swagLabsLogInScreen.isOpened(), "Login screen is not opened");
        swagLabsLogInScreen.typeUserName(R.TESTDATA.get("appUser"));
        swagLabsLogInScreen.typePassword(R.TESTDATA.get("appPassword"));
        ItemsScreenBase productsScreen = swagLabsLogInScreen.clickLogInBtn();
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
        Assert.assertTrue(swagLabsLogInScreen.isOpened(), "Login screen is not opened");
        swagLabsLogInScreen.typeUserName(R.TESTDATA.get("appUser"));
        swagLabsLogInScreen.typePassword(R.TESTDATA.get("appPassword"));
        ItemsScreenBase productsScreen = swagLabsLogInScreen.clickLogInBtn();
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
        Assert.assertTrue(swagLabsLogInScreen.isOpened(), "Login screen is not opened");
        swagLabsLogInScreen.typeUserName(R.TESTDATA.get("appUser"));
        swagLabsLogInScreen.typePassword(R.TESTDATA.get("appPassword"));
        ItemsScreenBase productsScreen = swagLabsLogInScreen.clickLogInBtn();
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
        Assert.assertTrue(swagLabsLogInScreen.isOpened(), "Login screen is not opened");
        swagLabsLogInScreen.typeUserName(R.TESTDATA.get("appUser"));
        swagLabsLogInScreen.typePassword(R.TESTDATA.get("appPassword"));
        ItemsScreenBase productsScreen = swagLabsLogInScreen.clickLogInBtn();
        Assert.assertTrue(productsScreen.isOpened(), "Products page is not opened");
        TopBarMenuBase topBarMenu = initPage(TopBarMenuBase.class);
        TopLeftMenuBase topLeftMenu = topBarMenu.clickTopLeftMenuBtn();
        swagLabsLogInScreen = topLeftMenu.clickLogoutBtn();
        Assert.assertTrue(swagLabsLogInScreen.isOpened(), "Login screen is not opened");
    }
    //-----------------------------------------------


    @Test
    public void productScreenTest() {
        SwagLabsLogInScreenBase swagLabsLogInScreen = initPage(getDriver(), SwagLabsLogInScreenBase.class);
        Assert.assertTrue(swagLabsLogInScreen.isOpened(), "Login screen is not opened");
        swagLabsLogInScreen.typeUserName(R.TESTDATA.get("appUser"));
        swagLabsLogInScreen.typePassword(R.TESTDATA.get("appPassword"));
        ItemsScreenBase productsScreen = swagLabsLogInScreen.clickLogInBtn();
        Assert.assertTrue(productsScreen.isOpened(), "Products page is not opened");
        String product = "Sauce Labs Backpack";
        ProductScreenBase productInformationScreen = productsScreen.clickOnProduct(product);
        Assert.assertTrue(productInformationScreen.isProductPresent(product), "Product is not founded");
    }

    @Test
    public void webviewScreenTest() {
        SwagLabsLogInScreenBase swagLabsLogInScreen = initPage(getDriver(), SwagLabsLogInScreenBase.class);
        Assert.assertTrue(swagLabsLogInScreen.isOpened(), "Login screen is not opened");
        swagLabsLogInScreen.typeUserName(R.TESTDATA.get("appUser"));
        swagLabsLogInScreen.typePassword(R.TESTDATA.get("appPassword"));
        ItemsScreenBase productsScreen = swagLabsLogInScreen.clickLogInBtn();
        Assert.assertTrue(productsScreen.isOpened(), "Products screen is not opened");
        TopBarMenuBase topBarMenu = initPage(TopBarMenuBase.class);
        TopLeftMenuBase topLeft = topBarMenu.clickTopLeftMenuBtn();
        WebviewScreenBase webviewScreen = topLeft.clickWebviewBtn();
        Assert.assertTrue(webviewScreen.isOpened(), "WebView screen is not opened");
        String url = "www.youtube.com";
        webviewScreen.typeUrl(url);
        webviewScreen.clickGoToSiteBtn();
        Assert.assertFalse(webviewScreen.isOpened(), "Url page is not opened");
    }

    @Test
    public void qrCodeScreenTest() {
        SwagLabsLogInScreenBase swagLabsLogInScreen = initPage(getDriver(), SwagLabsLogInScreenBase.class);
        Assert.assertTrue(swagLabsLogInScreen.isOpened(), "Login screen is not opened");
        swagLabsLogInScreen.typeUserName(R.TESTDATA.get("appUser"));
        swagLabsLogInScreen.typePassword(R.TESTDATA.get("appPassword"));
        ItemsScreenBase productsScreen = swagLabsLogInScreen.clickLogInBtn();
        Assert.assertTrue(productsScreen.isOpened(), "Products screen is not opened");
        TopBarMenuBase topBarMenu = initPage(TopBarMenuBase.class);
        TopLeftMenuBase topLeft = topBarMenu.clickTopLeftMenuBtn();
        QrCodeScreenBase qrCodeScreen = topLeft.clickQrCodeScannerBtn();
        qrCodeScreen.handleAlert();
        Assert.assertTrue(qrCodeScreen.isOpened(), "QrCodeScanner screen is not opened");
    }

    @Test
    public void drawScreenTest() {
        SwagLabsLogInScreenBase swagLabsLogInScreen = initPage(getDriver(), SwagLabsLogInScreenBase.class);
        Assert.assertTrue(swagLabsLogInScreen.isOpened(), "Login screen is not opened");
        swagLabsLogInScreen.typeUserName(R.TESTDATA.get("appUser"));
        swagLabsLogInScreen.typePassword(R.TESTDATA.get("appPassword"));
        ItemsScreenBase productsScreen = swagLabsLogInScreen.clickLogInBtn();
        Assert.assertTrue(productsScreen.isOpened(), "Products screen is not opened");
        TopBarMenuBase topBarMenu = initPage(TopBarMenuBase.class);
        TopLeftMenuBase topLeft = topBarMenu.clickTopLeftMenuBtn();
        DrawingScreenBase drawingScreen = topLeft.clickDrawingBtn();
        Assert.assertTrue(drawingScreen.isOpened(), "Screen is not opened");
        Assert.assertTrue(drawingScreen.isDraw(IMobileUtils.Direction.UP, 2000));
    }

    @Test
    public void aboutScreenTest() {
        SwagLabsLogInScreenBase swagLabsLogInScreen = initPage(getDriver(), SwagLabsLogInScreenBase.class);
        Assert.assertTrue(swagLabsLogInScreen.isOpened(), "Login screen is not opened");
        swagLabsLogInScreen.typeUserName(R.TESTDATA.get("appUser"));
        swagLabsLogInScreen.typePassword(R.TESTDATA.get("appPassword"));
        ItemsScreenBase productsScreen = swagLabsLogInScreen.clickLogInBtn();
        Assert.assertTrue(productsScreen.isOpened(), "Products screen is not opened");
        TopBarMenuBase topBarMenu = initPage(TopBarMenuBase.class);
        TopLeftMenuBase topLeft = topBarMenu.clickTopLeftMenuBtn();
        AboutWebScreenBase aboutWebScreen = topLeft.clickAboutBtn();
        Assert.assertTrue(aboutWebScreen.isOpened(), "SauceLabs web screen is not opened");
    }

    @Test
    public void lockOutUserLogInTest() {
        SwagLabsLogInScreenBase swagLabsLogInScreen = initPage(getDriver(), SwagLabsLogInScreenBase.class);
        Assert.assertTrue(swagLabsLogInScreen.isOpened(), "Login screen is not opened");
        swagLabsLogInScreen.typeUserName(R.TESTDATA.get("lockUser"));
        swagLabsLogInScreen.typePassword(R.TESTDATA.get("appPassword"));
        ItemsScreenBase productsScreen = swagLabsLogInScreen.clickLogInBtn();
        Assert.assertFalse(productsScreen.isOpened(), "It not lock user account");
        Assert.assertTrue(swagLabsLogInScreen.isLockOutMessagePopsUp(), "User is not locked out");
    }

    @Test(groups = "Problem_User")
    public void puAddToCartTest() {
        SwagLabsLogInScreenBase swagLabsLogInScreen = initPage(getDriver(), SwagLabsLogInScreenBase.class);
        Assert.assertTrue(swagLabsLogInScreen.isOpened(), "Login screen is not opened");
        swagLabsLogInScreen.typeUserName(R.TESTDATA.get("problemUser"));
        swagLabsLogInScreen.typePassword(R.TESTDATA.get("appPassword"));
        ItemsScreenBase productsScreen = swagLabsLogInScreen.clickLogInBtn();
        Assert.assertTrue(productsScreen.isOpened(), "Products screen is not opened");
        String productOne = "Sauce Labs Backpack";
        String productTwo = "Sauce Labs Bike Light";
        productsScreen.clickAddToCartBtn(productOne);
        productsScreen.clickAddToCartBtn(productTwo);
        TopBarMenuBase topBarMenu = initPage(TopBarMenuBase.class);
        CartScreenBase cartScreen = topBarMenu.clickCartIconBtn();
        Assert.assertTrue(cartScreen.isOpened(), "Cart screen is not opened");
        Assert.assertTrue(cartScreen.isProductPresent(productOne), "Product is not added on cart");
        Assert.assertFalse(cartScreen.isProductPresent(productTwo), "Product is added on cart");
    }

    @Test(groups = "Problem_User", description = "Delete From Product screen")
    public void puRemoveProductTest() {
        SwagLabsLogInScreenBase swagLabsLogInScreen = initPage(getDriver(), SwagLabsLogInScreenBase.class);
        Assert.assertTrue(swagLabsLogInScreen.isOpened(), "Login screen is not opened");
        swagLabsLogInScreen.typeUserName(R.TESTDATA.get("problemUser"));
        swagLabsLogInScreen.typePassword(R.TESTDATA.get("appPassword"));
        ItemsScreenBase productsScreen = swagLabsLogInScreen.clickLogInBtn();
        Assert.assertTrue(productsScreen.isOpened(), "Products screen is not opened");
        String product = "Sauce Labs Backpack";
        productsScreen.clickAddToCartBtn(product);
        productsScreen.clickRemoveBtn(product);
        Assert.assertFalse(productsScreen.isAddToCartBtnPresent(product));
    }

    @Test(groups = "Problem_User")
    public void puProductScreenTest() {
        SwagLabsLogInScreenBase swagLabsLogInScreen = initPage(getDriver(), SwagLabsLogInScreenBase.class);
        Assert.assertTrue(swagLabsLogInScreen.isOpened(), "Login screen is not opened");
        swagLabsLogInScreen.typeUserName(R.TESTDATA.get("problemUser"));
        swagLabsLogInScreen.typePassword(R.TESTDATA.get("appPassword"));
        ItemsScreenBase productsScreen = swagLabsLogInScreen.clickLogInBtn();
        Assert.assertTrue(productsScreen.isOpened(), "Products page is not opened");
        String product = "Sauce Labs Backpack";
        ProductScreenBase productInformationScreen = productsScreen.clickOnProduct(product);
        Assert.assertFalse(productInformationScreen.isProductPresent(product), "Product is present");
    }

    @Test(groups = "Problem_User", description = "Add to cart from Product  Screen")
    public void addToCartFromProductScreen() {
        SwagLabsLogInScreenBase swagLabsLogInScreen = initPage(getDriver(), SwagLabsLogInScreenBase.class);
        Assert.assertTrue(swagLabsLogInScreen.isOpened(), "Login screen is not opened");
        swagLabsLogInScreen.typeUserName(R.TESTDATA.get("problemUser"));
        swagLabsLogInScreen.typePassword(R.TESTDATA.get("appPassword"));
        ItemsScreenBase productsScreen = swagLabsLogInScreen.clickLogInBtn();
        Assert.assertTrue(productsScreen.isOpened(), "Products page is not opened");
        String product = "Sauce Labs Backpack";
        ProductScreenBase productInformationScreen = productsScreen.clickOnProduct(product);
        productInformationScreen.clickAddToCart();
        TopBarMenuBase topBarMenu = initPage(TopBarMenuBase.class);
        CartScreenBase cartScreen = topBarMenu.clickCartIconBtn();
        Assert.assertTrue(cartScreen.isOpened(), "Cart screen is not opened");
        Assert.assertFalse(cartScreen.isProductPresent(product), "Product is added on cart");

    }


}
