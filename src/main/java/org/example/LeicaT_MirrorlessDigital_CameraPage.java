package org.example;

import org.openqa.selenium.By;

public class LeicaT_MirrorlessDigital_CameraPage extends Utils {
    private By _clickOnEmailAFriend = By.xpath("//button[normalize-space()='Email a friend']");

    //method to click on email a friend
    public void emailAFriend() {clickOnElement(_clickOnEmailAFriend);
    }
}
