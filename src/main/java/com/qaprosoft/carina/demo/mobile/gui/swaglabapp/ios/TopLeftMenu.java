package com.qaprosoft.carina.demo.mobile.gui.swaglabapp.ios;


import com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common.*;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = TopLeftMenuBase.class)
public class TopLeftMenu extends TopLeftMenuBase {
    public TopLeftMenu(WebDriver driver) {
        super(driver);
    }

    @ExtendedFindBy(accessibilityId = "test-LOGOUT")
    private ExtendedWebElement logoutBtn;

    @ExtendedFindBy(accessibilityId = "test-WEBVIEW")
    private ExtendedWebElement webViewBtn;

    @ExtendedFindBy(accessibilityId = "test-QR CODE SCANNER")
    private ExtendedWebElement qrCodeScannerBtn;

    @ExtendedFindBy(accessibilityId = "test-ABOUT")
    private ExtendedWebElement aboutBtn;

    @Override
    public SwagLabsLogInScreenBase clickLogoutBtn() {
        logoutBtn.click();
        return initPage(getDriver(), SwagLabsLogInScreenBase.class);
    }

    @Override
    public WebviewScreenBase clickWebviewBtn() {
        webViewBtn.click();
        return initPage(getDriver(), WebviewScreenBase.class);
    }

    @Override
    public QrCodeScreenBase clickQrCodeScannerBtn() {
         qrCodeScannerBtn.click();
         return initPage(getDriver(), QrCodeScreenBase.class);
    }

    @Override
    public AboutWebScreenBase clickAboutBtn() {
        aboutBtn.click();
        return initPage(getDriver(), AboutWebScreenBase.class);
    }
}
