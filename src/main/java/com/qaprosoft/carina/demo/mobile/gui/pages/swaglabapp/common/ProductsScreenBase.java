package com.qaprosoft.carina.demo.mobile.gui.pages.swaglabapp.common;

import org.openqa.selenium.WebDriver;

public abstract class ProductsScreenBase extends AbstractMobilePageBase {
    public ProductsScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickAddToCartBtn(String product);


}
