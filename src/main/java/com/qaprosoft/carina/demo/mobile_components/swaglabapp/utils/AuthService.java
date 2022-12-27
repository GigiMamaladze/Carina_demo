package com.qaprosoft.carina.demo.mobile_components.swaglabapp.utils;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common.CatalogScreenBase;
import com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common.SwagLabsLogInScreenBase;
import com.zebrunner.carina.utils.R;
import org.testng.Assert;

public class AuthService extends AbstractTest {

    private CatalogScreenBase logIn(String user, String password) {
        SwagLabsLogInScreenBase swagLabsLogInScreen = initPage(getDriver(), SwagLabsLogInScreenBase.class);
        Assert.assertTrue(swagLabsLogInScreen.isOpened(), "Login screen is not opened");
        swagLabsLogInScreen.typeUserName(R.TESTDATA.get(user));
        swagLabsLogInScreen.typePassword(R.TESTDATA.get(password));
        CatalogScreenBase productsScreen = swagLabsLogInScreen.clickLogInBtn();
        Assert.assertTrue(productsScreen.isOpened(), "Products screen is not opened");
        return productsScreen;

    }

    public CatalogScreenBase loginWithStandardUser() {
        return logIn("appUser", "appPassword");
    }

    public CatalogScreenBase loginWithProblemUser() {
        return logIn("problemUser", "appPassword");
    }
}
