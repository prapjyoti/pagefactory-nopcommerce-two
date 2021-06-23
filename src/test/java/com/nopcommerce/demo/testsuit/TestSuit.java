package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.TopMenuPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSuit extends TestBase {

    TopMenuPage topMenuPage;
    HomePage homePage;
    ComputerPage computerPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        homePage = new HomePage();
        topMenuPage = new TopMenuPage();
        computerPage = new ComputerPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void verifyProductArrangeInAlphaBaticalOrder() throws InterruptedException {

        homePage.clickOnComputerLink();
        Thread.sleep(1000);
        computerPage.clickOnDesktopsLink();
        Thread.sleep(2000);
        computerPage.selectPositionFromDropdown(2);
        //buildYourOwnComputerPage.selectposition(2);
        Thread.sleep(2000);


        List<WebElement> products;
        products = computerPage.getProductsArrangeInOrder();
        List<String> productslist = new ArrayList<>();
        for (WebElement productname : products) {
            productslist.add(productname.getText());
        }
        List<String> tempList = new ArrayList<>();
        tempList.addAll(productslist);
        Collections.sort(tempList, Collections.<String>reverseOrder());
        System.out.println(productslist);
        System.out.println(tempList);
        Assert.assertEquals(productslist, tempList);


    }

    @Test(groups = {"smoke", "regression"})
    public void verifyProductAddedToShoppingCartSuccessfully() throws InterruptedException {
        homePage.clickOnComputerLink();
        Thread.sleep(1000);
        computerPage.clickOnDesktopsLink();
        Thread.sleep(1000);
        computerPage.selectPositionFromDropdown(1);
        Thread.sleep(1000);
        buildYourOwnComputerPage.clickOnAddToCart();
        String expectedMessage = "Build your own computer";
        String actualMessage = buildYourOwnComputerPage.buildYourOwnComputerText();
        Assert.assertEquals(actualMessage, expectedMessage);
        Thread.sleep(1000);
        buildYourOwnComputerPage.setSelectProcessorFromDropDownMenu(1);
        Thread.sleep(1000);
        buildYourOwnComputerPage.setSelectRam(3);
        Thread.sleep(1000);
        buildYourOwnComputerPage.clickOnHdd("400 GB [+$100.00]");
        Thread.sleep(1000);
        buildYourOwnComputerPage.clickOnOsRadio("Vista Premium [+$60.00]");
        Thread.sleep(1000);
        buildYourOwnComputerPage.clickOnMicroSoftOffice("Microsoft Office [+$50.00]");
        Thread.sleep(1000);
        buildYourOwnComputerPage.clickOnSoftwareTotalCommander("Total Commander [+$5.00]");
        Thread.sleep(1000);
        String expectedMessage1 = "$1,475.00";
        String actualMessage1 = buildYourOwnComputerPage.setVerifyPrice();
        Assert.assertEquals(actualMessage1, expectedMessage1);
        buildYourOwnComputerPage.setClickAddCartButton();
        Thread.sleep(1000);
        //2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        String expectedMessage2 = "The product has been added to your shopping cart";
        String actualMessage2 = buildYourOwnComputerPage.verifyShoppingCartText();
        Assert.assertEquals(actualMessage2, expectedMessage2);
        Thread.sleep(1000);
        buildYourOwnComputerPage.clickOnCrossGreenBar();


    }

}
