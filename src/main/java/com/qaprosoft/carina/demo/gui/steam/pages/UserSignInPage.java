package com.qaprosoft.carina.demo.gui.steam.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class UserSignInPage extends AbstractPage {

    @FindBy(xpath = "//*[@id='responsive_page_template_content']/div/div[2]/div/div/div/div[2]/div/form/div[1]/input")
    private ExtendedWebElement accountName;

    @FindBy(xpath = "//*[@id='responsive_page_template_content']/div/div[2]/div/div/div/div[2]/div/form/div[2]/input")
    private ExtendedWebElement password;

    @FindBy(xpath = "//*[@id='responsive_page_template_content']/div/div[2]/div/div/div/div[2]/div/form/div[4]/button")
    private ExtendedWebElement signInBtn;

    @FindBy(xpath = "//*[@id='base']")
    private ExtendedWebElement rememberMeBtn;

    public UserSignInPage(WebDriver driver) {
        super(driver);
    }

    public boolean isAccountNameExist() {
        return accountName.isElementPresent();
    }

    public boolean isPasswordExist() {
        return password.isElementPresent();
    }

    public boolean isSignInBtnExist() {
        return signInBtn.isElementPresent();
    }

    public boolean isRememberMeBtnExsit() {
        return rememberMeBtn.isElementPresent();
    }


    public SteamGuardPage signIn(String acc, String pas) {
        accountName.type(acc);
        password.type(pas);
        rememberMeBtn.click();
        signInBtn.click();
        return new SteamGuardPage(getDriver());
    }


}
