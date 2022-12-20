package com.qaprosoft.carina.demo.mobile.gui.pages.swaglabapp.common;

import org.openqa.selenium.WebDriver;

public abstract class CartScreenBase extends AbstractMobilePageBase {
    public CartScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract void removeProduct(String product);

    public abstract CheckoutScreenBase clickCheckoutBtn();
}
