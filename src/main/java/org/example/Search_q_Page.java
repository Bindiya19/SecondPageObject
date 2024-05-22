package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Search_q_Page extends Utils {

    private By _productContainSpecificWords = By.xpath("//div[@class='item-box']//h2");

    //method to find out that all Products Contain searched Word In Title
    public void productsTitleContainSearchedWord(String searchedBrand) {
        //show list of product contains brand name
        List<WebElement> productsContainSearchedWord = driver.findElements(_productContainSpecificWords);

        System.out.println(productsContainSearchedWord.size() + " products contain " + searchedBrand + " word. ");

        for (WebElement webelement : productsContainSearchedWord) {
            Assert.assertTrue(webelement.getText().contains(searchedBrand), "Brand name is missing.");

        }
    }
    public void presentUrlContainSearchedWorld(String searchedBrand){
        Assert.assertEquals(driver.getCurrentUrl().contains(searchedBrand),"Incorrect url!");


    }
}

