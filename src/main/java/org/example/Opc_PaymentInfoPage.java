package org.example;

import org.openqa.selenium.By;

public class Opc_PaymentInfoPage extends Utils{

    public void selectPymentInfo(){
        selectTextByVisibleText(By.id("CreditCardType"),"Visa");
        typeText(By.id("CardholderName"),"xyz");
        typeText(By.id("CardNumber"),"4111111111111111");
        selectTextByVisibleText(By.name("ExpireMonth"),"12");
        selectTextByVisibleText(By.name("ExpireYear"),"2025");
        typeText(By.id("CardCode"),"345");
        clickOnElement(By.xpath("//button[@onclick='if (!window.__cfRLUnblockHandlers) return false; PaymentInfo.save()']"));
    }
}
