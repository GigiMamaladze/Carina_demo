package com.qaprosoft.carina.demo.mobile.gui.swaglabapp.ios;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common.CompleteScreenBase;
import com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common.CheckoutOverviewScreenBase;
import org.openqa.selenium.WebDriver;


@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CheckoutOverviewScreenBase.class)
public class CheckoutOverviewScreen extends CheckoutOverviewScreenBase {
    public CheckoutOverviewScreen(WebDriver driver) {
        super(driver);
    }

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label =='%s'`]")
    private ExtendedWebElement productName;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == 'CHECKOUT: OVERVIEW'`]")
    private ExtendedWebElement titleOfOverviewScreen;

    @ExtendedFindBy(accessibilityId = "test-FINISH")
    private ExtendedWebElement finishBtn;

    @Override
    public boolean isOpened() {
        return titleOfOverviewScreen.isElementPresent();
    }

    @Override
    public boolean isProductPresent(String product) {
        return productName.format(product).isElementPresent();
    }

    @Override
    public CompleteScreenBase clickFinishBtn() {
        swipe(finishBtn);
        finishBtn.click();
        return initPage(getDriver(), CompleteScreenBase.class);
    }
}
