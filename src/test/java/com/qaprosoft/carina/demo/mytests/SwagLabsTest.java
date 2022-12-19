package com.qaprosoft.carina.demo.mytests;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.demo.mobile.gui.pages.mydemoapp.common.SwagLabsLogInPageBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwagLabsTest extends AbstractTest {

    @Test
    public void testApplication(){
        SwagLabsLogInPageBase swagLabsLogInPageBase = initPage(getDriver(), SwagLabsLogInPageBase.class);
        swagLabsLogInPageBase.typeUserName("Gigi");
    }
}
