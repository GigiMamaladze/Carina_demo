package com.qaprosoft.carina.demo.gui_tests;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.demo.gui_components.automation_excercise.enums.Brands;
import com.zebrunner.carina.utils.R;
import com.qaprosoft.carina.demo.gui.automation_excercise.components.AddedProductPopup;
import com.qaprosoft.carina.demo.gui.automation_excercise.pages.*;
import com.qaprosoft.carina.demo.gui_components.automation_excercise.utils.AdBannerUtil;
import com.qaprosoft.carina.demo.gui_components.automation_excercise.enums.categories.Categories;
import com.qaprosoft.carina.demo.gui_components.automation_excercise.enums.categories.subcategories.KidsSubCategory;
import com.qaprosoft.carina.demo.gui_components.automation_excercise.enums.categories.subcategories.MenSubCategories;
import com.qaprosoft.carina.demo.gui_components.automation_excercise.enums.categories.subcategories.WomenSubCategories;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AutomationExerciseTest extends AbstractTest {


    @Test
    public void loginTest() {

        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Page is not opened");
        SingUpLogInPage singUpLogInPage = homePage.getMenu().clickSingUpLogInBtn();
        Assert.assertTrue(singUpLogInPage.isPageOpened(), "Page is not opened");
        singUpLogInPage.typeEmail(R.TESTDATA.get("email"));
        singUpLogInPage.typePassword(R.TESTDATA.get("password"));
        singUpLogInPage.clickLogInBtn();
        Assert.assertTrue(homePage.getMenu().isAccountDisplayed(R.TESTDATA.get("userName")), "Account is not displayed");
    }

    @Test
    public void addToCardTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Page is not opened");
        ProductsPage productsPage = homePage.getMenu().clickProductsBtn();
        Assert.assertTrue(productsPage.isPageOpened(), "Page is not opened");
        String product = "Blue Top";
        productsPage.getProducts().scrollToItem(product);
        Assert.assertTrue(productsPage.getProducts().isItemPresent(product), "item is not exist");
        productsPage.getProducts().hoverItem(product);
        AddedProductPopup addedProductPopup = productsPage.getProducts().addToCard(product);
        Assert.assertTrue(addedProductPopup.isPageOpened(), "Page is not opened");
        addedProductPopup.clickContinueShoppingBtn();
        CartPage cartPage = productsPage.getMenu().clickToCartBtn();
        Assert.assertTrue(cartPage.isItemPresent(product), "Item is not exist");
    }

    @Test
    public void removeProductTest() {
        /* To remove product from the cart, first we need to add produ
         */
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Page is not opened");
        String product = "Blue Top";
        Assert.assertTrue(homePage.getProducts().isItemPresent(product), "item is not exist");
        homePage.getProducts().scrollToItem(product);
        homePage.getProducts().hoverItem(product);
        AddedProductPopup addedProductPopup = homePage.getProducts().addToCard(product);
        Assert.assertTrue(addedProductPopup.isPageOpened(), "Page is not opened");
        addedProductPopup.clickContinueShoppingBtn();
        homePage.getMenu().scrollToCartBtn();
        CartPage cartPage = homePage.getMenu().clickToCartBtn();
        Assert.assertTrue(cartPage.isItemPresent(product), "Item is not exist");
        cartPage.clickXbtn();
        Assert.assertTrue(cartPage.isCartEmpty(), "Cart is not empty");
    }

    @Test
    public void checkSwiperTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Page is not opened");
        homePage.clickRightSwiper();
        Assert.assertTrue(homePage.isBannerChanged(2), "Second Banner is not visible");
        homePage.clickLeftSwiper();
        Assert.assertTrue(homePage.isBannerChanged(1), "First banner is not visible");
    }


    @Test(enabled = true)
    public void checkContactUsTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Page is not opened");
        ContactUsPage contactUsPage = homePage.getMenu().clickToContactUsBtn();
        Assert.assertTrue(contactUsPage.isPageOpened(), "Page is not opened");
        contactUsPage.typeName("Gigi");
        contactUsPage.typeEmail("Gigi@sd");
        contactUsPage.typeSubject("Ads");
        contactUsPage.typeMessage("Hello world");
        contactUsPage.uploadFile("/Users/gigimamaladze/IdeaProjects/Carina_demo/src/test/resources/image.png");
        contactUsPage.clickSubmitBtn();
        pause(5);
        contactUsPage.getDriver().switchTo().alert().accept();
        Assert.assertTrue(contactUsPage.isMessageSent(), "Message is not sent");

    }

    //------------------------------------------Second Task------------------------------------------------
    @Test
    public void checkSearchTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Page is not opened");
        ProductsPage productsPage = homePage.getMenu().clickProductsBtn();
        Assert.assertTrue(productsPage.isPageOpened(), "Page is not opened");
        String product = "Blue Top";
        productsPage.typeProduct(product);
        productsPage.clickSearchBtnIcon();
        Assert.assertTrue(productsPage.getProducts().isItemPresent(product), "Products is not found");
    }

    @Test
    public void checkProductDetailsPageTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Page is not opened");
        String product = "Blue Top";
        Assert.assertTrue(homePage.getProducts().isItemPresent(product), "item is not exist");
        homePage.getProducts().scrollToItem(product);
        ProductDetailsPage productDetailsPage = homePage.getProducts().clickOnViewProductButton();
        Assert.assertTrue(productDetailsPage.isProductDetailsPageOpened(product), "Products details page is not opened");
    }

    @Test
    public void checkCategoriesTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Page is not opened");
        for (Categories c : Categories.values()) {
            homePage.getCategoriesMenu().scrollToCategoriesList(c);
            homePage.getCategoriesMenu().clickOnCategory(c);
            if (c.getCategory().equals("Women")) {
                for (WomenSubCategories w : WomenSubCategories.values()) {
                    CategoryItemPage womencategoryItemPage = homePage.getCategoriesMenu().clickWomenSubCategory(w);
                    AdBannerUtil.adBannerHandler(womencategoryItemPage.getDriver());
                    Assert.assertTrue(womencategoryItemPage.isWomanCategoriesItemPageOpened(w), "Women categories item page is not opened");
                    womencategoryItemPage.getCategoriesMenu().clickOnCategory(c);
                }
            }
            if (c.getCategory().equals("Men")) {
                for (MenSubCategories m : MenSubCategories.values()) {
                    CategoryItemPage menCategoryItemPage = homePage.getCategoriesMenu().clickMenSubCategory(m);
                    Assert.assertTrue(menCategoryItemPage.isMenCategoriesItemPageOpened(m), "Men categories item page is not opened");
                    menCategoryItemPage.getCategoriesMenu().clickOnCategory(c);
                }
            }
            if (c.getCategory().equals("Kids")) {
                for (KidsSubCategory k : KidsSubCategory.values()) {
                    CategoryItemPage kidCategoryItemPage = homePage.getCategoriesMenu().clickKidsSubCategory(k);
                    Assert.assertTrue(kidCategoryItemPage.isKidsCategoriesPageOpened(k), "Kids categories item page is not opened");
                    homePage.getCategoriesMenu().clickOnCategory(c);
                }
            }

        }
    }

    @Test
    public void checkBrandsTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Page is not opened");
        for (Brands c : Brands.values()) {
            homePage.getBrandsMenu().scrollToBrand(c);
            BrandPage brandPage = homePage.getBrandsMenu().clickBrands(c);
            Assert.assertTrue(brandPage.isBrandPageOpened(c), "Brand page is not opened");
        }
    }


    @Test
    public void checkProductOrderTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Page is not opened");
        SingUpLogInPage singUpLogInPage = homePage.getMenu().clickSingUpLogInBtn();
        Assert.assertTrue(singUpLogInPage.isPageOpened(), "Page is not opened");
        singUpLogInPage.typeEmail(R.TESTDATA.get("email"));
        singUpLogInPage.typePassword(R.TESTDATA.get("password"));
        singUpLogInPage.clickLogInBtn();
        Assert.assertTrue(homePage.getMenu().isAccountDisplayed(R.TESTDATA.get("userName")), "Account is not displayed");
        String product = "Blue Top";
        Assert.assertTrue(homePage.getProducts().isItemPresent(product), "item is not exist");
        homePage.getProducts().scrollToItem(product);
        homePage.getProducts().hoverItem(product);
        AddedProductPopup addedProductPopup = homePage.getProducts().addToCard(product);
        Assert.assertTrue(addedProductPopup.isPageOpened(), "Page is not opened");
        addedProductPopup.clickContinueShoppingBtn();
        homePage.getMenu().scrollToCartBtn();
        CartPage cartPage = homePage.getMenu().clickToCartBtn();
        Assert.assertTrue(cartPage.isItemPresent(product), "Item is not exist");
        CheckOutPage checkOutPage = cartPage.clickProceedToCheckOutBtn();
        Assert.assertTrue(checkOutPage.isPageOpened(), "Check out page is not opened");
        checkOutPage.scrollToPlaceOrderBtn();
        Assert.assertTrue(checkOutPage.isProductPresent(product), "Products is not present");
        PaymentPage paymentPage = checkOutPage.clickToPlaceOrderBtn();
        Assert.assertTrue(paymentPage.isPageOpened(), "Page is not opened");
        paymentPage.typeNameOnCard(R.TESTDATA.get("nameOnCard"));
        paymentPage.typeCardNumber(R.TESTDATA.get("cardNumber"));
        paymentPage.typeCvc(R.TESTDATA.get("cvc"));
        paymentPage.typeMonth(R.TESTDATA.get("month"));
        paymentPage.typeYear(R.TESTDATA.get("year"));
        paymentPage.scrollToSubmitBtn();
        PaymentDonePage paymentDonePage = paymentPage.clickSubmitBtn();
        Assert.assertTrue(paymentDonePage.isPageOpened(), "Page is not opened");

    }

}
