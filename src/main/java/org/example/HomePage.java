package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class HomePage extends Utils{
    private By _clickRegisterButton = By.xpath("//a[@class='ico-register']");

    private By _clickLoginButton = By.className("ico-login");

    private By _clickElectronicsButton = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");

    private By _clickFeaturedProducts = By.linkText("Build your own computer");

    private By _clickComputerButton = By.linkText("Computers");

    private By _clickVoteButton = By.id("vote-poll-1");

    private By _clickSearchButton = By.xpath("//*[@id='small-search-box-form']/button");

    private By _clickOn_F_Logo  = By.linkText("Facebook");

    private By _actualWelcomeMsg = By.xpath("//div[@class='topic-block-title']/h2");

    private By _clickDetailButton = By.xpath("//div[@class='news-items']/div[2]/div[3]/a");

    private By _TypeBrandName = By.id("small-searchterms");

    private By _selectEuroCurrency = By.id("customerCurrency");

    private By _productListContainEuro = By.xpath("//div[@class='product-grid home-page-product-grid']//div[@class='prices']");

    private By _selectUSDollarCurrency = By.id("customerCurrency");

    private By _productListContainUSDollar = By.xpath("//div[@class='product-grid home-page-product-grid']//div[@class='prices']");

    private By _clickHTCAndroidADDTOCARTButton = By.xpath("//div[@class='product-grid home-page-product-grid']/div[2]/div[3]/div[1]/div[2]/div[3]/div[2]/button[1]");

    private By _cliclShoppingCartButton = By.xpath("//a[contains(text(),'shopping cart')]");

    //click on register button from header bar
    public void clickOnRegisterButton(){clickOnElement(_clickRegisterButton);
    }

    //click on login button from header bar
    public void clickOnLoginButton(){clickOnElement(_clickLoginButton);
    }

    //click on electronics button from bar
    public void clickOnElectronicsButton(){clickOnElement(_clickElectronicsButton);
    }

    //click on Build your own computer
    public void featuredProducts(){clickOnElement(_clickFeaturedProducts);
    }

    //click on computer from header bar
    public void clickOnComputerButton(){clickOnElement(_clickComputerButton);
    }

    //click on vote button on home page
    public void clickOnVoteButton(){clickOnElement(_clickVoteButton);
    }

    //method to click on search button on home page
    public void clickSearchButton(){clickOnElement(_clickSearchButton);
    }

    //method to click on HTC One M8 Android's ADD TO CART button
    public void clickOnHTCAndroidADDTOCARTButton(){clickOnElement(_clickHTCAndroidADDTOCARTButton);}

    //method to click on Shopping Cart
    public void clickOnShoppingCart(){clickOnElement(_cliclShoppingCartButton);}

    //method to get text and accept popup alert msg after click on vote
//    public void handleAlertMsg() {
//        //capture msg from alert
//        String actualAlertMessage = getTextFromAlertMsg();
//        //msg from requirement
//        String expectedMsg = "Please select an answer";
//        //to compare the actual and expected msg
//        Assert.assertEquals(actualAlertMessage, expectedMsg, "Your test case is fail.");
//        //to close the popup alert
//        acceptAlert();
//    }

    //method to get text and accept popup alert after click on search
    public void getAlertMsg() {
        //to compare the actual and expected msg
        String actualAlertMessage = getTextFromAlertMsg();//capture msg from alert
        String expectedMsg = "Please enter some search keyword"; //msg from requirement
        Assert.assertEquals(actualAlertMessage, expectedMsg, "Your test case is fail.");

        //to close the popup alert
        acceptAlert();
    }
    //click on f logo under follow us on home page
    public void clickOnFaceBook() {clickOnElement(_clickOn_F_Logo);
    }
    //method to verify WelcomeMsg when back on home page
    public void verifyWelcomeMsg() {
        //assert to compare actual and expected
        String actualWelcomeMsg = getTextFromElement(_actualWelcomeMsg);
        String expectedWelcomeMsg = loadProp.getProperty("ExpectedWelcomeMsg");
        Assert.assertEquals(actualWelcomeMsg,expectedWelcomeMsg, "Message does not match");
    }

    //method to click on detail button under 'nopCommerce new release!'
    public void clickOnDetailButton() {clickOnElement(_clickDetailButton);
    }

    //method to search any Brand in search box
    public void typeBrandName() {typeText(_TypeBrandName,loadProp.getProperty("BrandName"));
    }

    //method to verify when user euro currency all products show euro currency
    public void clickOnEuroCurrency() {selectTextByVisibleText(_selectEuroCurrency, "Euro");
        //show list of product currency element
        List<WebElement> productListContainEuroCurrency = driver.findElements(_productListContainEuro);

        System.out.println(productListContainEuroCurrency.size());

        for (WebElement webelement : productListContainEuroCurrency) {
            Assert.assertNotNull(webelement.getText(), "Product's currency does not match. ");
        }
    }
    //method to verify when user us dollar currency all products show us dollar currency
    public void clickOnUSDollarCurrency () {selectTextByVisibleText(_selectUSDollarCurrency, "US Dollar");
        //show list of product currency element
        List<WebElement> productListContainUSDollarCurrency = driver.findElements(_productListContainUSDollar);

        System.out.println(productListContainUSDollarCurrency.size());

        for (WebElement webelement : productListContainUSDollarCurrency) {
            Assert.assertNotNull(webelement.getText(), "Product's currency does not match. ");
        }
    }
}

