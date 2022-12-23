package com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common;

import org.openqa.selenium.WebDriver;

public abstract class ProductsScreenBase extends AbstractMobilePageBase {
    public ProductsScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickAddToCartBtn(String product);

    public abstract ProductInformationScreenBase clickOnProduct(String product);

    public abstract void clickRemoveBtn(String product);

    public abstract boolean isAddToCartBtnPresent(String product);

    public abstract boolean isRemoveBtnPresent(String product);

}
