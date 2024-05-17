package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Search_q_Page extends Utils{
    private By _productContainSpecificWords = By.xpath("//div[@class='item-box']//h2");

    //method to find out that all Products Contain Specific Word In Title
    public void productsTitleContainSearchedWord(){
        //show list of product title element
        List<WebElement> productsContainSearchWord = driver.findElements(_productContainSpecificWords);

        String searchedBrand = loadProp.getProperty("BrandName");
        System.out.println(productsContainSearchWord.size()+" products contain "+searchedBrand+" word. ");

        //String[] titleContainBrandName={"Nike Floral Roshe Customized Running Shoes","Nike SB Zoom Stefan Janoski \"Medium Mint\"","Nike Tailwind Loose Short-Sleeve Running Shirt"
        for (WebElement webelement:productsContainSearchWord){
            Assert.assertTrue(webelement.getText().contains(searchedBrand),"Brand name is missing.");

            //assert to verify Url
            //String actualNikeUrl = driver.getCurrentUrl();//driver will capture current url
            //String expectedNikeUrl = loadProp.getProperty("ExpectedNikeUrl");//required url
            Assert.assertTrue(driver.getCurrentUrl().contains(searchedBrand),"Incorrect Url!");
        }
    }
}
