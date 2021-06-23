package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.List;

public class ComputerPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    @FindBy(linkText = "Desktops")
    WebElement desktopLink;


    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement selectPosition;

    @FindBy(xpath = "//h2[@class='product-title']")
    List<WebElement> productList;

    public void clickOnDesktopsLink() {
        Reporter.log("click on desktoplink " + desktopLink.toString() + "<br>");
        clickOnElement(desktopLink);
        log.info("Clicking on login link : " + desktopLink.toString());
    }

    //parameterize method
    public void selectPositionFromDropdown(int value) {
        Reporter.log("selectPositionFromDrown " + selectPosition.toString() + "<br>");
        selectByIndexFromDropDown(selectPosition, value);
        log.info("select position from drop down: " + selectPosition.toString());
    }

    public List getProductsArrangeInOrder() {
        Reporter.log("Arrange Product on Z to A order " + productList.toString() + "<br>");
        log.info("verify Arrange Product on Z to A order: " + productList.toString());
        return getListOfElements(productList);
    }

}




