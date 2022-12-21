package com.qaprosoft.carina.demo.mytests;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.demo.mobile.gui.carinaapplication.models.User;
import org.testng.annotations.Test;

public class DataProviderTest extends AbstractTest {


    @Test(dataProvider = "dprovider")
    public void myTest(User user) {
        System.out.println("login to : " + user.getLogin() + user.getPassword());
    }

}
