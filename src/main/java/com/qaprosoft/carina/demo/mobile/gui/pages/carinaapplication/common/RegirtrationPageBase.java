package com.qaprosoft.carina.demo.mobile.gui.pages.carinaapplication.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.carinaapplication.models.User;
import org.openqa.selenium.WebDriver;

public abstract class RegirtrationPageBase extends AbstractPage {

    public RegirtrationPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void tapName(String name);
    public abstract void tapPassword(String password);
    public abstract void chooseMaleGender();
    public abstract void chooseFemaleGender();
    public abstract void clickAgree();

    public abstract void clickSingUpBtn();

    public abstract UserAccountPageBase logIn(User user, String gender);
}
