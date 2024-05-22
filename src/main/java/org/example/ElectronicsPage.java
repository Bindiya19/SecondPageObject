package org.example;

import org.openqa.selenium.By;

public class ElectronicsPage extends Utils{
    //click on camera & photo option
    private By _CameraAndPhoto = By.xpath("//a[@title='Show products in category Camera & photo'][normalize-space()='Camera & photo']");

    public void clickOnCameraAndPhoto() {clickOnElement(_CameraAndPhoto);


         }
}
