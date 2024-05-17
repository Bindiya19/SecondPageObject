package org.example;

import org.openqa.selenium.By;

public class Opc_ConfirmOrderPage extends Utils {
    public void toConfirmOrder(){
        clickOnElement(By.xpath("//button[@onclick='if (!window.__cfRLUnblockHandlers) return false; ConfirmOrder.save()']"));
    }

}
