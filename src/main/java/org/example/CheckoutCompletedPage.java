package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CheckoutCompletedPage extends Utils {

    public void checkoutCompletedMsg() {
        String actualMsg = getTextFromElement(By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]"));
        String expectedMsg = "Your order has been successfully processed!";
        Assert.assertEquals(actualMsg, expectedMsg, "Message does not match!");

    }
    public void orderNumIsDisplay(){
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='order-number']/strong[contains(text(),'Order number')]")).isDisplayed(),"ORDER NUMBER IS NOT DISPLAYED!");

    }
}
