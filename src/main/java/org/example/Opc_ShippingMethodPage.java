package org.example;

import org.openqa.selenium.By;

public class Opc_ShippingMethodPage extends Utils {
    public void methodOfShipping(){
        clickOnElement(By.xpath("//input[@id='shippingoption_1']"));
        clickOnElement(By.xpath("//button[@class='button-1 shipping-method-next-step-button']"));
    }
}
