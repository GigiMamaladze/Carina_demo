package com.qaprosoft.carina.demo.mobile_components.swaglabapp.utils;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.demo.mobile.gui.swaglabapp.android.SwagLabsLogInScreen;
import com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common.CatalogScreenBase;
import com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common.SwagLabsLogInScreenBase;
import com.zebrunner.carina.utils.R;
import org.testng.Assert;

public class AutoLogInUtil extends AbstractTest {

    public CatalogScreenBase logIn() {
        SwagLabsLogInScreenBase swagLabsLogInScreen = initPage(getDriver(), SwagLabsLogInScreenBase.class);
        Assert.assertTrue(swagLabsLogInScreen.isOpened(), "Login screen is not opened");
        swagLabsLogInScreen.typeUserName(R.TESTDATA.get("appUser"));
        swagLabsLogInScreen.typePassword(R.TESTDATA.get("appPassword"));
        CatalogScreenBase productsScreen = swagLabsLogInScreen.clickLogInBtn();
        Assert.assertTrue(productsScreen.isOpened(), "Products screen is not opened");
        return productsScreen;
    }

    public CatalogScreenBase problemUserLogIn() {
        SwagLabsLogInScreenBase swagLabsLogInScreen = initPage(getDriver(), SwagLabsLogInScreenBase.class);
        Assert.assertTrue(swagLabsLogInScreen.isOpened(), "Login screen is not opened");
        swagLabsLogInScreen.typeUserName(R.TESTDATA.get("problemUser"));
        swagLabsLogInScreen.typePassword(R.TESTDATA.get("appPassword"));
        CatalogScreenBase productsScreen = swagLabsLogInScreen.clickLogInBtn();
        Assert.assertTrue(productsScreen.isOpened(), "Products page is not opened");
        return productsScreen;
    }
}
