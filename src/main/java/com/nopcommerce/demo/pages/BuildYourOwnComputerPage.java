package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BuildYourOwnComputerPage extends Utility {

    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class.getName());

    @FindBy(xpath = "//div[@class='item-box'][1]//button[text()='Add to cart']")
    WebElement addToCart;

    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement buildOwnComputerText;

    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement selectProcessor;

    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement selectRam;

    @FindBy(xpath = "//dd[@id='product_attribute_input_3']//label[text()='400 GB [+$100.00]']")
    WebElement hddRadio;

    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement osRadio;

    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement software;

    @FindBy(xpath = "//input[@id='product_attribute_5_12' and @ name='product_attribute_5']")
    WebElement softwareClick;

    @FindBy(xpath = "//span[@id='price-value-1']")
    WebElement verifyPrice;

    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement clickAddCart;

    @FindBy(xpath = "//p[text()='The product has been added to your ']")
    WebElement verifyShoppingCart;

    @FindBy(xpath = "//span[@class='close']")
    WebElement clickOnGreenBar;


    public void clickOnAddToCart() {
        Reporter.log("click on add to cart " + addToCart.toString() + "<br>");
        clickOnElement(addToCart);
        log.info("Click on add to cart button : " + addToCart.toString());
    }

    public String buildYourOwnComputerText() {
        Reporter.log("Verify User Navigate to Build your own Computer text " + buildOwnComputerText.toString() + "<br>");
        log.info("Click on add to cart button : " + addToCart.toString());
        return getTextFromElement(buildOwnComputerText);

    }

    public void setSelectProcessorFromDropDownMenu(int value) {
        Reporter.log("select the processor from drop down " + selectProcessor.toString() + "<br>");
        selectByIndexFromDropDown(selectProcessor, value);
        log.info("select processor from drop down : " + selectProcessor.toString());
    }

    public void setSelectRam(int value) {
        Reporter.log("select the Ram from drop down " + selectRam.toString() + "<br>");
        selectByIndexFromDropDown(selectRam, value);
        log.info("select ram from drop down : " + selectRam.toString());
    }

    public void clickOnHdd(String HDD) {
        Reporter.log("click On Hdd" + hddRadio.toString() + "<br>");
        clickOnElement(hddRadio);
        log.info("Click on Hdd : " + hddRadio.toString());
    }

    public void clickOnOsRadio(String oSRadio) {
        Reporter.log("click on Os Radio " + osRadio.toString() + "<br>");
        clickOnElement(osRadio);
        log.info("Click on os radio: " + osRadio.toString());


    }

    public void clickOnMicroSoftOffice(String software1) {
        Reporter.log("clicking on MicroSoftOffice" + software.toString() + "<br>");
        clickOnElement(software);
        clickOnElement(software);
        log.info("Click on Microsoftoffice :" + hddRadio.toString());
    }

    public void clickOnSoftwareTotalCommander(String software2) {
        Reporter.log("click on Total Commander" + softwareClick.toString() + "<br>");
        clickOnElement(softwareClick);
        log.info("Click on Total commander :" + addToCart.toString());

    }

    public String setVerifyPrice() {
        Reporter.log("verify Price $1475.00 " + verifyPrice.toString() + "<br>");
        log.info("Verify price : " + addToCart.toString());
        return getTextFromElement(verifyPrice);

    }

    public void setClickAddCartButton() {
        Reporter.log("click add to cart " + clickAddCart.toString() + "<br>");
        clickOnElement(clickAddCart);
        log.info("Click on add to cart : " + clickAddCart.toString());
    }

    public String verifyShoppingCartText() {
        Reporter.log("verify Shopping Cart Text" + verifyShoppingCart.toString() + "<br>");
        log.info("Click on shopping cart text :" + verifyShoppingCart.toString());
        return getTextFromElement(verifyShoppingCart);

    }

    public void clickOnCrossGreenBar() {
        Reporter.log("Click on Cross On Green Bar " + clickOnGreenBar.toString() + "<br>");
        clickOnElement(clickOnGreenBar);
        log.info("Click on Green Bar : " + clickOnGreenBar.toString());
    }

}