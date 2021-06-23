package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.TopMenuPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {

    TopMenuPage topMenuPage;
    HomePage homePage;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        homePage = new HomePage();
        topMenuPage = new TopMenuPage();
    }


    @Test(groups = {"sanity", "smoke", "regression"})
    public void verifyUserShouldNavigateToComputerPage() throws InterruptedException {
        Thread.sleep(1000);
        topMenuPage.selectMenu("Computers");
        String expectedMessage = "Computers";
        String actualMessage = topMenuPage.verifyComputerPages();
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test(groups = {"smoke", "regression"})

    public void verifyUserShouldNavigateToElectronicsPage() throws InterruptedException {
        topMenuPage.selectMenu("Electronics");
        String expectedMessage1 = "Electronics";
        String actualMessage1 = topMenuPage.verifyElectronicsPages();
        Assert.assertEquals(actualMessage1, expectedMessage1);
    }

    @Test(groups = "regression")
    public void verifyUserShouldNavigateToApparel() throws InterruptedException {
        topMenuPage.selectMenu("Apparel");
        String expectedMessage2 = "Apparel";
        String actualMessage2 = topMenuPage.verifyApparelPages();
        Assert.assertEquals(actualMessage2, expectedMessage2);
    }

    @Test(groups = "regression")
    public void verifyUserShouldNavigateToDigitalDownloads() throws InterruptedException {

        topMenuPage.selectMenu("Digital downloads");
        String expectedMessage3 = "Digital downloads";
        String actualMessage3 = topMenuPage.verifyDigitalDownload();
        Assert.assertEquals(actualMessage3, expectedMessage3);
    }

    @Test(groups = "regression")
    public void verifyUserShouldNavigateToBooks() throws InterruptedException {
        topMenuPage.selectMenu("Books");
        String expectedMessage4 = "Books";
        String actualMessage4 = topMenuPage.verifyBooksPages();
        Assert.assertEquals(actualMessage4, expectedMessage4);
    }

    @Test(groups = "regression")
    public void verifyUserShouldNavigateToJewelry() throws InterruptedException {
        topMenuPage.selectMenu("Jewelry");
        String expectedMessage5 = "Jewelry";
        String actualMessage5 = topMenuPage.verifyJewelryPages();
        Assert.assertEquals(actualMessage5, expectedMessage5);
    }
  //This method fail for screen sort
    @Test(groups = "regression")
    public void verifyUserShouldNavigateToGiftCards() throws InterruptedException {
        topMenuPage.selectMenu("Gift Cards");
        String expectedMessage6 = "Gift Card";
        String actualMessage6 = topMenuPage.verifyGiftCardsPages();
        Assert.assertEquals(actualMessage6, expectedMessage6);

    }
}
















