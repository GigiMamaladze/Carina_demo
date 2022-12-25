package com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common;

import org.openqa.selenium.WebDriver;


public abstract class ProductScreenBase extends AbstractMobilePageBase {
    public ProductScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickAddToCart();

}
