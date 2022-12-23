package com.qaprosoft.carina.demo.mobile.gui.swaglabapp.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common.QrCodeScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
@DeviceType(pageType = DeviceType.Type.IOS_PHONE,parentClass = QrCodeScreenBase.class)
public class QrCodeScreen extends QrCodeScreenBase {
    public QrCodeScreen(WebDriver driver) {
        super(driver);
    }

    @ExtendedFindBy(accessibilityId = "OK")
    private ExtendedWebElement alertOkBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == 'Scan a QR Code that contains a url. It will be opened in the default browser.'`][4]")
    private ExtendedWebElement message;

    @Override
    public boolean isAlertPresent() {
        return alertOkBtn.isElementPresent();
    }

    @Override
    public void handleAlert() {
       if (isAlertPresent()) alertOkBtn.click();
    }

    @Override
    public boolean isOpened() {
        return message.isElementPresent();
    }
}
