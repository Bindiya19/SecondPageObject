package org.example;

import org.openqa.selenium.By;

public class Opc_PaymentMethodPage extends Utils{
    public void selectPaymentMethod(){
        clickOnElement(By.id("paymentmethod_1"));

       // acceptAlert();
        clickOnElement(By.xpath("//div[@id='checkout-step-payment-method']/div[1]/button[1]"));
    }
}
