package com.qaprosoft.carina.demo.mytests;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.gui.mytests.steam.pages.SteamGuardPage;
import com.qaprosoft.carina.demo.gui.mytests.steam.components.CardPayment;
import com.qaprosoft.carina.demo.gui.mytests.steam.components.PaymentMethodLists;
import com.qaprosoft.carina.demo.gui.mytests.steam.pages.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static org.testng.Assert.assertTrue;


public class SteamTest extends AbstractTest {
    private static final Logger LOGGER = LogManager.getLogger(SteamTest.class);

//    private static Properties properties = new Properties();
//
//    private static String accountName;
//    private static String accountPassword;
//
//
//
//    static {
//        try (FileInputStream f = new FileInputStream("D:\\Java Projects\\Test Automation\\carinaapplication-demo\\src\\main\\resources\\userInformation.properties")) {
//            properties.load(f);
//        } catch (IOException e) {
//            LOGGER.info(e);
//        }
//        accountName = properties.getProperty("accountName");
//        accountPassword = properties.getProperty("accountPassword");
//
//    }

    @Test
    @MethodOwner(owner = "Gigi")
    public void testForBuyGameAllAge(){
        SteamHomePage steamHomePage = new SteamHomePage(getDriver());
        steamHomePage.open();
        assertTrue(steamHomePage.isSearchPresent(),"Home Page is not Exsit");


        SearchedGamesPage searchedGamesPage =steamHomePage.searchGame("Fifa");
        assertTrue(searchedGamesPage.isGamePresent(),"Searched Page is not Exsit");
        pause(2);


        ChosenGamePage chosenGamePage = searchedGamesPage.clickSearchedGame();
        assertTrue(chosenGamePage.isAddToCartBtnPresent(),"Game is Not Exsit");
        pause(2);



        BuyGamePage buyGamePage = chosenGamePage.clickAddToCartBtn();
        assertTrue(buyGamePage.isPurchaseForMyselfBtnPresent(),"Purchase For MySelf Button not Exsit");
        pause(2);

        UserSignInPage userSignInPage = buyGamePage.clickPurchaseForMyselfBtn();
        assertTrue(userSignInPage.isAccountNameExist(),"Account Name box is not Exsit");
        assertTrue(userSignInPage.isPasswordExist(),"Account Name box is not Exsit");
        assertTrue(userSignInPage.isSignInBtnExist(),"Account Name box is not Exsit");
        assertTrue(userSignInPage.isRememberMeBtnExsit(),"Remember btn is not Exsit");
        pause(2);

        SteamGuardPage steamGuardPage = userSignInPage.signIn("testapp13","fortest1234");
        pause(2);

        assertTrue(steamGuardPage.isCodePageExsit(), "Code Page is not Exsit");
        pause(20);

        PaymentProcessHomePage paymentProcessHomePage = steamGuardPage.writeCode();
        assertTrue(paymentProcessHomePage.isPaymentMethodListExsit(), "PaymentMethodList is not Exsit");
        pause(2);

        PaymentMethodLists paymentMethodLists = paymentProcessHomePage.choosingPaymentMethod();
        assertTrue(paymentMethodLists.isVisaBtnExsit(),"VisaBtn is not Exsit");
        pause(2);

        CardPayment cardPayment =paymentMethodLists.choosePaymentMethod();
        cardPayment.fillFields(1231245L,"Gigi","Mamaladze","batumi",111,"benze","Benze",12,5912331);
        pause(5);

    }

    @Test
    @MethodOwner(owner = "Gigi")
    public void testForBuyGameContentAge() {
        SteamHomePage steamHomePage = new SteamHomePage(getDriver());
        steamHomePage.open();
        assertTrue(steamHomePage.isSearchPresent(), "Home Page is not Exsit");


        SearchedGamesPage searchedGamesPage = steamHomePage.searchGame("Call of Duty");
        assertTrue(searchedGamesPage.isGamePresent(), "Searched Page is not Exsit");
        pause(2);


        ContentAgePage contentAgePage = searchedGamesPage.clickSearchedContentAgeGame();
        assertTrue(contentAgePage.isAgeDayListExsit(), "Age Day List is not Exsit");
        assertTrue(contentAgePage.isAgeMonthListExsit(), "Age Month List is not Exsit");
        assertTrue(contentAgePage.isAgeYearListExsit(), " Age Year List is not Exsit");
        assertTrue(contentAgePage.isOpenPageBtnExsit(), " OpenPage Button is not Exsit");
        pause(2);


        ChosenGamePage chosenGamePage = contentAgePage.writeContentAge();
        assertTrue(chosenGamePage.isAddToCartBtnPresent(), "Game is Not Exsit");
        pause(2);

        BuyGamePage buyGamePage = chosenGamePage.clickAddToCartBtn();
        assertTrue(buyGamePage.isPurchaseForMyselfBtnPresent(), "Purchase For MySelf Button not Exsit");
        pause(2);

        UserSignInPage userSignInPage = buyGamePage.clickPurchaseForMyselfBtn();
        assertTrue(userSignInPage.isAccountNameExist(), "Account Name box is not Exsit");
        assertTrue(userSignInPage.isPasswordExist(), "Account Name box is not Exsit");
        assertTrue(userSignInPage.isSignInBtnExist(), "Account Name box is not Exsit");
        assertTrue(userSignInPage.isRememberMeBtnExsit(), "Remember btn is not Exsit");
        pause(2);

        SteamGuardPage steamGuardPage = userSignInPage.signIn("testapp13","fortest1234");
        assertTrue(steamGuardPage.isCodePageExsit(), "Code Page is not Exsit");
        pause(20);

        PaymentProcessHomePage paymentProcessHomePage = steamGuardPage.writeCode();
        assertTrue(paymentProcessHomePage.isPaymentMethodListExsit(), "PaymentMethodList is not Exsit");
        pause(2);

        PaymentMethodLists paymentMethodLists = paymentProcessHomePage.choosingPaymentMethod();
        assertTrue(paymentMethodLists.isVisaBtnExsit(),"VisaBtn is not Exsit");
        pause(2);

        CardPayment cardPayment =paymentMethodLists.choosePaymentMethod();
        cardPayment.fillFields(1231245L,"Gigi","Mamaladze","batumi",111,"benze","Benze",12,5912331);
        pause(5);
    }
}
