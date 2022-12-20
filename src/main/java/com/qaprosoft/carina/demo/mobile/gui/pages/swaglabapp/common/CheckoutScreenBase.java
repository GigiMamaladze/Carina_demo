package com.qaprosoft.carina.demo.mobile.gui.pages.swaglabapp.common;

import org.openqa.selenium.WebDriver;

public abstract class CheckoutScreenBase extends AbstractMobilePageBase {
    public CheckoutScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract void typeFirstName(String name);

    public abstract void typeLastName(String lastName);

    public abstract void typeZipcode(String zipCode);

    public abstract OverviewScreenBase clickContinueBtn();


}
