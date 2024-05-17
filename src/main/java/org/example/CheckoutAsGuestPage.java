package org.example;

import org.openqa.selenium.By;

public class CheckoutAsGuestPage extends Utils {
    // to click on checkout As Guest button
    private By _clickOnCheckoutAsGuest = By.xpath("//button[contains(text(),'Checkout as Guest')]");
    public void  clickOnCheckoutAsGuest(){clickOnElement(_clickOnCheckoutAsGuest);
    }

}
