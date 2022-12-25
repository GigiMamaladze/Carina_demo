package com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common;

import org.openqa.selenium.WebDriver;

public abstract class SwagLabsLogInScreenBase extends AbstractMobilePageBase {
    public SwagLabsLogInScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract void typeUserName(String userName);

    public abstract void typePassword(String password);

    public abstract ItemsScreenBase clickLogInBtn();

    public abstract boolean isLockOutMessagePopsUp();

}
