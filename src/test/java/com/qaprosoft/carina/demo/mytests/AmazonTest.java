package com.qaprosoft.carina.demo.mytests;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.demo.gui.mytests.amazon.components.ComputerMenu;
import com.qaprosoft.carina.demo.gui.mytests.amazon.components.Menu;
import com.qaprosoft.carina.demo.gui.mytests.amazon.components.enums.Brands;
import com.qaprosoft.carina.demo.gui.mytests.amazon.components.enums.Seller;
import com.qaprosoft.carina.demo.gui.mytests.amazon.components.enums.SortedList;
import com.qaprosoft.carina.demo.gui.mytests.amazon.pages.AmazonHomePage;
import com.qaprosoft.carina.demo.gui.mytests.amazon.pages.SearchedResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends AbstractTest {

    @Test
    public void testComputerResources(){
        AmazonHomePage amazonHomePage = new AmazonHomePage(getDriver());
        amazonHomePage.open();
        Assert.assertTrue(amazonHomePage.isPageOpened(),"Page is not opened");
        Menu menu = amazonHomePage.clickMenu();
        Assert.assertTrue(menu.isPageOpened(),"Page is not Opened");
        ComputerMenu computerMenu = menu.clickComputerMenu();
        Assert.assertTrue(computerMenu.isPageOpened(),"Page is not Opened");
        SearchedResultPage searchedResultPage = computerMenu.clickComputerComponentsBtn();
        Assert.assertTrue(searchedResultPage.isPageOpened(),"Page is not Opened");
        searchedResultPage.chooseSortProcess(SortedList.AVGCOSTUMERREVIEW);
        searchedResultPage.chooseBrands(Brands.SAMSUNG);
        searchedResultPage.chooseSeller(Seller.AMAZON);
        Assert.assertTrue(searchedResultPage.isPageOpened(),"Page is not Opened");

    }
}
