package com.qaprosoft.carina.demo.mobile.gui.swaglabapp.ios;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common.ProductScreenBase;
import com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common.CatalogScreenBase;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CatalogScreenBase.class)
public class CatalogScreen extends CatalogScreenBase {
    public CatalogScreen(WebDriver driver) {
        super(driver);
    }


    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == 'PRODUCTS'`]")
    private ExtendedWebElement productsTitle;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[$type == 'XCUIElementTypeStaticText' AND name == 'test-Item title' AND label == '%s'$][-3]/**/XCUIElementTypeOther[`name == 'test-ADD TO CART'`]")
    private ExtendedWebElement productAddToCartBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[$type == 'XCUIElementTypeStaticText' AND name == 'test-Item title' AND label == '%s'$][-3]")
    private ExtendedWebElement productList;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[$type == 'XCUIElementTypeStaticText' AND name == 'test-Item title' AND label == '%s'$][-3]/**/XCUIElementTypeOther[`name = 'test-REMOVE'`]")
    private ExtendedWebElement productRemoveBtn;

    @Override
    public boolean isOpened() {
        return productsTitle.isElementPresent();
    }

    @Override
    public void clickAddToCartBtn(String product) {
        productAddToCartBtn.format(product).click();
    }

    @Override
    public ProductScreenBase clickOnProduct(String product) {
        productList.format(product).click();
        return initPage(getDriver(), ProductScreenBase.class);
    }

    @Override
    public void clickRemoveBtn(String product) {
        productRemoveBtn.format(product).click();
    }

    @Override
    public boolean isAddToCartBtnPresent(String product) {
        return productAddToCartBtn.format(product).isElementPresent();
    }

    @Override
    public boolean isRemoveBtnPresent(String product) {
        return productRemoveBtn.format(product).isElementPresent();
    }


}
