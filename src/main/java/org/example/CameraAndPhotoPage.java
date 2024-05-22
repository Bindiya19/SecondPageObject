package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class CameraAndPhotoPage extends Utils{
    private By _LeicaTMirrorDigitalCamera = By.xpath("//*[text()='Leica T Mirrorless Digital Camera']");

    private By _displayedAddToCartButtons = By.xpath("//button[@class='button-2 product-box-add-to-cart-button']");

    public void clickOnT_MirrorDigitalCamera() {
        clickOnElement(_LeicaTMirrorDigitalCamera);}

    //click on Leica T Mirrorless Digital Camera
    //By.xpath("//*[text()='Leica T Mirrorless Digital Camera']")

    public void eachProductShouldHaveAAddToCartButton()
    {
        //show list of product title element
        List<WebElement> displayedAddToCartButtons = driver.findElements(_displayedAddToCartButtons);
        //to print number of add to cart button is display
        System.out.println(displayedAddToCartButtons.size()+" Products have 'ADD TO CART' button.");

        for (WebElement webelement:displayedAddToCartButtons)
            Assert.assertNotNull(webelement.getText(), "One of the product missing ADD TO CART: "+webelement.getText());
        System.out.println("2nd Product is missing Add To Cart Button.");
    }
}
