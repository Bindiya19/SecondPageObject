package org.example;

import org.openqa.selenium.By;

public class Opc_BillingAddressPage extends  Utils{

    public void toFillBillingAddressDetail (){
        typeText(By. id("BillingNewAddress_FirstName"),"xyz");
        typeText(By.id("BillingNewAddress_LastName"),"abc");
        typeText(By.id("BillingNewAddress_Email"),"zp@gmail.com");
        selectTextByVisibleText(By.id("BillingNewAddress_CountryId"),"Canada");
        selectTextByVisibleText(By.id("BillingNewAddress_StateProvinceId"),"British Columbia");
        typeText(By.id("BillingNewAddress_City"),"Toronto");
        typeText(By.id("BillingNewAddress_Address1"),"19 Hollend Park");
        typeText(By.name("BillingNewAddress.ZipPostalCode"),"T25ZX");
        typeText(By.name("BillingNewAddress.PhoneNumber"),"1234567890");
        clickOnElement(By.name("save"));
    }
}
