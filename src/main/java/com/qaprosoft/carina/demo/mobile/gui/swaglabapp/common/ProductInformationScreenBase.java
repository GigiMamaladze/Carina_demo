package com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common;

import org.openqa.selenium.WebDriver;


public abstract class ProductInformationScreenBase extends AbstractMobilePageBase {
    public ProductInformationScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract void addToCart();

}
