package com.qaprosoft.carina.demo.mobile.gui.swaglabapp.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common.WebviewScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE,parentClass = WebviewScreenBase.class)
public class WebviewScreen extends WebviewScreenBase {
    public WebviewScreen(WebDriver driver) {
        super(driver);
    }


    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == 'WEBVIEW SELECTION'`]")
    private ExtendedWebElement webviewTitle;

    @ExtendedFindBy(accessibilityId = "test-enter a https url here...")
    private ExtendedWebElement urlTextField;

    @ExtendedFindBy(accessibilityId = "test-GO TO SITE")
    private ExtendedWebElement goToSiteBtn;

    @Override
    public boolean isOpened() {
        return webviewTitle.isElementPresent();
    }

    @Override
    public void typeUrl(String url) {
        urlTextField.type(url);
    }

    @Override
    public void clickGoToSiteBtn() {
       goToSiteBtn.click();
    }

}
