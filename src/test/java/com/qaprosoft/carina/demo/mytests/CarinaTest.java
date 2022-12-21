package com.qaprosoft.carina.demo.mytests;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.demo.mobile.gui.carinaapplication.common.CarinaHomePageBase;
import com.qaprosoft.carina.demo.mobile.gui.carinaapplication.common.RegirtrationPageBase;
import com.qaprosoft.carina.demo.mobile.gui.carinaapplication.common.UserAccountPageBase;
import com.qaprosoft.carina.demo.mobile.gui.carinaapplication.models.User;
;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CarinaTest extends AbstractTest {
    @DataProvider(name = "dprovider")
    public Object[][] dpMethod() {
        return new Object[][]{
                {new User("nika", "nika")},
                {new User("gigi", "gigi")}};
    }

    @Test(dataProvider = "dprovider")
    public void testLogIn(User user) {
        CarinaHomePageBase carinaHomePage = initPage(getDriver(), CarinaHomePageBase.class);
        Assert.assertTrue(carinaHomePage.isPageOpened(), "Page not found ERROR");
        RegirtrationPageBase regirtrationPageBase = carinaHomePage.clickNextBtn();
        UserAccountPageBase userAccountPageBase = regirtrationPageBase.logIn(user, "Male");
        Assert.assertTrue(userAccountPageBase.isPageOpened(), "Page not Found ERROR");

    }

}
