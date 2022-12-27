package com.qaprosoft.carina.demo.mobile.gui.swaglabapp.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common.DrawingScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = DrawingScreenBase.class)
public class DrawingScreen extends DrawingScreenBase {
    public DrawingScreen(WebDriver driver) {
        super(driver);
    }

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"Vertical scroll bar, 1 page Horizontal scroll bar, 1 page\"`][1]")
    private ExtendedWebElement drawPanel;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == 'DRAWING'`]")
    private ExtendedWebElement drawScreenTitle;

    @Override
    public boolean drawLine(Direction direction, int duration) {
        return swipeInContainer(drawPanel, direction, duration);
    }

    @Override
    public boolean isOpened() {
        return drawScreenTitle.isElementPresent();
    }
}
