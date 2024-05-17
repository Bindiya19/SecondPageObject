package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResultPage extends Utils {
    private By _verifyRegistrationMsg = By.className("result");

    public void userShouldBeAbleTOGetRegisterMsg() {
        //verify correct registration msg display
        String actualMsg = getTextFromElement(_verifyRegistrationMsg);
        // expected msg as requirement.
        String expectedRegisterMsg =loadProp.getProperty("ExpectedRegisterMsg");//"Your registration completed";
        Assert.assertEquals(actualMsg,expectedRegisterMsg,"your test case is fail.");
    }
}
