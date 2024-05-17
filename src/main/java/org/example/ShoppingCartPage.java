package org.example;

import org.openqa.selenium.By;

public class ShoppingCartPage extends Utils {
    private By _clickTermAndCondition = By.id("termsofservice");

    private By _clickOnCheckoutButton = By.xpath("//button[@id='checkout']");
    //method
    public void toCheckout(){
        //to tick term and condition
        clickOnElement(_clickTermAndCondition);
        //to click on checkout button
        clickOnElement(_clickOnCheckoutButton);
    }

}
