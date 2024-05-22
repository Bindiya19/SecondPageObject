package org.example;

import org.openqa.selenium.By;

public class ComputerPage extends Utils{
    private By _DesktopsButton = By.linkText("Desktops");

    //method to click on Desktops button
    public void clickOnDesktops(){clickOnElement(_DesktopsButton);}//By.linkText("Desktops")
}
