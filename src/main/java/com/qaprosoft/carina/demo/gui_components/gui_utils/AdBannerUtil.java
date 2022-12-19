package com.qaprosoft.carina.demo.gui_components.gui_utils;

import com.qaprosoft.carina.demo.gui.mytests.automation_excercise.components.AdBanner;
import org.openqa.selenium.WebDriver;

import static com.zebrunner.agent.core.webdriver.RemoteWebDriverFactory.getDriver;

public final class AdBannerUtil {

    public static void adBannerHandler(WebDriver webDriver) {
        AdBanner adBanner = new AdBanner(webDriver);
        if (adBanner.isBannerPresent()) {
            adBanner.clickDismissBtn();
        } else System.out.println("Not found any banner");
    }
}
